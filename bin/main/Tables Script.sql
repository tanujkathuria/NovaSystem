USE [NOVA]
GO
/****** Object:  Table [dbo].[Agency]    Script Date: 22-01-2019 16:29:09 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Agency](
	[AgencyId] [int] IDENTITY(1,1) NOT NULL,
	[AgencyName] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[AgencyId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[AgencyHearingTime]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AgencyHearingTime](
	[RecordId] [int] IDENTITY(1,1) NOT NULL,
	[AgenecyName] [nvarchar](100) NULL,
	[HearingTime] [time](7) NULL,
	[IsMobileRecords] [bit] NOT NULL,
	[IsEnabled] [bit] NOT NULL,
	[CreatedDate] [datetime] NULL,
	[CreateUser] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[RecordId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[City]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[City](
	[CityId] [int] IDENTITY(1,1) NOT NULL,
	[CityName] [nvarchar](100) NULL,
	[StateId] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[CityId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Country]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Country](
	[CountryId] [int] IDENTITY(1,1) NOT NULL,
	[CountryName] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[CountryId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DailyTaskSetup]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DailyTaskSetup](
	[RecordId] [int] IDENTITY(1,1) NOT NULL,
	[WorkDate] [date] NULL,
	[Username] [nvarchar](50) NULL,
	[TaxId] [numeric](18, 0) NULL,
	[Rank] [nvarchar](10) NULL,
	[ReportLevel] [nvarchar](20) NULL,
	[Type] [nvarchar](50) NULL,
	[Category] [nvarchar](20) NULL,
	[LostTime] [time](7) NULL,
	[District1] [nvarchar](20) NULL,
	[District2] [nvarchar](20) NULL,
	[ShiftTime] [nvarchar](20) NULL,
	[WorkingHours] [int] NULL,
	[RadioId] [int] NULL,
	[VehicleId] [int] NULL,
	[StartMileage] [nvarchar](20) NULL,
	[EndMileage] [nvarchar](20) NULL,
	[CreatedDate] [datetime] NULL,
	[CreatedUser] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[RecordId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Equipment]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Equipment](
	[RecordId] [int] IDENTITY(1,1) NOT NULL,
	[DeviceType] [nvarchar](20) NULL,
	[DeviceLabel] [nvarchar](20) NULL,
	[UnitID] [nvarchar](20) NULL,
	[SerialNumber] [nvarchar](20) NULL,
	[IPAddress] [nvarchar](20) NULL,
	[IsMobileDevice] [bit] NULL,
	[AvalableRanges] [int] NULL,
	[CreatedDate] [datetime] NULL,
	[CreatedUser] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[RecordId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[State]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[State](
	[StateId] [int] IDENTITY(1,1) NOT NULL,
	[StateName] [nvarchar](100) NULL,
	[CountryId] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[StateId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TicketInfo]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TicketInfo](
	[RecordId] [int] IDENTITY(1,1) NOT NULL,
	[DeviceId] [nvarchar](20) NULL,
	[TicketStartNumber] [int] NULL,
	[TicketEndNumber] [int] NULL,
	[LastTicketNumber] [int] NULL,
	[TicketUse] [int] NULL,
	[TicketRemaining] [int] NULL,
	[CreatedDate] [datetime] NULL,
	[CreatedUser] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[RecordId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[UserId] [int] IDENTITY(1,1) NOT NULL,
	[Rank] [nvarchar](10) NULL,
	[Name] [nvarchar](100) NULL,
	[BadgeNo] [nvarchar](10) NULL,
	[Email] [nvarchar](50) NULL,
	[EffectiveDate] [date] NULL,
	[AppointmentDate] [date] NULL,
	[IsSupervisor] [bit] NULL,
	[ReportingAgency] [nvarchar](50) NULL,
	[ReportingLevel] [nvarchar](50) NULL,
	[IsEnabled] [bit] NULL,
	[CreatedDate] [datetime] NULL,
	[CreatedUser] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[UserId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Violation]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Violation](
	[ViolationCode] [int] IDENTITY(1,1) NOT NULL,
	[Description] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[ViolationCode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ViolationDetails]    Script Date: 22-01-2019 16:29:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ViolationDetails](
	[RecordId] [int] IDENTITY(1,1) NOT NULL,
	[NOVNumber] [int] NULL,
	[Name] [nvarchar](50) NULL,
	[UserId] [nvarchar](50) NULL,
	[ViolationType] [nvarchar](50) NULL,
	[ViolationCode] [int] NULL,
	[TimeOfIssue] [time](7) NULL,
	[DateOfIssue] [date] NULL,
	[Street] [nvarchar](50) NULL,
	[Country] [nvarchar](50) NULL,
	[City] [nvarchar](50) NULL,
	[State] [nvarchar](50) NULL,
	[Boro] [nvarchar](50) NULL,
	[Zip] [int] NULL,
	[VehicleMaker] [nvarchar](50) NULL,
	[VehicleColor] [nvarchar](50) NULL,
	[VehicleType] [nvarchar](50) NULL,
	[VehicleYear] [int] NULL,
	[VehicleVIN] [nvarchar](50) NULL,
	[VehiclePermit] [nvarchar](50) NULL,
	[PermitID] [nvarchar](10) NULL,
	[DriveOffFlag] [nvarchar](10) NULL,
	[HearingTime] [time](7) NULL,
	[HearingDate] [date] NULL,
	[Agency] [nvarchar](50) NULL,
	[IsOpertaorPresent] [bit] NULL,
	[OperationName] [nvarchar](50) NULL,
	[LicensePlate] [nvarchar](50) NULL,
	[CheckDigit] [nvarchar](50) NULL,
	[PlaceType] [nvarchar](50) NULL,
	[ExpirationDate] [datetime] NULL,
	[NoExpiration] [nvarchar](50) NULL,
	[NoExpirationDateReason] [nvarchar](100) NULL,
	[NoTabFlag] [nvarchar](10) NULL,
	[LicenseTabMonth] [int] NULL,
	[LicenseTabYear] [int] NULL,
	[FirstDescriptor] [nvarchar](50) NULL,
	[Section] [nvarchar](50) NULL,
	[OnStreetName] [nvarchar](50) NULL,
	[OnTheCenterMedianBetweenStreetName] [nvarchar](100) NULL,
	[CreatedDate] [datetime] NULL,
	[CreatedUser] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[RecordId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[AgencyHearingTime] ADD  DEFAULT ((1)) FOR [IsMobileRecords]
GO
ALTER TABLE [dbo].[AgencyHearingTime] ADD  DEFAULT ((1)) FOR [IsEnabled]
GO
ALTER TABLE [dbo].[AgencyHearingTime] ADD  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[DailyTaskSetup] ADD  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[Equipment] ADD  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[TicketInfo] ADD  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[User] ADD  DEFAULT ((1)) FOR [IsEnabled]
GO
ALTER TABLE [dbo].[User] ADD  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[ViolationDetails] ADD  DEFAULT (getdate()) FOR [CreatedDate]
GO
ALTER TABLE [dbo].[City]  WITH CHECK ADD FOREIGN KEY([StateId])
REFERENCES [dbo].[State] ([StateId])
GO
ALTER TABLE [dbo].[City]  WITH CHECK ADD FOREIGN KEY([StateId])
REFERENCES [dbo].[State] ([StateId])
GO
ALTER TABLE [dbo].[State]  WITH CHECK ADD FOREIGN KEY([CountryId])
REFERENCES [dbo].[Country] ([CountryId])
GO
ALTER TABLE [dbo].[State]  WITH CHECK ADD FOREIGN KEY([CountryId])
REFERENCES [dbo].[Country] ([CountryId])
GO
