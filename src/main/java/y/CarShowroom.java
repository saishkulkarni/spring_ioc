package y;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarShowroom {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(MyClass.class);

		System.out.println(container.getBean("car"));

	}
}
