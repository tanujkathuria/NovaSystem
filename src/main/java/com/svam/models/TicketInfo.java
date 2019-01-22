package com.svam.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ticket_info")
public class TicketInfo {
	
	@Id
	@GeneratedValue
	private int record_id;
	@Column(name ="device_id")
	@JsonIgnore
	private String deviceId;
	@JsonIgnore
	private Integer ticket_start_number;
	@JsonIgnore
	private Integer ticket_end_number;
	@JsonIgnore
	private Integer last_ticket_number;
	@JsonIgnore
	private Integer ticket_use;
	@JsonIgnore
	private Integer ticket_remaining;
	@JsonIgnore
	private Date created_date;
	@JsonIgnore
	private String created_user;
	
	public int getRecord_id() {
		return record_id;
	}
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public Integer getTicket_start_number() {
		return ticket_start_number;
	}
	public void setTicket_start_number(Integer ticket_start_number) {
		this.ticket_start_number = ticket_start_number;
	}
	public Integer getTicket_end_number() {
		return ticket_end_number;
	}
	public void setTicket_end_number(Integer ticket_end_number) {
		this.ticket_end_number = ticket_end_number;
	}
	public Integer getLast_ticket_number() {
		return last_ticket_number;
	}
	public void setLast_ticket_number(Integer last_ticket_number) {
		this.last_ticket_number = last_ticket_number;
	}
	public Integer getTicket_use() {
		return ticket_use;
	}
	public void setTicket_use(Integer ticket_use) {
		this.ticket_use = ticket_use;
	}
	public Integer getTicket_remaining() {
		return ticket_remaining;
	}
	public void setTicket_remaining(Integer ticket_remaining) {
		this.ticket_remaining = ticket_remaining;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getCreated_user() {
		return created_user;
	}
	public void setCreated_user(String created_user) {
		this.created_user = created_user;
	}
	
	

}
