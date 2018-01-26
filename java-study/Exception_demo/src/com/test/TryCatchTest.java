package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest {

	public static void main(String[] args) {
		TryCatchTest tct = new TryCatchTest();
		int result = tct.test();
		System.out.println("test（）方法执行完毕！返回值为" + result);
	}

	private int test() {
		int divider = 10;
		int result = 100;
		try {
			while (divider > -1) {
				divider--;
				result += 100 / divider;
			}
			// return result;
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("循环异常抛出了");

			// return -1;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			System.out.println("finally");
		}
		System.out.println("finally");
		return 99;

	}

}
