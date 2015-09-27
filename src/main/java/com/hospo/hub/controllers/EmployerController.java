package com.hospo.hub.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hospo.hub.beans.Employer;
import com.hospo.hub.beans.Job;
import com.hospo.hub.request.ApplyRequest;
import com.hospo.hub.services.EmployerService;

@Controller
public class EmployerController {

	/**
	 * Spring will place object for when we AutoWire
	 */
	@Autowired
	private EmployerService employerService;
	




	/**
	 * Creating a model attribute to save employer object, This will automatically place the content we entered in the form to 
	 * corresponding employer object
	 * @return
	 */
	private @ModelAttribute("employer") Employer createEmployee() {
		return new Employer();
	}
	
	
	
	
	/**
	 * Creating a model attribute to save employer object, This will automatically place the content we entered in the form to 
	 * corresponding employer object
	 * @return
	 */
	private @ModelAttribute("apply") ApplyRequest createApplyRequest() {
		return new ApplyRequest();
	}
	
	
	
	
	
	/**
	 * This will create a model object with the name job, this will automatically place content entered in form into our object
	 * @return
	 */
	private @ModelAttribute("job") Job createJob() {
		return new Job();
	}

	/**
	 * Request mapping for Employer Registration, this return a jsp page that need to show when user click employer register
	 * @param model
	 * @return
	 */
	@RequestMapping("/empregister")
	public String doRegister(Model model) {
		return "WEB-INF/jsp/empregistration.jsp";
	}

	/**
	 * This method will be invoked when the user submits the form data, Model attribute will hold the data entered by user in the form
	 * 
	 * @param employer
	 * @return
	 */
	@RequestMapping(value = "/empregister", method = RequestMethod.POST)
	public String saveRegistration(@ModelAttribute Employer employer) {
		employerService.save(employer);
		return "redirect:/empregister.html?success=true";
	}
	
	/***
	 * This will redirect us to the job Posting page when user lick "Post Job" menu item in main menu
	 * @return
	 */
	
	@RequestMapping("/postjob")
	public String postJob()
	{
		return "WEB-INF/jsp/jobposting.jsp";
	}
	
	/**
	 * This method will be invoked when the user submit the "Job Post", All the form data will be automatically saved into the model attribute
	 * @param job
	 * @return
	 */
	@RequestMapping(value = "/postjob", method = RequestMethod.POST)
	public String saveJob(@ModelAttribute Job job, Principal principal) {
		String username=principal.getName();
		int id= employerService.getEmployerIdByName(username);
		job.setEmployerId(id);
		job.setPostedBy(username);
		employerService.saveJob(job);
		return "redirect:/postjob.html?success=true";
	}
	
	
	
	
	@RequestMapping(value="/applyJob" , method=RequestMethod.POST)
	public String applyJob(@ModelAttribute("apply") ApplyRequest applyRequest)
	{
		System.out.println("Helo");
		return "WEB-INF/jsp/jobposting.jsp";
	}

}
