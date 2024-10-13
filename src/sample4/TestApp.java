package sample4;

import java.util.Calendar;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		AbstractTest test = AbstractTest.getInstance();
		System.out.println(test.dayInfo());
		System.out.println("------------------------");
		
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("sample4/bean.xml");
		//AbstractTest test1 = (AbstractTest) context.getBean("test");
		//System.out.println(test.dayInfo());
		Calendar calendar = (Calendar) context.getBean("calendar");
		System.out.println(calendar);
		context.close();
		
	}
}
