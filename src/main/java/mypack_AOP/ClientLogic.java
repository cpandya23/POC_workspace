package mypack_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
public static void main(String[] args)  {
	//ApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass_c.class);
	ApplicationContext context1= new AnnotationConfigApplicationContext(ConfigClass_ComponentScan.class);
	Employee e= (Employee) context1.getBean("employee");
	e.setEname("Chintan main");
	try {
		System.out.println("main "+e.display());
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		System.out.println("Exception in main");
	}
	
	e.setRole("sse");
	String role= e.getRole();
	System.out.println(e.calculateSalary(role));
	//System.out.println("main "+e.getEname());
}
}
