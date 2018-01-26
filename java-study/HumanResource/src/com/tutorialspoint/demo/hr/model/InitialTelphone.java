package com.tutorialspoint.demo.hr.model;
import com.tutorialspoint.demo.hr.model2.*;
public class InitialTelphone {

	public static void main(String[] args) {
		Telphone phone = new Telphone();
		// phone.sendMessage();
		//
		// phone.screen = 5.0f;
		// phone.cpu = 1.4f;
		// phone.mem = 2.0f;
		// // phone.call();
		// phone.setCpu(1.5f);
		// System.out.println(phone.getCpu());
		
		phone.setCpu(7f);
		// 创建一个空的StringBuilder对象
		StringBuilder str = new StringBuilder();        
		// 追加字符串
		str.append("jaewkjldfxmopzdm");		
        // 从后往前每隔三位插入逗号
		for (int i = str.length()-3;i > 0;i = i - 3){
    	 str.insert(i,',');   
		}
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
		
		
		// 创建一个空的StringBuilder对象
		StringBuilder str1 = new StringBuilder();
		// 追加字符串
		str1.append("jaeqaaa");

		// 从后往前每隔三位插入逗号
		int a = str1.length() % 3 == 0 ? str1.length() / 3 - 1 : str1.length() / 3;
		int l = str1.length() + a;
		System.out.println(str1.length());
		System.out.println(a);
		System.out.println(l);
		for (int i = l / 4; i >0 ; i--) {
			System.out.println(l - 4 * i);

			str1.insert(l - 4 * i, ',');
		}
		// 将StringBuilder对象转换为String对象并输出
		System.out.print(str1.toString());
	}

}
