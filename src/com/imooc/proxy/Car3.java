package com.imooc.proxy;

/**
 * Created by SILVERNAS on 2017/12/8
 */
public class Car3 implements Moveable{
	public Car3(Car car){
		super();
		this.car=car;
	}
	private Car car;
	public void move(){
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。。");
		car.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶。。。。"+
				"汽车一共行驶了"+(endtime-starttime)+"毫秒");
	}
}
