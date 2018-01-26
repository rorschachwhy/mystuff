package com.phone;

public class SmartPhone extends Telphone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("语音打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("语音发短信");
	}

	@Override
	public void palyGame() {
		// TODO Auto-generated method stub
		System.out.println("phonr玩游戏");
	}

	@Override
	public String toString() {
		return "SmartPhone [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
