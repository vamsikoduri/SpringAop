package org.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void LoggingAdvice() {
		System.out.println("Adivce Run. Get Method Called");

	}

	@Before("allGetters()")
	public void SecondLoggingAdvice() {
		System.out.println("Second Adivce Run. Get Method Called");

	}

	@Pointcut("execution(* get*(..))")
	public void allGetters() {
	}
}
