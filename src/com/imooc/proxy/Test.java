package com.imooc.proxy;

/**
 * Created by SILVERNAS on 2017/12/8.
 */
public class Test {
	public static void main(String[] args) {
//
		Car car=new Car();
		Moveable m=new Car3(car);
		m.move();
	}
}
