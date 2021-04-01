package example2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		
		/*Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		*/
		
		ApplicationContext factory = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		ServiceImpl sv = (ServiceImpl) factory.getBean("sv");
		sv.order();
		sv.remove();
	}
}
