package Assignments;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * TODO suschint This type ...
 *
 */
public class ApplicationContextAwareInterfaceUsage implements ApplicationContextAware {
  private int number;

  /**
   * @return number
   */
  public int getNumber() {

    return this.number;
  }

  /**
   * @param number new value of {@link #getnumber}.
   */
  public void setNumber(int number) {

    this.number = number;
  }

  private ApplicationContext context = null;

  /**
   * @return point1
   *
   *
   *         /**
   * @param point1 new value of {@link #getpoint1}.
   */

  public void display() {

    System.out.println(getNumber());
  }

  public void setApplicationContext(ApplicationContext context) throws BeansException {

    System.out.println("hi");
    this.context = context;

  }

}
