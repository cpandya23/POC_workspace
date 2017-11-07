package mypack_AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("mypack_AOP")
@EnableAspectJAutoProxy
public class ConfigClass_ComponentScan {

}
