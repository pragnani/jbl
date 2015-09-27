package com.hospo.hub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospo.hub.beans.Employer;
import com.hospo.hub.beans.Job;
import com.hospo.hub.dao.EmployerDao;
import com.hospo.hub.dao.JobDao;

@Service
public class EmployerService {

	/**
	 * Spring will automatically instantiate the autowired objects
	 */
	@Autowired
	private EmployerDao employerDao;

	@Autowired
	private JobDao jobDao;

	/**
	 * method to get all the employers from database
	 * 
	 * @return
	 */
	public List<Employer> findAllEmployer() {

		return employerDao.findAll();
	}

	/**
	 * Method to save Employer Details into database
	 * 
	 * @param employer
	 */
	public void save(Employer employer) {
		employerDao.save(employer);
	}

	/**
	 * Method to find employee by UserName
	 * @param username
	 * @return
	 */
	public Employer findEmployeeByUserId(String username) {
		// TODO Auto-generated method stub
		return employerDao.findByUserId(username);
	}

	/**
	 * Method to save Job to the database
	 * @param job
	 */
	public void saveJob(Job job) {
		jobDao.save(job);

	}

	public int getEmployerIdByName(String username) {
		
		Employer employer= employerDao.findByUserId(username);
		return employer.getId();
	}

}
