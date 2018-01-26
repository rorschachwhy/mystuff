package com.test;

public class ChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
		try {
			ct.test2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void test1() throws DrunkException {
		// TODO Auto-generated method stub
		throw new DrunkException("第一次First");
	}
	
	private void test2() {
		// TODO Auto-generated method stub
		try {
			test1();
		} catch (DrunkException e) {
			// TODO Auto-generated catch block
			RuntimeException exc = new RuntimeException(e);
//			exc.initCause(e);
			throw exc;
		}
	}
}
