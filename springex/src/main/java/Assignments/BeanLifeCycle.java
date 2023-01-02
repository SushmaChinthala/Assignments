package Assignments;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO suschint This type ...
 *
 */
public class BeanLifeCycle {
  public static void main(String args[]) {

    AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycleBook.xml");
    Book book = (Book) context.getBean("Book");
    System.out.println(book);
    context.registerShutdownHook();

  }
}
