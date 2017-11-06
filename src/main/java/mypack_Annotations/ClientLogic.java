package mypack_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("config_annotations.xml");
	Employee e= (Employee) context.getBean("employeeBean");
	System.out.println(e);
}
}
