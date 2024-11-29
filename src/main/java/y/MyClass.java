package y;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class MyClass {

	@Bean
	String hello() {
		return "Hello";
	}
	
	@Bean
	List getList() {
		return Arrays.asList(1,2,5,3,6,5,7);
	}
}
