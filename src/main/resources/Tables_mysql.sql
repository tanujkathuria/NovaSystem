USE `NOVA`
;
/****** Object:  Table `Agency`    Script Date: 22-01-2019 16:29:09 ******/

insert into Agency (`AgencyName`) values ('Svam')

CREATE TABLE `Agency`(
	`AgencyId` int AUTO_INCREMENT NOT NULL,
	`AgencyName` varchar(100) NULL,
PRIMARY KEY 
(
	`AgencyId` ASC
)
)
;
/****** Object:  Table `AgencyHearingTime`    Script Date: 22-01-2019 16:29:10 ******/

insert into agency_hearing_time(`hearing_time`,`is_mobile_records`,`is_enabled`,`agency_name`)
  values(now(),1,1,'Svam');


CREATE TABLE `Agency_Hearing_Time`(
	`record_id` int AUTO_INCREMENT NOT NULL,
	`agency_name` varchar(100) NULL,
	`hearing_time` time(6) NULL,
	`is_mobile_records` tinyint NOT NULL,
	`is_enabled` tinyint NOT NULL,
	`created_date` datetime NULL,
	`create_user` varchar(50) NULL,
PRIMARY KEY 
(
	`record_id` ASC
)
)
;
/****** Object:  Table `City`    Script Date: 22-01-2019 16:29:10 ******/

insert into City(`city_name`,`state_id`) values ('Buffalo','1');

CREATE TABLE `City`(
	`city_id` int AUTO_INCREMENT NOT NULL,
	`city_name` varchar(100) NULL,
	`state_id` int NULL,
PRIMARY KEY 
(
	`city_id` ASC
)
)
;
/****** Object:  Table `Country`    Script Date: 22-01-2019 16:29:10 ******/

insert into Country (`CountryName`) values('USA');

CREATE TABLE `Country`(
	`CountryId` int AUTO_INCREMENT NOT NULL,
	`CountryName` varchar(100) NULL,
PRIMARY KEY 
(
	`CountryId` ASC
)
)
;
/****** Object:  Table `DailyTaskSetup`    Script Date: 22-01-2019 16:29:10 ******/


CREATE TABLE `DailyTaskSetup`(
	`RecordId` int AUTO_INCREMENT NOT NULL,
	`WorkDate` date NULL,
	`Username` varchar(50) NULL,
	`TaxId` numeric(18, 0) NULL,
	`Rank` varchar(10) NULL,
	`ReportLevel` varchar(20) NULL,
	`Type` varchar(50) NULL,
	`Cate;ry` varchar(20) NULL,
	`LostTime` time(6) NULL,
	`District1` varchar(20) NULL,
	`District2` varchar(20) NULL,
	`ShiftTime` varchar(20) NULL,
	`WorkingHours` int NULL,
	`RadioId` int NULL,
	`VehicleId` int NULL,
	`StartMileage` varchar(20) NULL,
	`EndMileage` varchar(20) NULL,
	`CreatedDate` datetime NULL,
	`CreatedUser` varchar(50) NULL,
PRIMARY KEY 
(
	`RecordId` ASC
)
)
;
/****** Object:  Table `Equipment`    Script Date: 22-01-2019 16:29:10 ******/


CREATE TABLE `Equipment`(
	`RecordId` int AUTO_INCREMENT NOT NULL,
	`DeviceType` varchar(20) NULL,
	`DeviceLabel` varchar(20) NULL,
	`UnitID` varchar(20) NULL,
	`SerialNumber` varchar(20) NULL,
	`IPAddress` varchar(20) NULL,
	`IsMobileDevice` tinyint NULL,
	`AvalableRanges` int NULL,
	`CreatedDate` datetime NULL,
	`CreatedUser` varchar(50) NULL,
PRIMARY KEY 
(
	`RecordId` ASC
)
)
;
/****** Object:  Table `State`    Script Date: 22-01-2019 16:29:10 ******/

insert into State(`StateName`,`CountryId`)values('New York','1');
CREATE TABLE `State`(
	`StateId` int AUTO_INCREMENT NOT NULL,
	`StateName` varchar(100) NULL,
	`CountryId` int NULL,
PRIMARY KEY 
(
	`StateId` ASC
)
)
;
/****** Object:  Table `TicketInfo`    Script Date: 22-01-2019 16:29:10 ******/

insert into ticket_info(device_id) values (1);
insert into ticket_info(device_id) values (1);


