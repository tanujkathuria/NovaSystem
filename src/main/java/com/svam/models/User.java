package com.svam.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "User")
public class User {

	
	@Id
	@GeneratedValue
	@JsonIgnore
	@Column(name="user_id")
	private Long userId;
	@Column(name="Rank")
	@JsonIgnore
	private String rank;
	@Column(name="Name")
	@JsonProperty(value = "personnelname")
	private String name;
	@Column(name="badge_no")
	@JsonIgnore
	private String badgeNo;
	@Column(name="Email")
	@JsonIgnore
	private String email;
	@JsonIgnore
	@Column(name="effective_date")
	private Date effectiveDate;
	@JsonIgnore
	@Column(name="appointment_date")
	private Date appointmentDate;
	@JsonIgnore
	@Column(name="is_supervisor")
	private int isSupervisor;
	@Column(name="reporting_agency")
	@JsonProperty(value = "reportingAgency")
	private String reportingAgency;
	@Column(name="reporting_level")
	@JsonProperty(value = "reportingLevel")
	private String reportingLevel;
	@JsonIgnore
	@Column(name="is_enabled")
	private int isEnabled;
	@JsonIgnore
	@Column(name="created_date")
	private Date createdDate;
	@JsonIgnore
	@Column(name="created_user")
	private String createdUser;



	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBadgeNo() {
		return badgeNo;
	}
	public void setBadgeNo(String badgeNo) {
		this.badgeNo = badgeNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public int getIsSupervisor() {
		return isSupervisor;
	}
	public void setIsSupervisor(int isSupervisor) {
		this.isSupervisor = isSupervisor;
	}
	public String getReportingAgency() {
		return reportingAgency;
	}
	public void setReportingAgency(String reportingAgency) {
		this.reportingAgency = reportingAgency;
	}
	public String getReportingLevel() {
		return reportingLevel;
	}
	public void setReportingLevel(String reportingLevel) {
		this.reportingLevel = reportingLevel;
	}
	public int getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(int isEnabled) {
		this.isEnabled = isEnabled;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}



}
