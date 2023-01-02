package MVCexample.Assignments;

/**
 * TODO suschint This type ...
 *
 */
public class User {
  private String username;

  private String password;

  private String email;

  /**
   * The constructor.
   *
   * @param usename
   * @param password
   * @param email
   */

  /**
   * The constructor.
   *
   * @param username
   * @param password
   * @param email
   */
  public User(String username, String password, String email) {

    super();
    this.username = username;
    this.password = password;
    this.email = email;
  }

  /**
   * @return usename
   */
  public String getUsername() {

    return this.username;
  }

  /**
   * @param usename new value of {@link #getusename}.
   */
  public void setUsername(String username) {

    this.username = username;
  }

  /**
   * @return password
   */
  public String getPassword() {

    return this.password;
  }

  /**
   * @param password new value of {@link #getpassword}.
   */
  public void setPassword(String password) {

    this.password = password;
  }

  /**
   * @return email
   */
  public String getEmail() {

    return this.email;
  }

  /**
   * @param email new value of {@link #getemail}.
   */
  public void setEmail(String email) {

    this.email = email;
  }

}
