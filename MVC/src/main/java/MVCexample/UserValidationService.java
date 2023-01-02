package MVCexample;

/**
 * TODO suschint This type ...
 *
 */
public class UserValidationService {
  public boolean isUserValid(String user, String password) {

    if (user.equals("Sushma") && password.equals("sushma"))
      return true;
    return false;
  }

  /**
   * @param name
   * @param password
   * @return
   */

}
