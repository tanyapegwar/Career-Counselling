/*
SQLyog Ultimate v11.33 (32 bit)
MySQL - 5.0.24-community-nt : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `accountanttable` */

DROP TABLE IF EXISTS `accountanttable`;

CREATE TABLE `accountanttable` (
  `accountantContactNo` int(11) NOT NULL,
  `AccountantName` varchar(255) default NULL,
  `accountantEmail` varchar(255) default NULL,
  `month` varchar(255) default NULL,
  `monthlyProfit` int(11) default NULL,
  `monthlyMaintenanceCost` int(11) default NULL,
  `statement` varchar(255) default NULL,
  PRIMARY KEY  (`accountantContactNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `accountanttable` */

insert  into `accountanttable`(`accountantContactNo`,`AccountantName`,`accountantEmail`,`month`,`monthlyProfit`,`monthlyMaintenanceCost`,`statement`) values (96784,'anvit','dAD','Apr',324,231321321,'VERY GOOD'),(324532,'abhi','ajk@gmail.com','Oct',1233232,12313,'Good work');

/*Table structure for table `adminlogintable` */

DROP TABLE IF EXISTS `adminlogintable`;

CREATE TABLE `adminlogintable` (
  `adminid` varchar(30) NOT NULL default '',
  `password` varchar(15) default NULL,
  PRIMARY KEY  (`adminid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `adminlogintable` */

insert  into `adminlogintable`(`adminid`,`password`) values ('ad',NULL),('atishay','mahaveer'),('t','1111');

/*Table structure for table `asign` */

DROP TABLE IF EXISTS `asign`;

CREATE TABLE `asign` (
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) default NULL,
  `email` varchar(255) default NULL,
  `contactNo` bigint(20) default NULL,
  PRIMARY KEY  (`userName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `asign` */

insert  into `asign`(`userName`,`password`,`email`,`contactNo`) values ('dasf','sa','fa',421),('qwr','wdq','ads',432),('sa','das','dsa',432);

/*Table structure for table `banktab1234` */

DROP TABLE IF EXISTS `banktab1234`;

CREATE TABLE `banktab1234` (
  `ifscode` varchar(255) NOT NULL,
  `bankname` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `city` varchar(255) default NULL,
  `contactno` bigint(20) default NULL,
  `helplinenumber` bigint(20) default NULL,
  `managername` varchar(255) default NULL,
  `services` varchar(255) default NULL,
  `intime` varchar(255) default NULL,
  `outtime` varchar(255) default NULL,
  `totalemployees` int(11) default NULL,
  `totalcustomers` int(11) default NULL,
  `totalbranches` int(11) default NULL,
  `websitename` varchar(255) default NULL,
  `emailid` varchar(255) default NULL,
  `totalatmmcs` int(11) default NULL,
  `totalholidays` smallint(6) default NULL,
  `bankservices` varchar(255) default NULL,
  PRIMARY KEY  (`ifscode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `banktab1234` */

insert  into `banktab1234`(`ifscode`,`bankname`,`address`,`city`,`contactno`,`helplinenumber`,`managername`,`services`,`intime`,`outtime`,`totalemployees`,`totalcustomers`,`totalbranches`,`websitename`,`emailid`,`totalatmmcs`,`totalholidays`,`bankservices`) values ('ST56','axis','rcr','indore',412322,412111,'Atishay',NULL,'10:00AM','6:00PM',20,100,5,'sbi.com','sbi@gmail.com',200,100,'abc xyz'),('STT56','axis','rcr','indore',412322,412111,'Atishay','abc xyz','10:00AM','6:00PM',20,100,5,'sbi.com','sbi@gmail.com',200,100,NULL);

/*Table structure for table `beautysignuptable` */

DROP TABLE IF EXISTS `beautysignuptable`;

CREATE TABLE `beautysignuptable` (
  `username` varchar(20) default NULL,
  `email` varchar(20) NOT NULL,
  `password` varchar(20) default NULL,
  PRIMARY KEY  (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `beautysignuptable` */

insert  into `beautysignuptable`(`username`,`email`,`password`) values ('','',''),('atishay','aj@gmail.com','abhi'),('tanya','ffdasfaf','tanya'),('tanyaa','gggg','ggg'),('mam','mam@gmail.com','mam');

/*Table structure for table `counselor table` */

DROP TABLE IF EXISTS `counselor table`;

CREATE TABLE `counselor table` (
  `counselor_id` varchar(20) NOT NULL,
  `counselor_name` char(20) default NULL,
  `password` varchar(15) default NULL,
  `post` char(20) default NULL,
  `contact_no.` int(11) default NULL,
  PRIMARY KEY  (`counselor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `counselor table` */

/*Table structure for table `dvpadvertisementtable` */

DROP TABLE IF EXISTS `dvpadvertisementtable`;

CREATE TABLE `dvpadvertisementtable` (
  `pagename` varchar(10) default NULL,
  `bannerposition` varchar(20) default NULL,
  `bannersize` varchar(20) default NULL,
  `uploadbanner` tinyblob,
  `name` varchar(24) default NULL,
  `email` varchar(45) default NULL,
  `contactno` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dvpadvertisementtable` */

insert  into `dvpadvertisementtable`(`pagename`,`bannerposition`,`bannersize`,`uploadbanner`,`name`,`email`,`contactno`) values ('','',NULL,'','',NULL,4235),('uetwiueyi','sadas',NULL,'','rew',NULL,555);

/*Table structure for table `dvpfeedaback` */

DROP TABLE IF EXISTS `dvpfeedaback`;

CREATE TABLE `dvpfeedaback` (
  `feedback` varchar(255) NOT NULL,
  `email` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `contactno` varchar(255) default NULL,
  PRIMARY KEY  (`feedback`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dvpfeedaback` */

/*Table structure for table `dvpfeedback` */

DROP TABLE IF EXISTS `dvpfeedback`;

CREATE TABLE `dvpfeedback` (
  `feedback` varchar(200) default NULL,
  `name` varchar(30) default NULL,
  `email` varchar(30) default NULL,
  `contactno` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dvpfeedback` */

insert  into `dvpfeedback`(`feedback`,`name`,`email`,`contactno`) values ('ssss','ss','s','a');

/*Table structure for table `dvpsubscribe` */

DROP TABLE IF EXISTS `dvpsubscribe`;

CREATE TABLE `dvpsubscribe` (
  `email` varchar(255) NOT NULL,
  `name` varchar(255) default NULL,
  `mobileno` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  PRIMARY KEY  (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dvpsubscribe` */

insert  into `dvpsubscribe`(`email`,`name`,`mobileno`,`address`) values ('sadaf@gmail.com','zxv','4535','indore');

/*Table structure for table `emailtable` */

DROP TABLE IF EXISTS `emailtable`;

CREATE TABLE `emailtable` (
  `email` varchar(30) NOT NULL,
  PRIMARY KEY  (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emailtable` */

insert  into `emailtable`(`email`) values ('atis@gmail.com');

/*Table structure for table `feedbacktable` */

DROP TABLE IF EXISTS `feedbacktable`;

CREATE TABLE `feedbacktable` (
  `feedback` varchar(200) NOT NULL,
  `username` varchar(25) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `feedbacktable` */

insert  into `feedbacktable`(`feedback`,`username`) values ('YOUR SOFTWARE IS GOOD',NULL),('HELLO',NULL),('well done!!!',NULL),('thanks',NULL),('nice app\n',NULL),(' cvdbdrnr',NULL),('hello',NULL),('vv',NULL),('hi user','abhi'),('','abhi'),('hi ,this is from jhansi','abhi'),('fyhf','abhi');

/*Table structure for table `hrmanager` */

DROP TABLE IF EXISTS `hrmanager`;

CREATE TABLE `hrmanager` (
  `candidateEmail` varchar(255) NOT NULL,
  `candidateName` varchar(255) default NULL,
  `candidateContactNo` bigint(20) default NULL,
  `candidateAddress` varchar(255) default NULL,
  `city` varchar(255) default NULL,
  `dob` varchar(255) default NULL,
  `candidateInterestedInWhichDepartment` varchar(255) default NULL,
  `gender` varchar(255) default NULL,
  `candidateExperience` varchar(255) default NULL,
  `candidateTechnicalDetails` varchar(255) default NULL,
  `candidateProjectDetails` varchar(255) default NULL,
  `hobbies` varchar(255) default NULL,
  `candidatePhoto` tinyblob,
  `pass` varchar(255) default NULL,
  PRIMARY KEY  (`candidateEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hrmanager` */

insert  into `hrmanager`(`candidateEmail`,`candidateName`,`candidateContactNo`,`candidateAddress`,`city`,`dob`,`candidateInterestedInWhichDepartment`,`gender`,`candidateExperience`,`candidateTechnicalDetails`,`candidateProjectDetails`,`hobbies`,`candidatePhoto`,`pass`) values ('a','abc',242,'dsa','sad','2017-11-02T00:00:00+05:30','Data Analysis','female','das','das','das','sports','¬í\0sr\0java.io.File-¤E\räÿ\0L\0patht\0Ljava/lang/String;xpt\0›C:\\Users\\dvp\\AppData\\Roaming\\NetBeans\\8.2\\apache-tomcat-8.0.27.0_base\\work\\Catalina\\localhost\\HR_IT_Manager\\upload__497d7402_15f95c3a056__7ffe_00000014.tmpw\0\\x','a'),('aa','dasfa',25352,'dfsdfs','dfsdf','2017-11-07T00:00:00+05:30','Data Analysis','female','fddf','dfsdfsd','dfsdf','sports','¬í\0sr\0java.io.File-¤E\räÿ\0L\0patht\0Ljava/lang/String;xpt\0ªC:\\Users\\dvp\\AppData\\Roaming\\NetBeans\\8.2\\apache-tomcat-8.0.27.0_base\\work\\Catalina\\localhost\\HR_IT_Manager#Applicants.jsp\\upload__25fd9d58_15faa600638__8000_00000014.tmpw\0\\x','a'),('grds','a',32435,'few','as','2017-11-03T00:00:00+05:30','Data Analysis, Development','male','dsg','dg','fa','sports','¬í\0sr\0java.io.File-¤E\räÿ\0L\0patht\0Ljava/lang/String;xpt\0›C:\\Users\\dvp\\AppData\\Roaming\\NetBeans\\8.2\\apache-tomcat-8.0.27.0_base\\work\\Catalina\\localhost\\HR_IT_Manager\\upload__497d7402_15f95c3a056__7fff_00000015.tmpw\0\\x','123');

/*Table structure for table `laminationinfo` */

DROP TABLE IF EXISTS `laminationinfo`;

CREATE TABLE `laminationinfo` (
  `receiptNo` varchar(255) NOT NULL,
  `companyName` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `contactNo` bigint(20) default NULL,
  `laminationType` varchar(255) default NULL,
  `laminationDesign` varchar(255) default NULL,
  `cost` bigint(20) default NULL,
  `marketingUserID` varchar(255) default NULL,
  PRIMARY KEY  (`receiptNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `laminationinfo` */

insert  into `laminationinfo`(`receiptNo`,`companyName`,`address`,`contactNo`,`laminationType`,`laminationDesign`,`cost`,`marketingUserID`) values ('121','ycs','sas',425,'ddd','htyj',475654,'ajaijm');

/*Table structure for table `login12345` */

DROP TABLE IF EXISTS `login12345`;

CREATE TABLE `login12345` (
  `managerUsername` varchar(20) NOT NULL default '',
  `managerPassword` varchar(17) default NULL,
  `operatorUsername` varchar(17) default '',
  `operatorPassword` varchar(17) default NULL,
  `accountantUsername` varchar(16) default '',
  `accountantPassword` varchar(17) default NULL,
  PRIMARY KEY  (`managerUsername`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login12345` */

insert  into `login12345`(`managerUsername`,`managerPassword`,`operatorUsername`,`operatorPassword`,`accountantUsername`,`accountantPassword`) values ('a','a','',NULL,'',NULL),('atishay','a','op','op','ac','ac');

/*Table structure for table `managertable` */

DROP TABLE IF EXISTS `managertable`;

CREATE TABLE `managertable` (
  `ManagerName` varchar(255) NOT NULL,
  `managerContactNo` bigint(20) default NULL,
  `managerEmail` varchar(255) default NULL,
  `noOfOperator` int(11) default NULL,
  `operatorName` varchar(255) default NULL,
  `operatorDepartment` varchar(255) default NULL,
  `operatorEmail` varchar(255) default NULL,
  `operatorContactNo` bigint(20) default NULL,
  `maintenanceApproval` varchar(255) default NULL,
  `accountantInchargeName` varchar(255) default NULL,
  PRIMARY KEY  (`ManagerName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `managertable` */

/*Table structure for table `manufacturinginfo` */

DROP TABLE IF EXISTS `manufacturinginfo`;

CREATE TABLE `manufacturinginfo` (
  `receiptNo` varchar(255) NOT NULL,
  `companyName` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `contactNo` bigint(20) default NULL,
  `transformerType` varchar(255) default NULL,
  `manufacturingDesign` varchar(255) default NULL,
  `materialUsed` varchar(255) default NULL,
  `manufacturingProcesses` varchar(255) default NULL,
  `manufacturingCost` bigint(20) default NULL,
  `marketingUserID` varchar(255) default NULL,
  PRIMARY KEY  (`receiptNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manufacturinginfo` */

insert  into `manufacturinginfo`(`receiptNo`,`companyName`,`address`,`contactNo`,`transformerType`,`manufacturingDesign`,`materialUsed`,`manufacturingProcesses`,`manufacturingCost`,`marketingUserID`) values ('2','technosoft','indore',21424,'e','core','coppper','transport',32423,NULL);

/*Table structure for table `operatortable` */

DROP TABLE IF EXISTS `operatortable`;

CREATE TABLE `operatortable` (
  `operatorEmail` varchar(255) NOT NULL,
  `operatorName` varchar(255) default NULL,
  `operatorDepartment` varchar(255) default NULL,
  `operatorContactNo` bigint(20) default NULL,
  `month` varchar(255) default NULL,
  `maintenanceCost` int(11) default NULL,
  `noOfUsers` int(11) default NULL,
  `technicalProblems` varchar(255) default NULL,
  PRIMARY KEY  (`operatorEmail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `operatortable` */

insert  into `operatortable`(`operatorEmail`,`operatorName`,`operatorDepartment`,`operatorContactNo`,`month`,`maintenanceCost`,`noOfUsers`,`technicalProblems`) values ('aj@gmail.com','atishay','testing',424875287,'Aug',21321,2314,'software'),('shiv@gmail.com','shiv','testing',938372131122,'Apr',32352,14,'no'),('shivii@gmail.com','shivi','testing',432432,'Jan',432321,333333,'software');

/*Table structure for table `pizzahut` */

DROP TABLE IF EXISTS `pizzahut`;

CREATE TABLE `pizzahut` (
  `orderno` int(11) NOT NULL,
  `address` varchar(255) default NULL,
  `city` varchar(255) default NULL,
  `contactno` bigint(20) default NULL,
  `helplinenumber` bigint(20) default NULL,
  `managername` varchar(255) default NULL,
  `intime` varchar(255) default NULL,
  `outtime` varchar(255) default NULL,
  `totalemployees` int(11) default NULL,
  `totalcustomers` int(11) default NULL,
  `totalbranches` int(11) default NULL,
  `websitename` varchar(255) default NULL,
  `emailid` varchar(255) default NULL,
  `pizzaVeg` varchar(255) default NULL,
  `pizzaNonVeg` varchar(255) default NULL,
  `sidesveg` varchar(255) default NULL,
  `sidesNonVeg` varchar(255) default NULL,
  `mealsVeg` varchar(255) default NULL,
  `mealsNonVeg` varchar(255) default NULL,
  `drinks` varchar(255) default NULL,
  `desserts` varchar(255) default NULL,
  `magicPan` varchar(255) default NULL,
  `pasta` varchar(255) default NULL,
  `combosVeg` varchar(255) default NULL,
  `combosNonVeg` varchar(255) default NULL,
  `offers` varchar(255) default NULL,
  `feedback` varchar(255) default NULL,
  PRIMARY KEY  (`orderno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pizzahut` */

insert  into `pizzahut`(`orderno`,`address`,`city`,`contactno`,`helplinenumber`,`managername`,`intime`,`outtime`,`totalemployees`,`totalcustomers`,`totalbranches`,`websitename`,`emailid`,`pizzaVeg`,`pizzaNonVeg`,`sidesveg`,`sidesNonVeg`,`mealsVeg`,`mealsNonVeg`,`drinks`,`desserts`,`magicPan`,`pasta`,`combosVeg`,`combosNonVeg`,`offers`,`feedback`) values (55,'rajiv chowk','gwalior',456,34,'x vxm, vxmc','dgehe','grtj',234,345,455,'fsgdfcvdbgb','','','','','','','','','','','','','','',''),(233,'bhawarkuan','indore',8004,9144288,'Atishay','10:00 AM','11:00 PM',20,1000000,200,'www.pizzahut.com','pizzahut@gmail.com','onionpizza',' pizzaNonVeg',' sidesVeg','sidesNonVeg','mealsVeg','mealsNonVeg',' coca-cola','tuffle-cake','magicPan',' pasta','combosVeg',' combosNonVeg','pizzahut20','delicious'),(293,'bhawarkuan','jhansi',8004,9144288,'Atishay','10:00 AM','11:00 PM',20,1000000,200,'www.pizzahut.com','pizzahut@gmail.com','onionpizza',' pizzaNonVeg',' sidesVeg','sidesNonVeg','mealsVeg','mealsNonVeg',' coca-cola','tuffle-cake','magicPan',' pasta','combosVeg',' combosNonVeg','pizzahut20','delicious'),(321,'rajendra nagar','pune',123,3213,'','123','312',313,321,21,'qwewq','qwweqw','','','dwqd','qwad','','','','','','','','','',''),(4321,'vijay nagar','goa',123,3213,'fdsf','123','312',313,321,21,'qwewq','qwweqw','','','dwqd','qwad','','','','','','','','','',''),(43243,'lal','delhi',123,3213,'fdsf','123','321',321,312,321,'qwewq','qwweqw','','','dwqd','qwad','','','','','','','','','','');

/*Table structure for table `repairinginfo` */

DROP TABLE IF EXISTS `repairinginfo`;

CREATE TABLE `repairinginfo` (
  `receiptNo` varchar(255) NOT NULL,
  `companyName` varchar(255) default NULL,
  `address` varchar(255) default NULL,
  `contactNo` bigint(20) default NULL,
  `services` varchar(255) default NULL,
  `timeDuration` int(11) default NULL,
  `maintenanceCost` bigint(20) default NULL,
  `marketingUserID` varchar(255) default NULL,
  PRIMARY KEY  (`receiptNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `repairinginfo` */

insert  into `repairinginfo`(`receiptNo`,`companyName`,`address`,`contactNo`,`services`,`timeDuration`,`maintenanceCost`,`marketingUserID`) values ('1','atishay','jhansi',92992,'brushing',5,21432,NULL);

/*Table structure for table `salaryarihanttransformers` */

DROP TABLE IF EXISTS `salaryarihanttransformers`;

CREATE TABLE `salaryarihanttransformers` (
  `marketingUserID` varchar(255) NOT NULL,
  `salary` bigint(20) default NULL,
  `incentives` bigint(20) default NULL,
  PRIMARY KEY  (`marketingUserID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `salaryarihanttransformers` */

insert  into `salaryarihanttransformers`(`marketingUserID`,`salary`,`incentives`) values ('22354',34325,4325);

/*Table structure for table `schoolspring` */

DROP TABLE IF EXISTS `schoolspring`;

CREATE TABLE `schoolspring` (
  `rollNo` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `contactNo` int(11) default NULL,
  `address` varchar(255) default NULL,
  `schoolName` varchar(255) default NULL,
  PRIMARY KEY  (`rollNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `schoolspring` */

insert  into `schoolspring`(`rollNo`,`name`,`contactNo`,`address`,`schoolName`) values (11,'a',32181,'jhansi','bbps'),(12,'a',32181,'jhansi','bbps'),(18,'atishay',32181,'jhansi','bbps');

/*Table structure for table `sharenewstable` */

DROP TABLE IF EXISTS `sharenewstable`;

CREATE TABLE `sharenewstable` (
  `heading` varchar(40) default NULL,
  `news` varchar(1000) default NULL,
  `photocaption` varchar(100) default NULL,
  `uploadphoto` blob,
  `newssource` varchar(30) default NULL,
  `name` varchar(40) default NULL,
  `email` varchar(27) NOT NULL,
  `contactno` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sharenewstable` */

insert  into `sharenewstable`(`heading`,`news`,`photocaption`,`uploadphoto`,`newssource`,`name`,`email`,`contactno`) values ('dasddd',NULL,'ascsa','sacd',NULL,'asdcaczx','vv','vzxv'),('a',NULL,'c','d','e','f','g','h'),('news',NULL,'marriage','100*10','atishay jain','abhi jain','ati@gmail.com','8004327378'),('jhansi','jhansi','26.jpg','26.jpg','abhi','ati','a2a2@','890'),('u.p','jhansi','theft','10th.jpg','abhbi','sdas','dd','321'),('ssdsdg','','','','','','','');

/*Table structure for table `signupaccountant` */

DROP TABLE IF EXISTS `signupaccountant`;

CREATE TABLE `signupaccountant` (
  `username` varchar(255) NOT NULL,
  `email` varchar(255) default NULL,
  `contactno` bigint(20) default NULL,
  `city` varchar(255) default NULL,
  `gender` varchar(255) default NULL,
  `workexperience` int(11) default NULL,
  `password` varchar(255) default NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `signupaccountant` */

insert  into `signupaccountant`(`username`,`email`,`contactno`,`city`,`gender`,`workexperience`,`password`) values ('a','a',23,'a','female',1,'a'),('atishay','aj@gmail.com',8000,'jhansi','male',2,'aj');

/*Table structure for table `signupoperator` */

DROP TABLE IF EXISTS `signupoperator`;

CREATE TABLE `signupoperator` (
  `username` varchar(20) NOT NULL default '',
  `department` varchar(20) default NULL,
  `email` varchar(20) default NULL,
  `contactno` bigint(10) default NULL,
  `city` varchar(20) default NULL,
  `gender` varchar(10) default NULL,
  `password` varchar(16) default NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `signupoperator` */

insert  into `signupoperator`(`username`,`department`,`email`,`contactno`,`city`,`gender`,`password`) values ('a','a','a',435253,'a','a',NULL),('abhi','testing','aaa',3242,'jhasi','male','aad');

/*Table structure for table `subscribetable` */

DROP TABLE IF EXISTS `subscribetable`;

CREATE TABLE `subscribetable` (
  `name` char(25) default NULL,
  `email` varchar(25) NOT NULL,
  `mobileno` varchar(10) NOT NULL default '',
  `address` varchar(50) default NULL,
  PRIMARY KEY  (`email`,`mobileno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `subscribetable` */

insert  into `subscribetable`(`name`,`email`,`mobileno`,`address`) values ('abhiiiii','abhi@gmail.com','9144288900','jhansi'),('atishay','atishay@gmail.com','8004327378','vishnupuri,indore'),('shiv','shiv@gmail.com','7000012321','vishnupuri,indore'),('shivpratap','shivis@gmail.com','345346','indore');

/*Table structure for table `usertable` */

DROP TABLE IF EXISTS `usertable`;

CREATE TABLE `usertable` (
  `Username` varchar(20) NOT NULL,
  `Contactno` int(11) NOT NULL,
  `Address` varchar(40) default NULL,
  `City` char(15) default NULL,
  `Gender` char(12) default NULL,
  `SecurityQuestion` varchar(20) default NULL,
  `Password` varchar(15) default NULL,
  PRIMARY KEY  (`Username`,`Contactno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usertable` */

insert  into `usertable`(`Username`,`Contactno`,`Address`,`City`,`Gender`,`SecurityQuestion`,`Password`) values ('abhi',344,'sipri','jhansi','male','praveen','aaa'),('assfsa',3453453,'sfsfssgs','sddsgs','female','fsdgsddgs','ergger'),('atishay',324234,'sdfdf','jhansi','female','sf','ssd'),('d',342523,'asdas','aasds','female','assad','fsaffs'),('daas',678,'hjghhk','khj','female','kljk','Xaada'),('das',345353,'dsdf','indore','female','asdfsf','dfaaf'),('ssfgsf',7855,'uigyuf','guudw','male','xjjk','jsg');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
