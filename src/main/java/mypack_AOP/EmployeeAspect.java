package mypack_AOP;

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
public class EmployeeAspect {
	@Before("execution (* mypack_AOP.Employee.display(..))")
	public void beforeAdvice() {
		System.out.println("Before Advice");
	}
	
	@After("execution (* mypack_AOP.Employee.display(..))")
	public void afterAdvice() {
		System.out.println("After Advice");
		System.out.println("Data Updated on");
		System.out.println(java.time.LocalDate.now());  
		System.out.println(java.time.LocalTime.now());
	}
	
	@AfterReturning(pointcut="execution (* mypack_AOP.Employee.get*(..))",returning="rvalue")
	public void displayEid(String rvalue) {
		System.out.println("Advice "+rvalue);
	}
	
	@AfterThrowing(pointcut="execution (* mypack_AOP.Employee.display(..))",throwing="ex")
	public void displayException(Exception ex) {
		System.out.println("Exception in Advice "+ex.toString());
	}
	
	@Around("execution (* mypack_AOP.Employee.calculateSalary(String))")
	public double PerformanceIncentive(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Before Joinpoint");
		Object retVal= pjp.proceed();
		System.out.println("After Joinpoint");
		double salary= ((Double)retVal).doubleValue();
		Object args[]=pjp.getArgs();
		if(args[0].equals("manager")) {
			salary=salary + 0.20*salary;
		}
		else {
			salary=salary + 0.10*salary;
		}
		
		return salary;
	}
}
