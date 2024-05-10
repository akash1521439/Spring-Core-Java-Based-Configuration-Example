package com.spring.xmlbased;

public class Twitter implements Message{

	@Override
	public void sendMessage(String m) {
		System.out.println(m);
	}

}
