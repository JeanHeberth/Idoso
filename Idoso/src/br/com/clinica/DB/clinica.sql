CREATE DATABASE  IF NOT EXISTS `clinica` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `clinica`;
-- MySQL dump 10.16  Distrib 10.1.31-MariaDB, for Win32 (AMD64)
--
-- Host: 127.0.0.1    Database: clinica
-- ------------------------------------------------------
-- Server version	10.1.31-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cuidador`
--

DROP TABLE IF EXISTS `cuidador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuidador` (
  `cpf` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `email` varchar(45) NOT NULL,
  `cursos` varchar(45) NOT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuidador`
--

LOCK TABLES `cuidador` WRITE;
/*!40000 ALTER TABLE `cuidador` DISABLE KEYS */;
INSERT INTO `cuidador` VALUES ('00000000001','Elizabeth Taylor','61-99256556','elizabeth@gmail.com','Ressucitação / AVC'),('12345678910','Samantha Antunes','99-99999999','samantinha@gmail.com','Primeiros socorros');
/*!40000 ALTER TABLE `cuidador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paciente` (
  `cpf` varchar(11) NOT NULL,
  `nome_paciente` varchar(45) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `nome_responsavel` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES ('00010110154','Joana D\'arcas','61995588992','Zenão Siva','zenao@hotmail.com'),('00022233345','Joaquim da Silva Neto','6199234556','Carla Barreto','carla@gmail.com'),('12345678911','Rosa Maria dos Santos','61985004976','Dalva Souza','dalva@gmail.com');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicos`
--

DROP TABLE IF EXISTS `servicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicos` (
  `horario` varchar(45) NOT NULL,
  `observacoes` varchar(45) NOT NULL,
  `cpf_cuidador` varchar(11) NOT NULL,
  `cpf_paciente` varchar(11) NOT NULL,
  KEY `cpf_cuidador` (`cpf_cuidador`),
  KEY `cpf_paciente` (`cpf_paciente`),
  CONSTRAINT `servicos_ibfk_1` FOREIGN KEY (`cpf_cuidador`) REFERENCES `cuidador` (`cpf`),
  CONSTRAINT `servicos_ibfk_2` FOREIGN KEY (`cpf_paciente`) REFERENCES `paciente` (`cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicos`
--

LOCK TABLES `servicos` WRITE;
/*!40000 ALTER TABLE `servicos` DISABLE KEYS */;
INSERT INTO `servicos` VALUES ('10h','Testando','12345678910','12345678911'),('19 às 7h','Paciente cadeirante ','00000000001','00022233345'),('7 às 14h','Paciente Acamado ','12345678910','00010110154');
/*!40000 ALTER TABLE `servicos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-27 18:02:23
