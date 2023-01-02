package MVCexample.Assignments;

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
public class SimpleIntrestController {

  @RequestMapping(value = "/intrest", method = RequestMethod.GET)

  public String sayHello1() {

    return "intrest";
  }

  @RequestMapping(value = "/intrest", method = RequestMethod.POST)
  public String simple(ModelMap model, @RequestParam int PA, @RequestParam int RATE, @RequestParam int TIME) {

    double si = (PA * RATE * TIME) / 100;
    model.addAttribute("simpleintrest", si);
    return "simpleIntrest";
  }
}
