package mypack_Annotations_ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("config_annotations2.xml");
	Employee e= (Employee) context.getBean("employee");
	System.out.println(e);
}
}
