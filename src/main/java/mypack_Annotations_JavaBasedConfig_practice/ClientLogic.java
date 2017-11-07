package mypack_Annotations_JavaBasedConfig_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass_ComponentScan.class);
	//ApplicationContext context1= new AnnotationConfigApplicationContext(ConfigClass_ComponentScan.class);
	Customer c= (Customer) context.getBean("customer");
	System.out.println(c);
}
}
