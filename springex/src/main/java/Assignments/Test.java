package Assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO suschint This type ...
 *
 */
public class Test {
  public static ApplicationContext context;

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("ans.xml");
    Questions c = (Questions) context.getBean("List1");

    c.display();

  }

}
