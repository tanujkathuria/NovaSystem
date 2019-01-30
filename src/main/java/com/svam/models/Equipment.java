package com.svam.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipment {

	@Id
	@GeneratedValue
	@Column(name="RecordId")
	private Integer recordId;
	
	@Column(name="DeviceType")
	private String deviceType;
	
	@Column(name="DeviceLabel")
	private String deviceLabel;
	
	@Column(name="UnitID")
	private String unitId;
	
	@Column(name="SerialNumber")
	private String serialNumber;
	
	@Column(name="IPAddress")
	private String ipAddress;
	
	@Column(name="IsMobileDevice")
	private int isMobileDevice;
	
	@Column(name="AvalableRanges")
	private int availableRanges;
	
	@Column(name="CreatedDate")
	private Date createdDate;
	
	@Column(name="CreatedUser")
	private String createdUser;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceLabel() {
		return deviceLabel;
	}

	public void setDeviceLabel(String deviceLabel) {
		this.deviceLabel = deviceLabel;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getIsMobileDevice() {
		return isMobileDevice;
	}

	public void setIsMobileDevice(int isMobileDevice) {
		this.isMobileDevice = isMobileDevice;
	}

	public int getAvailableRanges() {
		return availableRanges;
	}

	public void setAvailableRanges(int availableRanges) {
		this.availableRanges = availableRanges;
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
