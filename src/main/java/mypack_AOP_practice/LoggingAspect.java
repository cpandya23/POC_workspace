package mypack_AOP_practice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@AfterThrowing(pointcut="execution(* mypack_AOP_practice.Customer.validateAge(..))", throwing="err")
	public void displayException(Exception err) {
		System.out.println("Exception in Advice"+err.toString());
	}
}
