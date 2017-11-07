package mypack_AOP_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
public static void main(String[] args)  {
	//ApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass_c.class);
	ApplicationContext context1= new AnnotationConfigApplicationContext(ConfigClass_ComponentScan.class);
	Customer e= (Customer) context1.getBean("customer");
	
	try {
		e.validateAge(2);
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		System.out.println("Exception in main");
	}
	

}
}
