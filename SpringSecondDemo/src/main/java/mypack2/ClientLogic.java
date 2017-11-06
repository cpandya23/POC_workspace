package mypack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("config2.xml");
	Customer c= (Customer) context.getBean("CustomerBean");
	/*c.setCustomerId(1245);*/
	
	System.out.println(c);
	/*Customer c1= (Customer) context.getBean("CustomerBean");
	System.out.println(c1);*/
}
}
