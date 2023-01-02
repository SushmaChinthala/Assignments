package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO suschint This type ...
 *
 */
public class AnnotationMain {
  private static ApplicationContext context;

  public static void main(String args[]) {

    ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationHandsON.xml");
    Circle c = (Circle) context.getBean("circle");
    c.draw();

  }
}
