package com.hospo.hub.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospo.hub.beans.Employer;
import com.hospo.hub.beans.Job;
import com.hospo.hub.beans.Occupations;
import com.hospo.hub.dao.EmployeeDao;
import com.hospo.hub.dao.EmployerDao;
import com.hospo.hub.dao.JobDao;
import com.hospo.hub.dao.OccupationsDao;

@Service
public class InitDbService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	EmployerDao employerDao;
	
	@Autowired
	JobDao jobDao;
	
	@Autowired
	OccupationsDao occupationsDao;

	/**
	 * This method will be called after creation of the application context
	 */
	
	@PostConstruct
	public void init() {

		Occupations occupation1 = new Occupations();
		occupation1.setName("Chef");

		Occupations occupation2 = new Occupations();
		occupation2.setName("Waiter");

		Occupations occupation3 = new Occupations();
		occupation3.setName("Cleaner");

		Occupations occupation4 = new Occupations();
		occupation4.setName("Attender");

		occupationsDao.save(occupation1);
		occupationsDao.save(occupation2);
		occupationsDao.save(occupation3);
		occupationsDao.save(occupation4);

		Employer employer1 = new Employer();
		employer1.setFirstName("John");
		employer1.setLastName("Smith");
		employer1.setPassword("password");
		employer1.setUserId("johnsmith");

		employerDao.save(employer1);

		Job job1 = new Job();
		job1.setJobDescription("Do .......");
		job1.setJobTitle("Title One");
		job1.setJobTitle("Title One");
		job1.setPostedBy(employer1.getUserId());
		job1.setEmployerId(1);
		jobDao.save(job1);

	}
}
