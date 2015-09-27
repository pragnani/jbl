package com.hospo.hub.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hospo.hub.beans.Employee;
import com.hospo.hub.beans.Job;
import com.hospo.hub.beans.Occupations;
import com.hospo.hub.services.EmployeeService;

@Controller
public class EmployeeController {

	/**
	 * Spring will automatically place auto wired objects in code
	 */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * This will create a model Attribute named Employee, This is same as
	 * commandName we have entered in the registration page, Spring will
	 * automatically instantiate this object with the form values
	 * 
	 * @return
	 */
	 @ModelAttribute("employee")
	 Employee createEmployee() {
		return new Employee();
	}

	/**
	 * This method will get all the jobs from the database, along with its Post
	 * author
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping("/joblistings")
	public String jobs(Model model) {
		List<Job> jobs = employeeService.findAllJobs();
		model.addAttribute("jobs", jobs);
		return "WEB-INF/jsp/joblistings.jsp";
	}

	/**
	 * This method will take us to the employee Registration page, We are
	 * getting occupation values form the DB to populate them in the DropDown in
	 * our registration page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/register")
	public String doRegister(Model model) {
		List<Occupations> occupations = employeeService.findAllOccupations();
		model.addAttribute("occupations", occupations);
		return "WEB-INF/jsp/registration.jsp";
	}

	/**
	 * This method will be invoked when the user submits the Registration form,
	 * This will save employee details into the database
	 * 
	 * @param employee
	 * @return
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveRegistration(@ModelAttribute Employee employee) {
		employeeService.save(employee);
		return "redirect:/register.html?success=true";
	}

	/**
	 * This method will be invoked when user clicks on the employee menu item,
	 * this will redirect to the employees page. We are getting all the employee
	 * names from the database and then we are showing them in our JSP
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/employees")
	public String showEmployees(Model model) {
		List<Employee> employees = employeeService.findAllEmployees();
		model.addAttribute("employees", employees);
		return "WEB-INF/jsp/employees.jsp";
	}

}
