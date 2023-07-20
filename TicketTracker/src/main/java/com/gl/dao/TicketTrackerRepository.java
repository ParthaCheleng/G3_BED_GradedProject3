package com.gl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.entity.TicketTracker;

public interface TicketTrackerRepository extends JpaRepository<TicketTracker, Integer> {

}
