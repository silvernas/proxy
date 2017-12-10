package com.imooc.jdkproxy;

import com.imooc.proxy.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by SILVERNAS on 2017/12/8.
 */
public class TimeHandler implements InvocationHandler {
	private Object target;

	public TimeHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。。");
		method.invoke(target);
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶。。。。"+
				"汽车一共行驶了"+(endtime-starttime)+"毫秒");


		return null;
	}
}
