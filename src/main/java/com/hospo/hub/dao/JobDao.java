package com.hospo.hub.dao;

import java.util.List;

import com.hospo.hub.beans.Job;

public interface JobDao {

	List<Job> findAll();

	void save(Job job1);

}
