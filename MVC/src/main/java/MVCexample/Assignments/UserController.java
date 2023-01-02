package MVCexample.Assignments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * TODO suschint This type ...
 *
 */
@Controller
public class UserController {
  @Autowired
  UserService s;

  @RequestMapping(value = "/registration", method = RequestMethod.GET)
  public String sayHello1(ModelMap model) {

    return "registration";
  }

  @RequestMapping(value = "/registration", method = RequestMethod.POST)
  public String sayHello5(ModelMap model) {

    return "logon";
  }

  /*
   * @RequestMapping(value = "/logon", method = RequestMethod.POST) public String sayHello4(ModelMap model) {
   *
   * return "registration"; }
   */

  /* @RequestMapping(value = "/logon", method = RequestMethod.POST) */
  /*
   * public String sayHello2(@RequestParam String name,@RequestParam String Password) {
   * if(getUsername().equals(name)&&password.equals(Password))
   *
   * return "logon"; }
   */
  /*
   * @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
   *
   * public String showTODoPage() {
   *
   * return "todo"; }
   *
   * @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
   *
   * public String addUser(ModelMap model, @RequestParam String desc) {
   *
   * this.u.addUser("in28Minutes", "desc", "ert@gmail.com"); return "redirect:registration";
   */

  @RequestMapping(value = "/logon", method = RequestMethod.GET)

  public String addToUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {

    this.s.addUser(username, password, email);

    return "redirect:registration";
  }

  // @RequestMapping(value="/logon",method=RequestMethod.POST)
  // public String userValidateModel()

}
