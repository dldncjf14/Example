package sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MessageMain {
	public static void main(String[] args) {
		
		/*MessageBeanImpl mb = new MessageBeanImpl("����");
		mb.setGreeting("�ȳ�");
		mb.sayHello();*/
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		MessageBeanImpl msg = (MessageBeanImpl)factory.getBean("msg");
		msg.sayHello();
	}
}
