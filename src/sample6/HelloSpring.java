package sample6;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("sample6/bean.xml");
		
		MessageBean bean = (MessageBean) context.getBean("bean");
		bean.helloCall();
		
		context.close();
	}
}
