package sample5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BirthdayEx {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("sample5/bean.xml");
		DateVO hong = (DateVO) context.getBean("hong");
		System.out.println(hong.toString());
		
		DateVO lee = (DateVO) context.getBean("lee");
		System.out.println(lee.toString());
		
		context.close();
	}
}
