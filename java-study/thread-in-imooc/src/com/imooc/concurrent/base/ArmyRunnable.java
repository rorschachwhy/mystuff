package com.imooc.concurrent.base;

//军队线程
//模拟作战双方的行为
public class ArmyRunnable implements Runnable {

	// volatile保证了线程可以正确的读取其他线程写入的值
	// 可见性ref JMM，happens-before原则
	volatile boolean keepRunning = true;

	// public static void main(String[] args){
	// ArmyRunnable ar = new ArmyRunnable();
	// Thread t = new Thread(ar);
	// t.start();
	// }
	
	@Override
	public void run() {
		while (keepRunning) {
			// 发动5次攻击
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "进攻对方[" + i + "]");
				// 让出了处理器时间，下次谁攻击还不一定呢！
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName() + "结束了战斗！");
	}

}
