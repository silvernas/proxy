package com.imooc.proxy;

/**
 * Created by SILVERNAS on 2017/12/8.
 */
public class Car2 extends Car {
	public void move(){
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。。");
		super.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶。。。。"+
		"汽车一共行驶了"+(endtime-starttime)+"毫秒");
	}
}
