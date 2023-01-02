package Assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO suschint This type ...
 *
 */
public class Main1 {

  private static ApplicationContext context;

  public static void main(String[] args) {

    context = new ClassPathXmlApplicationContext("Application.xml");
    ApplicationContextAwareInterfaceUsage c = (ApplicationContextAwareInterfaceUsage) context.getBean("application");
    c.display();

  }

}
