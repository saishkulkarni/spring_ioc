package x;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Factory {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("x/x.xml");

		Mobile mobile1 = container.getBean(Mobile.class);
		System.out.println(mobile1);
		Mobile mobile2 = container.getBean(Mobile.class);
		System.out.println(mobile2);
		Mobile mobile3 = container.getBean(Mobile.class);
		System.out.println(mobile3);
	}
}
