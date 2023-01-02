package Assignments;

/**
 * TODO suschint This type ...
 *
 */
public class Book {
  private Integer id;

  private String name;

  /**
   * @return id
   */
  public Integer getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getid}.
   */
  public void setId(Integer id) {

    System.out.println("Setting Id of the book " + id);

    this.id = id;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public String toString() {

    return "Book [id=" + this.id + ", name=" + this.name + "]";
  }

  public void initMethod() {

    System.out.println("Init Method is called");
  }

  public void destroyMethod() {

    System.out.println("Destroy Method is called");
  }
}
