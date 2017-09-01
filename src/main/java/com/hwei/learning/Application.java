package com.hwei.learning;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Application{
	
	private ApplicationContext context;
	
	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//DrawApp app = (DrawApp)factory.getBean("drawapp");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		System.out.println("Context:"+context.getDisplayName());
		context.registerShutdownHook();
		Circle app = (Circle)context.getBean("circle");
		app.run();

	}

}
