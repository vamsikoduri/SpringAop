package org.javabrains.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String org.javabrains.model.Circle.getName())")
	public void LoggingAdvice() {
		System.out.println("Adivce Run. Get Method Called");

	}
}
