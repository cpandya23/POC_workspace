package mypack_Exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mypack_AOP_practice.ConfigClass_ComponentScan;

public class ClientClass {
	public static void main(String[] args) {
		//ApplicationContext context= new ClassPathXmlApplicationContext("config_annotations_exercise.xml");
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		
		Employee e= (Employee)context.getBean("employee");
		
		System.out.println(e);
		
		Address a= e.getResidentAddress();
		a.setAddressId(2);
		a.setCity("Pune");
		a.setStreet("BR");
		a.setPincode(364002);
		e.setResidentAddress(a);
		System.out.println(e);
	}
}
