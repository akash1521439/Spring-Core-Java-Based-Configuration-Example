package com.spring.xmlbased;

public class MessageProcessorImpl implements MessageProcessor{
	
	Message message;
	
	public void setMessage(Message msg) {
		this.message = msg;
	}

	@Override
	public void processMessage(String m) {
		// TODO Auto-generated method stub
		message.sendMessage(m);
	}

}
