package com.imooc.proxy;

import java.util.Random;

/**
 * Created by SILVERNAS on 2017/12/8
 */
public class Car implements Moveable {

	@Override
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中。。。。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
