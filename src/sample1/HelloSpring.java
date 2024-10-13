package sample1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloSpring {
/*	// 1. 객체 생성 : new 사용
	public static void main(String[] args) {
		MessageBeanImpl beanImpl = new MessageBeanImpl("딸기");
		beanImpl.setCost(5000);
		beanImpl.sayHello();
		beanImpl.sayHello("바나나", 6000);
	}*/
	
	// 2. 객체 생성 : bean 객체 사용
	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("sample1/bean.xml");
		// 2. bean 객체 얻어오기
		MessageBeanImpl beanImpl = (MessageBeanImpl) context.getBean("beanImpl");
		beanImpl.sayHello();
		beanImpl.sayHello("바나나", 6000);
		// 3. 스프링 컨테이너 종료
		context.close();
	}
}
