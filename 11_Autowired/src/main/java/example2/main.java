package example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/example2/applicationContext.xml");
		Circle circle = context.getBean("mycircle", Circle.class);
		
		System.out.println(circle.make());
		
		Rectangle rec = context.getBean("myrec", Rectangle.class);
		
		System.out.println(rec.make());
	}

}
