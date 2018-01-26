package com.imooc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		try {
			//1.创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
			ServerSocket serverSocket = new ServerSocket(8888);
			Socket socket = null;
			//记录客户端的数量
			int count = 0;

			System.out.println("-------服务器即将启动，等待客户端链接-------");
			//循环监听等待客户端的连接
			while (true) {
				//调用accept()方法开始监听，等待客户端的连接
				socket = serverSocket.accept();
				//创建一个新的线程
				TCPServerThread serverThread = new TCPServerThread(socket);
				//启动线程
				serverThread.start();

				count++;//统计客户端的数量
				System.out.println("客户端的数量" + count);
				InetAddress address = socket.getInetAddress();
				System.out.println("当前客户端的ip和名称" + address.getHostAddress() + address.getHostName());
			}

			//
			// // 通过URL的openStream方法获取URL对象所表示的资源的字节输入流
			// InputStream is = socket.getInputStream();
			// // 将字节输入流转换为字符输入流
			// InputStreamReader isr = new InputStreamReader(is);
			// BufferedReader br = new BufferedReader(isr);
			//
			// String info = null;
			// while ((info = br.readLine()) != null) {
			// System.out.println("我是服务器，客户端说：" + info);
			// }
			//
			// socket.shutdownInput();
			//
			// //输出流
			// OutputStream os = socket.getOutputStream();
			// PrintWriter pw = new PrintWriter(os);
			// pw.write("欢迎您");
			// pw.flush();
			//
			// socket.shutdownOutput();
			//
			// pw.close();
			// os.close();
			// br.close();
			// isr.close();
			// is.close();
			// socket.close();
			// serverSocket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
