package MVCexample.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoService s;

  @RequestMapping(value = "/list-todos", method = RequestMethod.GET)

  public String sayHello1(ModelMap model) {

    model.addAttribute("todos", this.s.retrieveTodos("in28Minutes"));
    return "list-todos";
  }

  @RequestMapping(value = "/add-todo", method = RequestMethod.GET)

  public String showTODoPage() {

    return "todo";
  }

  @RequestMapping(value = "/add-todo", method = RequestMethod.POST)

  public String addToDo(ModelMap model, @RequestParam String desc) {

    this.s.addTodo("in28Minutes", desc, null, false);
    return "redirect:list-todos";
  }

  @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)

  public String deleteTodo(ModelMap model, @RequestParam int id) {

    // this.s.addTodo("in28Minutes", desc, null, false);
    this.s.deleteTodo(id);
    return "redirect:list-todos";
  }

}
