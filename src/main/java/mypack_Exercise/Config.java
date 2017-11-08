package mypack_Exercise;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("mypack_Exercise")
@EnableAspectJAutoProxy
public class Config {

	@Bean
	public Employee getEmployeeBean() {
		Employee e= new Employee();
		e.setOfficeAddress(getOfficeAddressBean());
		e.setResidentAddress(getResidentAddressBean());
		
		return e;
	}
	@Bean
	@Qualifier("officeAddress")
	public Address getOfficeAddressBean() {
		Address e= new Address();
		e.setAddressId(1);
		e.setCity("In Config Class:BVN");
		e.setStreet("KBD");
		e.setCountry("India");
		e.setPincode(411057);
		
		return e;
	}
	@Bean
	@Qualifier("residentAddress")
	public Address getResidentAddressBean() {
		Address e= new Address();
		e.setAddressId(2);
		e.setCity("BVNH");
		e.setStreet("KBDH");
		e.setCountry("IndiaH");
		e.setPincode(364002);
		
		return e;
	}
	
}
