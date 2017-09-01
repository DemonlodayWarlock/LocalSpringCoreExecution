package com.hwei.learning;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class DrawApp implements ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean{
	
	@Autowired
	private Point pointA;
	@Autowired
	private Point pointB;
	@Autowired
	private Point pointC;
	
	private ApplicationContext context;
	
	/*private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}*/
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void run() {
		
		/*for(Point point:points) {
			System.out.println("Point ("+point.getX()+","+point.getY()+")");
		}*/
		//System.out.println(getShape()+" Lest's run it!" + getHeight());
		System.out.println("PointA ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("PointB ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("PointC ("+getPointC().getX()+","+getPointC().getY()+")");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is: "+beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;	
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean after context load...");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Bean after context load...");
		
	}
	
	public void initialize() {
		System.out.println("Self initializing...");
	}
	
	public void cleanUp() {
		System.out.println("Self Destroy...");
	}


}
