package com.hwei.learning;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Circle implements ApplicationEventPublisherAware {
	
	private Point center;
	
	private ApplicationEventPublisher publisher;
	
	public Point getCenter() {
		return center;
	}
	
	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	public void run() {
		System.out.println("PointA ("+center.getX()+","+center.getY()+")");
		MyApplicationEvent event = new MyApplicationEvent(this);
		publisher.publishEvent(event);
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.publisher = applicationEventPublisher;
		
	}




	


}
