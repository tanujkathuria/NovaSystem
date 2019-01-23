package com.svam.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "agency_hearing_time")
public class AgencyHearingTime  {

	@Id
	@GeneratedValue
	@Column(name = "record_id")
	@JsonProperty(value = "ticketid")
	private Integer recordId;

	@Column(name="agency_name")
	private String agencyName;

	@Column(name="hearing_time")
	@Temporal(TemporalType.TIME)
	private Date hearingTime;

	@Column(name="is_mobile_records")
	private int isMobileRecords;

	@Column(name="is_enabled")
	private int isEnabled;

	@Column(name="created_date")
	private Date createdDate;

	@Column(name="create_user")
	private String createUser;

	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public Date getHearingTime() {
		return hearingTime;
	}
	public void setHearingTime(Date hearingTime) {
		this.hearingTime = hearingTime;
	}
	public int getIsMobileRecords() {
		return isMobileRecords;
	}
	public void setIsMobileRecords(int isMobileRecords) {
		this.isMobileRecords = isMobileRecords;
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
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	


}
