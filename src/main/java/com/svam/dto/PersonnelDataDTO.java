package com.svam.dto;

import java.util.Date;

import com.svam.models.AgencyHearingTime;
import com.svam.models.User;

/**
 * 
 * @author tanujkathuria
 *
 */
public class PersonnelDataDTO {

	private String personnelname;
	private String reportinglevel;
	private String reportingsgency;
	private Date hearingtime;
	
	public String getPersonnelname() {
		return personnelname;
	}
	public void setPersonnelname(String personnelname) {
		this.personnelname = personnelname;
	}
	public String getReportinglevel() {
		return reportinglevel;
	}
	public void setReportinglevel(String reportinglevel) {
		this.reportinglevel = reportinglevel;
	}
	public String getReportingsgency() {
		return reportingsgency;
	}
	public void setReportingsgency(String reportingsgency) {
		this.reportingsgency = reportingsgency;
	}
	public Date getHearingtime() {
		return hearingtime;
	}
	public void setHearingtime(Date hearingtime) {
		this.hearingtime = hearingtime;
	}
	public PersonnelDataDTO(String personnelname, String reportinglevel, String reportingsgency, Date hearingtime) {
		super();
		this.personnelname = personnelname;
		this.reportinglevel = reportinglevel;
		this.reportingsgency = reportingsgency;
		this.hearingtime = hearingtime;
	}
	
	public static PersonnelDataDTO build(User user, AgencyHearingTime agencyHearingTime) {
		return  new PersonnelDataDTO(user.getName(), user.getReportingLevel(), user.getReportingAgency(), agencyHearingTime.getHearingTime());
		
	}
	@Override
	public String toString() {
		return "PersonnelDataDTO [personnelname=" + personnelname + ", reportinglevel=" + reportinglevel
				+ ", reportingsgency=" + reportingsgency + ", hearingtime=" + hearingtime + "]";
	}
	
	
	
}
