package springcoreexample;

public class HelloBean {
  private String name;

  public String getName() {

    return this.name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public void sayhello() {

    System.out.println("hellow" + this.name);
  }
}
