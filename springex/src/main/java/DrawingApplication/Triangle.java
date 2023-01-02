package DrawingApplication;

import org.springframework.beans.factory.InitializingBean;

/**
 * TODO suschint This type ...
 *
 */
public class Triangle implements InitializingBean

{
  private point pointA;

  private point pointB;

  private point pointC;

  /**
   * @return pointA
   */
  public point getPointA() {

    return this.pointA;
  }

  /**
   * @param pointA new value of {@link #getpointA}.
   */
  public void setPointA(point pointA) {

    this.pointA = pointA;
  }

  /**
   * @return pointB
   */
  public point getPointB() {

    return this.pointB;
  }

  /**
   * @param pointB new value of {@link #getpointB}.
   */
  public void setPointB(point pointB) {

    this.pointB = pointB;
  }

  /**
   * @return pointC
   */
  public point getPointC() {

    return this.pointC;
  }

  /**
   * @param pointC new value of {@link #getpointC}.
   */
  public void setPointC(point pointC) {

    this.pointC = pointC;
  }

  /*
   * public Triangle(String type) {
   *
   * this.type = type; }
   *
   * public String getType() {
   *
   * return this.type; }
   *
   *
   * public void setType(String type) {
   *
   * this.type = type; }
   *
   * private String type;
   */
  public void draw() {

    System.out.println("point A=(" + getPointA().getX() + "," + getPointA().getY() + ")");
    System.out.println("point B=(" + getPointB().getX() + "," + getPointB().getY() + ")");
    System.out.println("point C=(" + getPointC().getX() + "," + getPointC().getY() + ")");
  }

  public void afterPropertiesSet() throws Exception {

    System.out.println("Intializing bean init method called for triagnle");

  }

}
