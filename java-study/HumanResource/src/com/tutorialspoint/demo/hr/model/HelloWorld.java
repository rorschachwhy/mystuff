package com.tutorialspoint.demo.hr.model;

public class HelloWorld {
	public static void main(String[] args)  {


        // 定义一个整型数组，长度为10
		int[] nums = new int[10];
        System.out.println(nums.length);
        //通过循环给数组赋值
		for (int i = 0; i < nums.length; i++) {
            // 产生10以内的随机数
			int x = (int)(Math.random()*10);
            
			nums[i] = x;// 为元素赋值
		}
        
		// 使用foreach循环输出数组中的元素
		for ( int num : nums  ) {
			System.out.print(num + " ");
		}
	}
}
