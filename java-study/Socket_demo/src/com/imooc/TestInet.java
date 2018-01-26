package com.imooc;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInet {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());

		byte[] bytes = address.getAddress();
		System.out.println(Arrays.toString(bytes));

		// InetAddress address2 = InetAddress.getByName("bogon") ;
		InetAddress address2 = InetAddress.getByName("192.168.1.204");

		System.out.println(address2.getHostName());
		System.out.println(address2.getHostAddress());

	}

}
