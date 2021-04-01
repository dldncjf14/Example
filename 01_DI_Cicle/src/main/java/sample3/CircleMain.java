package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CircleMain {

	public static void main(String[] args) {
		/*
		 * double radius = 10.0; Point point = new PointImpl();
		 * 
		 * point.setXpos(3.0); point.setYpos(4.0);
		 * 
		 * Circle circle = new CircleImpl(radius, point);
		 */
		Resource resource = new ClassPathResource("applicationContext.xml"); //bean이 저장된 applicationContext 가져옴
		
		BeanFactory factory = new XmlBeanFactory(resource); //bean 이 저장된 xmlbean 을 factory 타입의 변수에 저장
		
		Point point = (Point) factory.getBean("point");
		System.out.println("point : "+point.getXpos()+","+point.getYpos());
		Circle circle = (Circle) factory.getBean("circle");
		
		circle.display();

	}

}
