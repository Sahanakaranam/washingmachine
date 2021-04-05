package com.xworkz.washingmachine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WashTester {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("wash.xml");
		WashingMachine washingMachine = container.getBean(WashingMachine.class);

		washingMachine.wash();
		washingMachine.displayDetail();
		System.out.println("beans created" + " " + container.getBeanDefinitionCount());

	}
}