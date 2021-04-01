package example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		Consumer cons = new Consumer();
		Car gra = new Granduer();
		Car mor = new Morning();
		cons.setName("Ã¶¼ö");
		cons.setAge(30);
		
		cons.setCar(gra);
		
		System.out.println(cons.getName());
		System.out.println(cons.getAge());
		System.out.println(cons.personDrive());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/example3/context.xml");
		Consumer cons2 = context.getBean("consumer", Consumer.class);
		cons2.setName("Ã¶¼ö");
		cons2.setAge(30);
		
		System.out.println(cons2.getName());
		System.out.println(cons2.getAge());
		System.out.println(cons2.personDrive());
	}
}
