-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: invoicingsystem
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `buyer`
--

DROP TABLE IF EXISTS `buyer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `buyer` (
  `id` int(11) NOT NULL,
  `buyerNumber` varchar(25) NOT NULL,
  `buyerName` varchar(15) NOT NULL,
  `contactInformation` varchar(25) NOT NULL,
  `productionCategory` varchar(45) NOT NULL,
  `purchasingCategories` varchar(45) NOT NULL,
  `legalPerson` varchar(15) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `sex` varchar(5) NOT NULL,
  `post` varchar(15) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `remarks` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buyer`
--

LOCK TABLES `buyer` WRITE;
/*!40000 ALTER TABLE `buyer` DISABLE KEYS */;
/*!40000 ALTER TABLE `buyer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientbalancerecord`
--

DROP TABLE IF EXISTS `clientbalancerecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `clientbalancerecord` (
  `id` int(11) NOT NULL,
  `clientsNumber` varchar(25) NOT NULL,
  `month` varchar(5) NOT NULL,
  `lastMonth'sBalance` varchar(45) NOT NULL,
  `remittanceDate` varchar(45) NOT NULL,
  `remittanceBalance` varchar(45) NOT NULL,
  `purchaseBalance` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientbalancerecord`
--

LOCK TABLES `clientbalancerecord` WRITE;
/*!40000 ALTER TABLE `clientbalancerecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientbalancerecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clients`
--

DROP TABLE IF EXISTS `clients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `clientsNumber` varchar(25) NOT NULL,
  `clientsName` varchar(45) NOT NULL,
  `clientsType` varchar(45) NOT NULL,
  `balance` varchar(15) NOT NULL,
  `clientsContact` varchar(15) NOT NULL,
  `clientsSex` varchar(5) NOT NULL,
  `clientsPost` varchar(25) NOT NULL,
  `contactInformation` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `remarks` varchar(60) DEFAULT NULL,
  `other` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clients`
--

LOCK TABLES `clients` WRITE;
/*!40000 ALTER TABLE `clients` DISABLE KEYS */;
/*!40000 ALTER TABLE `clients` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `goods`
--

DROP TABLE IF EXISTS `goods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `goods` (
  `goodsId` int(11) NOT NULL,
  `goodsNumber` varchar(25) NOT NULL,
  `goodsName` varchar(25) NOT NULL,
  `abbreviation` varchar(25) NOT NULL,
  `brand` varchar(25) NOT NULL,
  `model` varchar(25) NOT NULL,
  `goodsNo.` varchar(25) NOT NULL,
  `material` varchar(15) NOT NULL,
  `colour` varchar(10) NOT NULL,
  `type` varchar(25) NOT NULL,
  `specifications` varchar(25) NOT NULL,
  `unit` varchar(15) NOT NULL,
  `weight` varchar(15) NOT NULL,
  `stock` varchar(15) NOT NULL,
  `buyingPrice` varchar(15) NOT NULL,
  `retailPrice` varchar(15) NOT NULL,
  `placeOfProduction` varchar(45) NOT NULL,
  `qualityGuaranteePeriod` varchar(5) NOT NULL,
  `remarks` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`goodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goods`
--

LOCK TABLES `goods` WRITE;
/*!40000 ALTER TABLE `goods` DISABLE KEYS */;
/*!40000 ALTER TABLE `goods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `order` (
  `id` int(11) NOT NULL,
  `orderNumber` varchar(25) NOT NULL,
  `salesperson` varchar(15) NOT NULL,
  `createTime` varchar(45) NOT NULL,
  `dealTime` varchar(45) NOT NULL,
  `client` varchar(45) NOT NULL,
  `writeAnInvoice` varchar(5) NOT NULL,
  `goodsNumber` varchar(25) NOT NULL,
  `finalPrice` varchar(15) NOT NULL,
  `Numbers` varchar(15) NOT NULL,
  `totalAmount` varchar(15) NOT NULL,
  `typeOfPayment` varchar(15) NOT NULL,
  `typeOfShipping` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchaserecord`
--

DROP TABLE IF EXISTS `purchaserecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `purchaserecord` (
  `id` varchar(45) NOT NULL,
  `createTime` varchar(25) NOT NULL,
  `purchaseTime` varchar(45) NOT NULL,
  `goodsNumber` varchar(25) NOT NULL,
  `numbers` varchar(15) NOT NULL,
  `dicount` varchar(15) NOT NULL,
  `unitPrice` varchar(15) NOT NULL,
  `balance` varchar(15) NOT NULL,
  `taxIncluded` varchar(5) NOT NULL,
  `precautionsForPreservation` varchar(45) NOT NULL,
  `buyer` varchar(25) NOT NULL,
  `remarks` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchaserecord`
--

LOCK TABLES `purchaserecord` WRITE;
/*!40000 ALTER TABLE `purchaserecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchaserecord` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-07 17:31:05
