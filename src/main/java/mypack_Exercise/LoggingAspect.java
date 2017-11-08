package mypack_Exercise;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@AfterReturning("execution (* mypack_Exercise.Employee.set*(..))")
	public void displayLogs() {
		System.out.println("Data Updated on");
		System.out.println(java.time.LocalDate.now());  
		System.out.println(java.time.LocalTime.now());
		
		
	}
}
