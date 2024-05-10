package com.spring.xmlbased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationCOntext.xml");
		
		MessageProcessor msgProc = context.getBean(MessageProcessorImpl.class);
		msgProc.processMessage("Message from twitter");
		context.close();

	}

}
