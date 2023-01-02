package com.springboot.using.mongodb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.using.mongodb.bean.Employee;
import com.springboot.using.mongodb.service.EmployeeServicesImpl;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeServicesImpl service;

	@GetMapping("/employee")
	public String getEmployees(Model model) {
		List<Employee> emplist = service.showAllEmployees();
		model.addAttribute("employeelist", emplist);
		return "index";

	}

	@GetMapping("/{id}")
	public String getEmployeeById(@PathVariable("id") Integer id, Model model) {
		Employee emp = service.showById(id);
		model.addAttribute("e", emp);
		return "displayemployee";
	}

	@GetMapping("/showAddPage")
	public String showAddPage(Model model) {
		model.addAttribute(new Employee());
		return "addemployee";
	}

	@PostMapping("/addemployee")
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		Employee e = (Employee) service.addEmployee(employee);

		if (e != null)
			return "redirect:/employee";

		else
			return "addemployee";
	}

	@GetMapping("/showUpdatePage/{id}")
	public String showupdatepage(@PathVariable("id") int id, Model model) {
		Employee e = service.showById(id);
		model.addAttribute(e);
		return "update";
	}

	@PostMapping("/updateemployee")
	public String updateemployee(@ModelAttribute("employee") Employee emp) {
		Employee e = service.updateEmployee(emp);
		return "redirect:/employee";

	}

	@GetMapping("/Delete/{id}")
	public String deleteemployee(@PathVariable("id") int id) {
		service.deleteEmployee(id);
		return "redirect:/employee";

	}
}
