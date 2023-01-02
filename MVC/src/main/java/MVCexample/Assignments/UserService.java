package MVCexample.Assignments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * TODO suschint This type ...
 *
 */
@Service
public class UserService {

  private static List<User> u = new ArrayList<>();

  /*
   * public List<User> retrieveUsers(String list) {
   *
   * List<User> filteredTodos = new ArrayList<User>(); for (User list1 : this.users) { if (((User)
   * this.users).getUsername().equals(list)) { filteredTodos.add(list1); }
   *
   * } return filteredTodos;
   */
  private static int usersCount = 3;

  static {
    u.add(new User("Sushma", "sushma", "Learn@gmail.com"));
    u.add(new User("Harshi", "in28Minutes", "Struts@gmail.com"));
    u.add(new User("teja", "Teja", "teja@gmail.com"));
  }

  public void addUser(String username, String password, String email) {

    u.add(new User(username, password, email));
    usersCount++;
  }

  /**
   * @return usersCount
   */
  public static int getUsersCount() {

    return usersCount;
  }

  /**
   * @param usersCount new value of {@link #getusersCount}.
   */
  public static void setUsersCount(int usersCount) {

    UserService.usersCount = usersCount;
  }

}
