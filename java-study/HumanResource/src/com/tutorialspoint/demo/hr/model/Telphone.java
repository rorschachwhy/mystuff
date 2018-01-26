package com.tutorialspoint.demo.hr.model;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	int var;


	public float getCpu() {
		return cpu;
	}

	public void setCpu(float newCpu) {
		cpu = newCpu;
	}

	public float getScreen() {
		return screen;
	}

	public void setScreen(float screen) {
		this.screen = screen;
	}

	public Telphone() {
		System.out.println(" 无参数构造方法");
	}

	public Telphone(float newScreen, float newCpu, float newMem) {
		if (newScreen < 3.5f) {
			setScreen(3.5f);
			System.out.println("参数有误，赋值为3.5");
		} else {
			setScreen(newScreen);
			System.out.println("screen为：" + getScreen());
		}
		System.out.println("有参数构造方法" + getScreen());
	}

	void call() {
		int var = 10;
		System.out.println("Telphone有打电话的功能！");
		System.out.println("var:" + var);
	}

	void sendMessage() {
		System.out.println("screen" + getScreen() + "cpu" + cpu + "mem" + getMem() + "Telphone有发短信的功能！");
	}

	public float getMem() {
		return mem;
	}

	public void setMem(float mem) {
		this.mem = mem;
	}

}
