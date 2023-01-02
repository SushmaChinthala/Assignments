package DrawingApplication;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * TODO suschint This type ...
 *
 */
public class ListOfPoints implements InitializingBean, DisposableBean {
  private List<point> points;

  /**
   * @return points
   */
  public List<point> getPoints() {

    return this.points;
  }

  /**
   * @param points new value of {@link #getpoints}.
   */
  public void setPoints(List<point> points) {

    this.points = points;
  }

  public void draw() {

    for (point p : this.points) {

      System.out.println("Point A=(" + p.getX() + "," + p.getY() + ")");
    }

  }

  public void afterPropertiesSet() throws Exception {

    System.out.println("Intializing bean init method is called for Triangle");

  }

  public void destroy() throws Exception {

    System.out.println("Disposable init method called for triangle");

  }

  public void myinit() {

    System.out.println("init method is called");
  }

  public void cleanup() {

    System.out.println("cleanup method is called");
  }
}
