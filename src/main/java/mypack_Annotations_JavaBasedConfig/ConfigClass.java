package mypack_Annotations_JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

	@Bean
	public Address address() {
		Address address= new Address();
		address.setCity("Bhavnagar");
		address.setPincode(123);
		return address;
	}
	@Bean
	public Employee employee() {
		Employee e= new Employee();
		e.setEname("Chintan");
		e.setRole("SSE");
		e.setAddress(address());
		return e;
	}
}
