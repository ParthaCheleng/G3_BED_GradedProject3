package com.gl.service;

import java.util.List;

import org.springframework.ui.Model;

import com.gl.entity.TicketTracker;

public interface TicketTrackerService {

	public List<TicketTracker> findAll();
	
	public TicketTracker findById(int theId);
	
	public void save(TicketTracker theTicketTracker);
	
	public void deleteById(int theId);

		
}
