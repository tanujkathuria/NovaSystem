package com.svam.NovaSystem.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author tanujkathuria
 *
 */
@Entity
public class PersonalData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String personalName;
	private String reportingLevel;
	private String reportingAgency;
	private LocalDate hearingAgency;
	private LocalTime hearingTime;
	private String printerNo;
	private String messages;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersonalName() {
		return personalName;
	}
	public void setPersonalName(String personalName) {
		this.personalName = personalName;
	}
	public String getReportingLevel() {
		return reportingLevel;
	}
	public void setReportingLevel(String reportingLevel) {
		this.reportingLevel = reportingLevel;
	}
	public String getReportingAgency() {
		return reportingAgency;
	}
	public void setReportingAgency(String reportingAgency) {
		this.reportingAgency = reportingAgency;
	}
	public LocalDate getHearingAgency() {
		return hearingAgency;
	}
	public void setHearingAgency(LocalDate hearingAgency) {
		this.hearingAgency = hearingAgency;
	}
	public LocalTime getHearingTime() {
		return hearingTime;
	}
	public void setHearingTime(LocalTime hearingTime) {
		this.hearingTime = hearingTime;
	}
	public String getPrinterNo() {
		return printerNo;
	}
	public void setPrinterNo(String printerNo) {
		this.printerNo = printerNo;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}


}
