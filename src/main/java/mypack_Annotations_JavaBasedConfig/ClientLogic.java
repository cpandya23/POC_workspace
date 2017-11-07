package mypack_Annotations_JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass.class);
	//ApplicationContext context1= new AnnotationConfigApplicationContext(ConfigClass_ComponentScan.class);
	Employee e= (Employee) context.getBean("employee");
	System.out.println(e);
}
}
