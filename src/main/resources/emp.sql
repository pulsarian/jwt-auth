/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 8.0.16 : Database - fms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `fms`;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `emp_id` varchar(50) NOT NULL,
  `emp_name` varchar(50) DEFAULT NULL,
  `emp_bu` varchar(50) DEFAULT NULL,
  `emp_mail` varchar(50) DEFAULT NULL,
  `emp_contact` varchar(50) DEFAULT NULL,
  `emp_username` varchar(50) DEFAULT NULL,
  `emp_password` varchar(50) DEFAULT NULL,
  `emp_roles` varchar(50) DEFAULT NULL,
  `emp_enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `employee` */

insert  into `employee`(`emp_id`,`emp_name`,`emp_bu`,`emp_mail`,`emp_contact`,`emp_username`,`emp_password`,`emp_roles`,`emp_enabled`) values ('847021','Abhishek','DigitalEngg','abhishek.gorai@cognizant.com','+91 9096367087','admin','admin','ROLE_ADMIN, ROLE_POC',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
