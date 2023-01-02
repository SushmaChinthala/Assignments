package MVCexample.Assignments;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * TODO suschint This type ...
 *
 */
public class Customer

{

  @NotEmpty(message = "Name Cannot be Empty")
  @Pattern(regexp = "[A-Za-z0-9]{8,20}", message = "Must be Alghanumeric and should have atleast 8 to 20")
  private String username;

  @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&.])[A-Za-z\\d$@$!%*?&.]{8,20}", message = "Password should contain at least one upper-case letter one lower case letter,a digit or special character(_,$,#,.,@).Password should be 8 to 20 characters long.")
  private String password;

  @Email(message = "enter valid email")
  private String email;

  private long contact;

  private String city;

  @Pattern(regexp = "[0-9]{6}", message = "Zipcode must be 6")
  private String zipcode;

  public Customer() {

  }

  /**
   * The constructor.
   *
   * @param username
   * @param password
   * @param email
   * @param contact
   * @param city
   * @param zipcode
   */
  public Customer(String username, String password, String email, long contact, String city, String zipcode) {

    super();
    this.username = username;
    this.password = password;
    this.email = email;
    this.contact = contact;
    this.city = city;
    this.zipcode = zipcode;
  }

  /**
   * @return username
   */
  public String getUsername() {

    return this.username;
  }

  /**
   * @param username new value of {@link #getusername}.
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

  /**
   * @return contact
   */
  public long getContact() {

    return this.contact;
  }

  /**
   * @param contact new value of {@link #getcontact}.
   */
  public void setContact(long contact) {

    this.contact = contact;
  }

  /**
   * @return city
   */
  public String getCity() {

    return this.city;
  }

  /**
   * @param city new value of {@link #getcity}.
   */
  public void setCity(String city) {

    this.city = city;
  }

  /**
   * @return zipcode
   */
  public String getZipcode() {

    return this.zipcode;
  }

  /**
   * @param zipcode new value of {@link #getzipcode}.
   */
  public void setZipcode(String zipcode) {

    this.zipcode = zipcode;
  }

}
