package com.hospo.hub.dao;

import java.util.List;

import com.hospo.hub.beans.Employee;

public interface EmployeeDao {

	/**
	 * These methods will be implemented by Impl classes
	 * @param employee
	 */
	void save(Employee employee);

	List<Employee> findAll();

	Employee findByUserId(String userid);

}
