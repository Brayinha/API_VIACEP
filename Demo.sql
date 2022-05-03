/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.4.24-MariaDB : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `demo`;

/*Table structure for table `via_cep` */

DROP TABLE IF EXISTS `via_cep`;

CREATE TABLE `via_cep` (
  `id_cep` bigint(20) NOT NULL AUTO_INCREMENT,
  `bairro` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `ibge` varchar(255) DEFAULT NULL,
  `localidade` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `uf` varchar(255) DEFAULT NULL,
  `ddd` varchar(255) DEFAULT NULL,
  `gia` varchar(255) DEFAULT NULL,
  `siafi` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cep`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `via_cep` */

insert  into `via_cep`(`id_cep`,`bairro`,`cep`,`complemento`,`ibge`,`localidade`,`logradouro`,`uf`,`ddd`,`gia`,`siafi`) values 
(6,'Parque Primavera','12722-490','','3513405','Cruzeiro','Rua Jaime Pazini','SP','12','2823','6369'),
(7,'Parque Primavera','12722-490','','3513405','Cruzeiro','Rua Jaime Pazini','SP','12','2823','6369');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
