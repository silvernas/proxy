package com.imooc.jdkproxy;

import com.imooc.proxy.Car;
import com.imooc.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by SILVERNAS on 2017/12/8
 */
public class Test {
	public static void main(String[] args) {
		Car car=new Car();

		InvocationHandler h1=new TimeHandler(car);

		Class<?> cls1=car.getClass();


		Moveable m1= (Moveable) Proxy.newProxyInstance(cls1.getClassLoader(),cls1.getInterfaces(),h1);
		InvocationHandler h2=new LogHandler(m1);
		Class<?> cls2=m1.getClass();
		Moveable m2= (Moveable) Proxy.newProxyInstance(cls2.getClassLoader(),cls2.getInterfaces(),h2);
		m2.move();
	}
}
