package org.javabrains.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class LoggingAspect {

	/*@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint jpoint) {
		System.out.println(jpoint.toString());

	}*/

	/*@After("args(name)")
	public void SetterLoggingAdvice(String name) {
		System.out.println("Setter has been called with the property"+ name);

	}
	
	
	

	@AfterReturning("args(name)")
	public void SetLoggingAdvice(String name) {
		System.out.println("Setter has been called with the property"+ name+" **** AFTER RETURNING ****");

	}
	
	
	@AfterReturning(pointcut="args(name)", returning="returnString")
	public void inputOutPutLogging(String name,String returnString) {
		System.out.println("Setter has been called with the property"+ name+ " and returned property is "+ returnString);

	}
	
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void SetLoggingAdviceDuringError(String name,RuntimeException ex) {
		System.out.println("************ EXCEPTION HAS BEEN THROWN *********"+ ex.toString());

	}*/

	
	
	/*@Before("!allCircleMethods() && allGetters()")
	public void SecondLoggingAdvice() {
		System.out.println("Second Adivce Run. Get Method Called");

	} */

	/*@Pointcut("execution(* get*(..))")
	public void allGetters() {
	}*/
	
	/*@Pointcut("within(org.javabrains.model.Circle)")
	public void allCircleMethods()
	{
		
	}*/
	
	
	

	//@Around("@annotation(org.javabrains.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint joinPoint) {
		Object returnValue = null;
		
		try{
			System.out.println("Before advice");
			returnValue = joinPoint.proceed();
			System.out.println("After advice");
			
		}
		catch(Throwable e)
		{
			System.out.println("After throwing");
		}
		
		System.out.println("After finally");
		return returnValue;
		
	}
	
	
}
