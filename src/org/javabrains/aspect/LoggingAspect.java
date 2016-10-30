package org.javabrains.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint jpoint) {
		System.out.println(jpoint.toString());

	}

	
	@Before("args(name)")
	public void SetterLoggingAdvice(String name) {
		System.out.println("Setter has been called with the property"+ name);

	}
	
	/*@Before("!allCircleMethods() && allGetters()")
	public void SecondLoggingAdvice() {
		System.out.println("Second Adivce Run. Get Method Called");

	}

	@Pointcut("execution(* get*(..))")
	public void allGetters() {
	}*/
	
	@Pointcut("within(org.javabrains.model.Circle)")
	public void allCircleMethods()
	{
		
	}
}
