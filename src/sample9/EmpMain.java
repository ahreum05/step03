package sample9;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {
   public static void main(String[] args) {
      GenericXmlApplicationContext context = 
            new GenericXmlApplicationContext("sample9/bean.xml");
      
      Developer developer = (Developer)context.getBean("developer");
      System.out.println(developer);
      
      Engineer engineer = (Engineer)context.getBean("engineer");
      System.out.println(engineer);
      context.close();
   }
}