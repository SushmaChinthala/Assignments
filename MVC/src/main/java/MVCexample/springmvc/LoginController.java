package MVCexample.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
  // set the login service -Auto Wiring
  @Autowired
  LoginService s;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  /* @ResponseBody */
  public String sayHello1() {

    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  /* @ResponseBody */
  public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {

    if (this.s.validateUser(name, password)) {

      model.put("name", name);
      model.put("password", password);
      return "welcome";
    } else {
      model.put("errorMessage", "invalid user ");

      return "login";

    }
  }
}
