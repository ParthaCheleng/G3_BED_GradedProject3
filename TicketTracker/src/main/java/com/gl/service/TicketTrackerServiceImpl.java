package com.gl.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.dao.TicketTrackerRepository;
import com.gl.entity.TicketTracker;

@Service
public class TicketTrackerServiceImpl implements TicketTrackerService {

	
	private TicketTrackerRepository ticketTrackerRepository;

	@Autowired
	public TicketTrackerServiceImpl(TicketTrackerRepository theticketTrackerRepository) {
		ticketTrackerRepository = theticketTrackerRepository;
	}

	@Override
	public List<TicketTracker> findAll() {

		List<TicketTracker> theTicketTracker = ticketTrackerRepository.findAll();
		return theTicketTracker;
	}

	@Override
	public TicketTracker findById(int theId) {
		Optional<TicketTracker> result = ticketTrackerRepository.findById(theId);

		TicketTracker theticketTracker = null;

		if (result.isPresent()) {
			theticketTracker = result.get();
		} else {
			// couldn't find ticketTracker
			throw new RuntimeException("Did not find employee id - " + theId);
		}

		return theticketTracker;
	}

	@Override
	public void save(TicketTracker theticketTracker) {
		ticketTrackerRepository.save(theticketTracker);
	}

	@Override
	public void deleteById(int theId) {
		ticketTrackerRepository.deleteById(theId);
	}

}
