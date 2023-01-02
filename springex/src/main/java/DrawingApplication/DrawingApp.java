package DrawingApplication;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

/**
 * TODO suschint This type ...
 *
 */
public class DrawingApp {

  /**
   * @param args
   */
  public static void main(String[] args) {

    // BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    context.registerShutdownHook();
    // Triangle triangle = (Triangle) context.getBean("triangle");
    ListOfPoints l = (ListOfPoints) context.getBean("list");

    l.draw();
    // TODO Auto-generated method stub

  }

}
