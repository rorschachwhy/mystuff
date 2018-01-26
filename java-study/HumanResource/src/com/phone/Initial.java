package com.phone;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone tel1 = new CellPhone();
		tel1.call();
		
		Telphone tel2 = new SmartPhone();
		tel2.call();
		
		IPlayGame gam1 = new SmartPhone();
		IPlayGame gam2 = new Psp();
		
		gam1.palyGame();
		gam2.palyGame();
		
		
		IPlayGame gam3 = new IPlayGame() {
			
			@Override
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现");
			}
		};
		
		gam3.palyGame();
		
		
		new IPlayGame() {
			
			@Override
			public void palyGame() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现2");
			}
		}.palyGame();;
		System.out.println(gam1);
	}
}
