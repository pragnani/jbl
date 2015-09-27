package com.hospo.hub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospo.hub.beans.Employee;
import com.hospo.hub.beans.Employer;
import com.hospo.hub.beans.Job;
import com.hospo.hub.beans.Occupations;
import com.hospo.hub.dao.EmployeeDao;
import com.hospo.hub.dao.EmployerDao;
import com.hospo.hub.dao.JobDao;
import com.hospo.hub.dao.OccupationsDao;

@Service
public class EmployeeService {

	/**
	 * Spring will place (instantiate) the autowired objects, also known as Dependency Injection
	 */
	
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	EmployerDao employerDao;
	
	@Autowired
	JobDao jobDao;
	
	@Autowired
	OccupationsDao occupationsDao;

	/**
	 * Method to get all jobs posted
	 * @return
	 */
	public List<Job> findAllJobs() {
		return jobDao.findAll();
	}

	/**
	 * Method to get All Occupations
	 * @return
	 */
	public List<Occupations> findAllOccupations() {
		return occupationsDao.findAll();
	}

	/**
	 * Method to save Employee object into database
	 * @param employee
	 */
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

	/**
	 * Method to get all employees from the database
	 * @return
	 */
	public List<Employee> findAllEmployees() {
		return employeeDao.findAll();
	}

	/**
	 * Method to get all the employers from the database
	 * @return
	 */
	public List<Employer> findallEmployers() {
		// TODO Auto-generated method stub
		return employerDao.findAll();
	}

	/**
	 * method to get the employee by Id
	 * @param username
	 * @return
	 */
	public Employee findEmployeeByUserId(String username) {
		// TODO Auto-generated method stub
		return employeeDao.findByUserId(username);
	}

}
