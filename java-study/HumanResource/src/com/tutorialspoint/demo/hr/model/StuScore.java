package com.tutorialspoint.demo.hr.model;

import java.util.Scanner;

public class StuScore {
	public static void main(String[] args) {
		int classNum = 3;
		int stuNum = 4;
		int sum = 0;
		double avg = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= classNum; i++) {
			sum = 0;
			System.out.println("第" + i + "个班级的信息");
			for (int j = 1; j <= stuNum; j++) {
				System.out.println("请输入第" + j + "个同学的成绩");
				sum += input.nextInt();
			}
			avg = sum / stuNum;
			System.out.println("第" + i + "个班级的平均分：" + avg);
		}

	}
}
