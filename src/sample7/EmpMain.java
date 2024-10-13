package sample7;

import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {
   public static void main(String[] args) {
      GenericXmlApplicationContext context = 
            new GenericXmlApplicationContext("sample7/bean.xml");
      
      Emp developer = (Emp)context.getBean("developer");
      System.out.println(developer);
      
                                           
      Emp engineer = (Emp)context.getBean("engineer");
      System.out.println(engineer);
      context.close();
   }
}