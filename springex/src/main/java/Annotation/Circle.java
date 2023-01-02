package Annotation;

/**
 * TODO suschint This type ...
 *
 */
public class Circle {
  private Point centre;

  public void draw() {

    System.out.println("Drawing circle");
    System.out.println("circle:point is:" + this.centre.getX());
  }

  /**
   * @return centre
   */
  public Point getCentre() {

    return this.centre;
  }

  /**
   * @param centre new value of {@link #getcentre}.
   */
  // @Resource
  public void setCentre(Point centre) {

    this.centre = centre;
  }
}
