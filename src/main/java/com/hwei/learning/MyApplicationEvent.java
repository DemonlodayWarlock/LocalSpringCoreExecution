package com.hwei.learning;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent{

	public MyApplicationEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return MyApplicationEvent.class + " is been listened by Spring Application Listener!";
	}

}
