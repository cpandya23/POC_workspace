package mypack_AOP_practice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("mypack_AOP_practice")
@EnableAspectJAutoProxy
public class ConfigClass_ComponentScan {

}
