package com.hospo.hub.dao;

import java.util.List;

import com.hospo.hub.beans.Employer;

public interface EmployerDao {

	/**
	 * All these methods will be implemented in "Impl" classes.
	 * @return
	 */
	List<Employer> findAll();

	void save(Employer employer);
	Employer findByUserId(String userid);
	
}
