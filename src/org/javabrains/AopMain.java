package org.javabrains;

import org.javabrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String args[])
	{
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		 ShapeService service = ctx.getBean("shapeService",ShapeService.class);
		// service.getCircle().setAndReturnName("vamsi");
		 
		 service.getCircle().setName("vamsi");
		 
		// System.out.println(service.getCircle().getName());
		 
	}
	
}
