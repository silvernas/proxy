package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by SILVERNAS on 2017/12/8
 */
public class LogHandler implements InvocationHandler {
	private Object target;

	public LogHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("日志记录开始。。。");
		method.invoke(target);
		System.out.println("日志记录结束。。。");
		return null;
	}
}
