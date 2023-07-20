package com.gl.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class TicketTracker {

	// define fields

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "ticket_title")
	private String ticket_title;

	@Column(name = "ticket_description")
	private String ticket_description;

	@Column(name = "ticket_created_on")
	private String ticket_created_on;

	public TicketTracker() {

	}

	public TicketTracker(int id, String ticket_title, String ticket_description, String ticket_created_on) {
		this.id = id;
		this.ticket_title = ticket_title;
		this.ticket_description = ticket_description;
		this.ticket_created_on = ticket_created_on;
	}

	public TicketTracker(String ticket_title, String ticket_description, String ticket_created_on) {
		this.ticket_title = ticket_title;
		this.ticket_description = ticket_description;
		this.ticket_created_on = ticket_created_on;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTicket_title() {
		return ticket_title;
	}

	public void setTicket_title(String ticket_title) {
		this.ticket_title = ticket_title;
	}

	public String getTicket_description() {
		return ticket_description;
	}

	public void setTicket_description(String ticket_description) {
		this.ticket_description = ticket_description;
	}

	public String getTicket_created_on() {
		return ticket_created_on;
	}

	public void setTicket_created_on(String ticket_created_on) {
		this.ticket_created_on = ticket_created_on;
	}

	
	

	
}
