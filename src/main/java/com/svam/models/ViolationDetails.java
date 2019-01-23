package com.svam.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author tanujkathuria
 *
 */
@Entity
public class ViolationDetails{

	/**
	 * district not available
	 * permit not available
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "RecordId")
	private Integer recordId;
	
	@JsonProperty("NOVNumber")
	@Column(name = "NOVNumber")
	private Integer novNumber;
	
	@JsonProperty("Name")
	@Column(name = "Name")
	private String name;
	
	@JsonProperty("userId")
	@Column(name = "UserId")
	private String userId;
	
	@JsonProperty("violationtype")
	@Column(name = "ViolationType")
	private String violationType;
	
	@JsonProperty("violationcode")
	@Column(name = "ViolationCode")
	private String violationCode;
	
	@JsonProperty("issuancedatetime")
	@Column(name = "TimeOfIssue")
	@JsonFormat
	  (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date timeOfIssue;
	
	@JsonProperty("dateofissue")
	@Column(name = "DateOfIssue")
	private Date dateOfIssue;
	
	@JsonProperty("streetname")
	@Column(name = "Street")
	private String street;
	
	@JsonProperty("country")
	@Column(name = "Country")
	private String country;
	
	@JsonProperty("city")
	@Column(name = "City")
	private String city;
	
	@JsonProperty("state")
	@Column(name = "State")
	private String state;
	
	@JsonProperty("boro")
	@Column(name = "Boro")
	private String boro;
	
	@JsonProperty("zip")
	@Column(name = "Zip")
	private Integer zip;
	
	@JsonProperty("vehiclemake")
	@Column(name = "VehicleMaker")
	private String vehicleMaker;
	
	@JsonProperty("vehiclecolor")
	@Column(name = "VehicleColor")
	private String vehicleColor;
	
	@JsonProperty("vehicletype")
	@Column(name = "VehicleType")
	private String vehicleType;
	
	@JsonProperty("vehicleyear")
	@Column(name = "VehicleYear")
	private Integer vehicleYear;
	
	@JsonProperty("vin")
	@Column(name = "VehicleVIN")
	private String vehicleVIN;
	
	@JsonProperty("vehiclepermit")
	@Column(name = "VehiclePermit")
	private String vehiclePermit;
	
	@JsonProperty("permitid")
	@Column(name = "PermitID")
	private String permitId;
	
	@JsonProperty("driveofflag")
	@Column(name = "DriveOffFlag")
	private String driveOffFlag;
	
	@JsonProperty("hearingtime")
	@Column(name = "HearingTime")
	@JsonFormat
	  (shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
	private Date hearingTime;
	
	@JsonProperty("hearingdate")
	@Column(name = "HearingDate")
	@JsonFormat
	  (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date hearingDate;
	
	@JsonProperty("agencyid")
	@Column(name = "Agency")
	private String agency;
	
	@JsonProperty("isopertaorpresent")
	@Column(name = "IsOpertaorPresent")
	private Integer isOperatorPresent;
	
	@JsonProperty("operationname")
	@Column(name = "OperationName")
	private String operationName;
	
	@JsonProperty("licenseplate")
	@Column(name = "LicensePlate")
	private String licensePlate;
	
	@JsonProperty("checkDigit")
	@Column(name = "CheckDigit")
	private String checkDigit;
	
	@JsonProperty("placetype")
	@Column(name = "PlaceType")
	private String placeType;
	
	@JsonProperty("expirationdate")
	@Column(name = "ExpirationDate")
	@Temporal(TemporalType.DATE)
	private Date expirationDate;
	
	@JsonProperty("noexpiration")
	@Column(name = "NoExpiration")
	private String noExpiration;
	
	@JsonProperty("noexpirationdatereason")
	@Column(name = "NoExpirationDateReason")
	private String noExpirationDateReason;
	
	@JsonProperty("notabflag")
	@Column(name = "NoTabFlag")
	private String noTabFlag;
	
	@JsonProperty("licensetabmonth")
	@Column(name = "LicenseTabMonth")
	private Integer licenseTabMonth;
	
	@JsonProperty("licensetabyear")
	@Column(name = "LicenseTabYear")
	private Integer licenseTabYear;
	
	@JsonProperty("firstdescriptor")
	@Column(name = "FirstDescriptor")
	private String firstDescriptor;
	
	@JsonProperty("section")
	@Column(name = "Section")
	private String section;
	
	@JsonProperty("onstreetname")
	@Column(name = "OnStreetName")
	private String onStreetName;
	
	@JsonProperty("onthecentermedianbetweenstreetname")
	@Column(name = "OnTheCenterMedianBetweenStreetName")
	private String onTheCenterMedianBetweenStreetName;
	
	@Column(name = "CreatedDate")
	private Date createdDate;
	
	@Column(name = "CreatedUser")
	private String createdUser;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getNovNumber() {
		return novNumber;
	}

	public void setNovNumber(Integer novNumber) {
		this.novNumber = novNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getViolationType() {
		return violationType;
	}

	public void setViolationType(String violationType) {
		this.violationType = violationType;
	}

	public String getViolationCode() {
		return violationCode;
	}

	public void setViolationCode(String violationCode) {
		this.violationCode = violationCode;
	}

	public Date getTimeOfIssue() {
		return timeOfIssue;
	}

	public void setTimeOfIssue(Date timeOfIssue) {
		this.timeOfIssue = timeOfIssue;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getBoro() {
		return boro;
	}

	public void setBoro(String boro) {
		this.boro = boro;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public String getVehicleMaker() {
		return vehicleMaker;
	}

	public void setVehicleMaker(String vehicleMaker) {
		this.vehicleMaker = vehicleMaker;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getVehicleYear() {
		return vehicleYear;
	}

	public void setVehicleYear(Integer vehicleYear) {
		this.vehicleYear = vehicleYear;
	}

	public String getVehicleVIN() {
		return vehicleVIN;
	}

	public void setVehicleVIN(String vehicleVIN) {
		this.vehicleVIN = vehicleVIN;
	}

	public String getVehiclePermit() {
		return vehiclePermit;
	}

	public void setVehiclePermit(String vehiclePermit) {
		this.vehiclePermit = vehiclePermit;
	}

	public String getPermitId() {
		return permitId;
	}

	public void setPermitId(String permitId) {
		this.permitId = permitId;
	}

	public String getDriveOffFlag() {
		return driveOffFlag;
	}

	public void setDriveOffFlag(String driveOffFlag) {
		this.driveOffFlag = driveOffFlag;
	}

	public Date getHearingTime() {
		return hearingTime;
	}

	public void setHearingTime(Date hearingTime) {
		this.hearingTime = hearingTime;
	}

	public Date getHearingDate() {
		return hearingDate;
	}

	public void setHearingDate(Date hearingDate) {
		this.hearingDate = hearingDate;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public Integer getIsOperatorPresent() {
		return isOperatorPresent;
	}

	public void setIsOperatorPresent(Integer isOperatorPresent) {
		this.isOperatorPresent = isOperatorPresent;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public String getPlaceType() {
		return placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getNoExpiration() {
		return noExpiration;
	}

	public void setNoExpiration(String noExpiration) {
		this.noExpiration = noExpiration;
	}

	public String getNoExpirationDateReason() {
		return noExpirationDateReason;
	}

	public void setNoExpirationDateReason(String noExpirationDateReason) {
		this.noExpirationDateReason = noExpirationDateReason;
	}

	public String getNoTabFlag() {
		return noTabFlag;
	}

	public void setNoTabFlag(String noTabFlag) {
		this.noTabFlag = noTabFlag;
	}

	public Integer getLicenseTabMonth() {
		return licenseTabMonth;
	}

	public void setLicenseTabMonth(Integer licenseTabMonth) {
		this.licenseTabMonth = licenseTabMonth;
	}

	public Integer getLicenseTabYear() {
		return licenseTabYear;
	}

	public void setLicenseTabYear(Integer licenseTabYear) {
		this.licenseTabYear = licenseTabYear;
	}

	public String getFirstDescriptor() {
		return firstDescriptor;
	}

	public void setFirstDescriptor(String firstDescriptor) {
		this.firstDescriptor = firstDescriptor;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getOnStreetName() {
		return onStreetName;
	}

	public void setOnStreetName(String onStreetName) {
		this.onStreetName = onStreetName;
	}

	public String getOnTheCenterMedianBetweenStreetName() {
		return onTheCenterMedianBetweenStreetName;
	}

	public void setOnTheCenterMedianBetweenStreetName(String onTheCenterMedianBetweenStreetName) {
		this.onTheCenterMedianBetweenStreetName = onTheCenterMedianBetweenStreetName;
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
