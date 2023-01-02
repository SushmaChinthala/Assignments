package Assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO suschint This type ...
 *
 */
public class Main {
  private static ApplicationContext context;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // TODO Auto-generated method stub
    ApplicationContext context = new ClassPathXmlApplicationContext("ans.xml");
    Questions c = (Questions) context.getBean("List1");

    c.display();

  }

}
