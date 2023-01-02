package DrawingApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO suschint This type ...
 *
 */
public class Test {

  private static ApplicationContext context;

  public static void main(String[] args) {

    // TODO Auto-generated method stub
    ApplicationContext context = new ClassPathXmlApplicationContext("core.xml");
    Customer c = (Customer) context.getBean("customer");

    c.displaycustomer();

  }

}
