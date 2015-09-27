package com.hospo.hub.dao;

import java.util.List;

import com.hospo.hub.beans.Occupations;

public interface OccupationsDao {

	public int save(Occupations occupation);
	public List<Occupations> findAll();
}
