package com.anlw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		HelloIoc hw = (HelloIoc) context.getBean("hw");
		hw.show();
	}
}