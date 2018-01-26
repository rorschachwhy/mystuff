package com.imooc.office;
//package com.imooc.office;
//命令行执行不加包声明

public class OfficeBetter {

	public static void main(String[] args) {
		try {
			// 动态加载类，在运行时刻加载
			Class c = Class.forName(args[0]);
			OfficeAble oa = (OfficeAble) c.newInstance();
			oa.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