CREATE TABLE `ticket_info`(
	`record_id` int AUTO_INCREMENT NOT NULL,
	`device_id` varchar(20) NULL,
	`ticket_start_number` int NULL,
	`ticket_end_number` int NULL,
	`last_ticket_number` int NULL,
	`ticket_use` int NULL,
	`ticket_remaining` int NULL,
	`created_date` datetime NULL,
	`created_user` varchar(50) NULL,
PRIMARY KEY 
(
	`record_id` ASC
)
)
;
/****** Object:  Table `User`    Script Date: 22-01-2019 16:29:10 ******/

insert into User(`Rank`,`Name`,`badge_no`,`Email`,`effective_date`,`appointment_date`,`is_supervisor`,
`reporting_agency`,`reporting_level`,`is_enabled`,`created_date`,`created_user`) 
values('first','Tanuj','1','tanuj@gmail.com',CURDATE(),CURDATE(),
'1','Svam','level1','1',CURDATE(),'tanuj');

CREATE TABLE `User`(
	`user_id` int AUTO_INCREMENT NOT NULL,
	`Rank` varchar(10) NULL,
	`Name` varchar(100) NULL,
	`badge_no` varchar(10) NULL,
	`Email` varchar(50) NULL,
	`effective_date` date NULL,
	`appointment_date` date NULL,
	`is_supervisor` tinyint NULL,
	`reporting_agency` varchar(50) NULL,
	`reporting_level` varchar(50) NULL,
	`is_enabled` tinyint NULL,
	`CreatedDate` datetime NULL,
	`CreatedUser` varchar(50) NULL,
PRIMARY KEY 
(
	`UserId` ASC
)
)
;
/****** Object:  Table `Violation`    Script Date: 22-01-2019 16:29:10 ******/

insert into Violation (Description) values('violation 1');
CREATE TABLE `Violation`(
	`violation_code` int AUTO_INCREMENT NOT NULL,
	`Description` varchar(100) NULL,
PRIMARY KEY 
(
	`violation_code` ASC
)
)
;
/****** Object:  Table `ViolationDetails`    Script Date: 22-01-2019 16:29:10 ******/

insert into ViolationDetails(`ViolationCode`,`City`,`State`,`Name`)
values('Test 1','Buffalo','New York','Test Violation 1');
city and state will come from their tables 
description will come from Violation table



CREATE TABLE `ViolationDetails`(
	`RecordId` int AUTO_INCREMENT NOT NULL,
	`NOVNumber` int NULL,
	`Name` varchar(50) NULL,
	`UserId` varchar(50) NULL,
	`ViolationType` varchar(50) NULL,
	`ViolationCode` int NULL,
	`TimeOfIssue` time(6) NULL,
	`DateOfIssue` date NULL,
	`Street` varchar(50) NULL,
	`Country` varchar(50) NULL,
	`City` varchar(50) NULL,
	`State` varchar(50) NULL,
	`Boro` varchar(50) NULL,
	`Zip` int NULL,
	`VehicleMaker` varchar(50) NULL,
	`VehicleColor` varchar(50) NULL,
	`VehicleType` varchar(50) NULL,
	`VehicleYear` int NULL,
	`VehicleVIN` varchar(50) NULL,
	`VehiclePermit` varchar(50) NULL,
	`PermitID` varchar(10) NULL,
	`DriveOffFlag` varchar(10) NULL,
	`HearingTime` time(6) NULL,
	`HearingDate` date NULL,
	`Agency` varchar(50) NULL,
	`IsOpertaorPresent` tinyint NULL,
	`OperationName` varchar(50) NULL,
	`LicensePlate` varchar(50) NULL,
	`CheckDigit` varchar(50) NULL,
	`PlaceType` varchar(50) NULL,
	`ExpirationDate` datetime NULL,
	`NoExpiration` varchar(50) NULL,
	`NoExpirationDateReason` varchar(100) NULL,
	`NoTabFlag` varchar(10) NULL,
	`LicenseTabMonth` int NULL,
	`LicenseTabYear` int NULL,
	`FirstDescriptor` varchar(50) NULL,
	`Section` varchar(50) NULL,
	`OnStreetName` varchar(50) NULL,
	`OnTheCenterMedianBetweenStreetName` varchar(100) NULL,
	`CreatedDate` datetime NULL,
	`CreatedUser` varchar(50) NULL,
PRIMARY KEY 
(
	`RecordId` ASC
)
)
;





ALTER TABLE `City`  ADD FOREIGN KEY(`StateId`)
REFERENCES `State` (`StateId`)
;
ALTER TABLE `City` ADD FOREIGN KEY(`StateId`)
REFERENCES `State` (`StateId`)
;
ALTER TABLE `State`   ADD FOREIGN KEY(`CountryId`)
REFERENCES `Country` (`CountryId`)
;
ALTER TABLE `State`   ADD FOREIGN KEY(`CountryId`)
REFERENCES `Country` (`CountryId`)
;
