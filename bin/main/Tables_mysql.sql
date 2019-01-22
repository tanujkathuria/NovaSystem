USE `NOVA`
;
/****** Object:  Table `Agency`    Script Date: 22-01-2019 16:29:09 ******/


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


CREATE TABLE `AgencyHearingTime`(
	`RecordId` int AUTO_INCREMENT NOT NULL,
	`AgenecyName` varchar(100) NULL,
	`HearingTime` time(6) NULL,
	`IsMobileRecords` tinyint NOT NULL,
	`IsEnabled` tinyint NOT NULL,
	`CreatedDate` datetime NULL,
	`CreateUser` varchar(50) NULL,
PRIMARY KEY 
(
	`RecordId` ASC
)
)
;
/****** Object:  Table `City`    Script Date: 22-01-2019 16:29:10 ******/


CREATE TABLE `City`(
	`CityId` int AUTO_INCREMENT NOT NULL,
	`CityName` varchar(100) NULL,
	`StateId` int NULL,
PRIMARY KEY 
(
	`CityId` ASC
)
)
;
/****** Object:  Table `Country`    Script Date: 22-01-2019 16:29:10 ******/


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


CREATE TABLE `TicketInfo`(
	`RecordId` int AUTO_INCREMENT NOT NULL,
	`DeviceId` varchar(20) NULL,
	`TicketStartNumber` int NULL,
	`TicketEndNumber` int NULL,
	`LastTicketNumber` int NULL,
	`TicketUse` int NULL,
	`TicketRemaining` int NULL,
	`CreatedDate` datetime NULL,
	`CreatedUser` varchar(50) NULL,
PRIMARY KEY 
(
	`RecordId` ASC
)
)
;
/****** Object:  Table `User`    Script Date: 22-01-2019 16:29:10 ******/


CREATE TABLE `User`(
	`UserId` int AUTO_INCREMENT NOT NULL,
	`Rank` varchar(10) NULL,
	`Name` varchar(100) NULL,
	`BadgeNo` varchar(10) NULL,
	`Email` varchar(50) NULL,
	`EffectiveDate` date NULL,
	`AppointmentDate` date NULL,
	`IsSupervisor` tinyint NULL,
	`ReportingAgency` varchar(50) NULL,
	`ReportingLevel` varchar(50) NULL,
	`IsEnabled` tinyint NULL,
	`CreatedDate` datetime NULL,
	`CreatedUser` varchar(50) NULL,
PRIMARY KEY 
(
	`UserId` ASC
)
)
;
/****** Object:  Table `Violation`    Script Date: 22-01-2019 16:29:10 ******/


CREATE TABLE `Violation`(
	`ViolationCode` int AUTO_INCREMENT NOT NULL,
	`Description` varchar(100) NULL,
PRIMARY KEY 
(
	`ViolationCode` ASC
)
)
;
/****** Object:  Table `ViolationDetails`    Script Date: 22-01-2019 16:29:10 ******/


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
