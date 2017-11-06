package mypack;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// Inversion of control
		WelcomeBean wb = (WelcomeBean) context.getBean("welcomeBean");
		wb.show();

		CustomerBean c = (CustomerBean) context.getBean("customerBean");
		c.setCustomerId(1);
		c.setCustomerName("xyz");
		c.display();
		//Another customer
		/*
		CustomerBean2 c2 = (CustomerBean2) context.getBean("customerBean2");
		System.out.println(c2);*/

		// Constructor Injection
		
		Employee emp = (Employee) context.getBean("employeeBean");
		System.out.println(emp);

		// Setter Injection
		Employee emp2 = (Employee) context.getBean("employeeBean2");
		System.out.println(emp2);
		
		
		Employee emp3 = (Employee) context.getBean("employeeBean3");
		System.out.println(emp3);
		
		/*
		Employee emp4 = (Employee) context.getBean("employeeBean4");
		System.out.println(emp4);

		Employee emp5 = (Employee) context.getBean("employeeBean5");
		System.out.println(emp5);
		*/
	
	}
}
