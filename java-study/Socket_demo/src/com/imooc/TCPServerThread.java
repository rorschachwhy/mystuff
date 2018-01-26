package com.imooc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 服务器线程处理类
 */
public class TCPServerThread extends Thread {
	// 和本线程相关的Socket
	private Socket socket = null;

	public TCPServerThread(Socket socket) {
		super();
		this.socket = socket;
	}

	// 线程执行的操作，响应客户端的请求
	public void run() {

		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		String info = null;
		OutputStream os = null;
		PrintWriter pw = null;

		try {
			// 获取输入流，并读取客户端信息
			is = socket.getInputStream();
			// 将字节输入流转换为字符输入流
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			// 循环读取客户端的信息
			while ((info = br.readLine()) != null) {
				System.out.println("我是服务器，客户端说：" + info);
			}
			// 关闭输入流
			socket.shutdownInput();

			// 获取输出流，响应客户端的请求
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			pw.write("欢迎您");
			pw.flush();// 调用flush()方法将缓冲输出

			socket.shutdownOutput();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭资源
			try {
				if (pw != null)
					pw.close();
				if (os != null)
					os.close();
				if (br != null)
					br.close();
				if (isr != null)
					isr.close();
				if (is != null)
					is.close();
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
