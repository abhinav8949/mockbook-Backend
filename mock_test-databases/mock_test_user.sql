-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: mock_test
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fname` varchar(255) DEFAULT NULL,
  `lname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'lalan@gmail.com','Lalan','Singh','$2a$10$2kVU6jOLlNBWRjHG91b74OugEwUgxCaRxTxAnnG.UbMy7cQ5mGiIG','07324552'),(2,'kundan@gmail.com','Kundan','Kumar','$2a$10$wTckV6uOCI1Rs2OiP4vq1u2h5k2jaNdXVDF9tGd6Tj8AOvEeNiKza','07322213'),(3,'meera@gmail.com','Meera','Kumari','$2a$10$WJjhmNB2cpXSMsHpol6HB.4EQ2HJHHHMzpTdqJNGGeBG60Z5XYbkC','0742435'),(52,'sales@gmail.com','Mockbook','sales','$2a$10$cS9mEBtsdoxD6ovdxZ7dXuiEBzbNb3pRn02QpgMrrMVEdLg3jqjLm','0742435'),(53,'admin@gmail.com','Mockbook','admin','$2a$10$jvczhdphHSZrZmmlwQq.d.m8k3r4JwG5vIP82R8pbV3RAlLqyI3gO','0742435'),(102,'abhishek@gmail.com','Abhishek','Singh','$2a$10$PvVhuxrQyoPVoJJThfZQZeFaPYkr9BdDK4KbfvSoM4IzC.AcYXlAC','07324552'),(152,'lata@gmail.com','Lata','Mangeskar','$2a$10$q98a3NybYuiP.hnbC2MMSePxX2zX5f7SYwnLjDfUfuvS0Kp0pnMXO','07324552'),(202,'shreya@gmail.com','shreya','ghosal','$2a$10$WU3vKNO1vnUmF46pt4PPmOybYFoi01VZrS66nn4vZjenNMTxvurzG','07324552'),(203,'poonam@gmail.com','Poonam','Tiwari','$2a$10$WGAk.me.Krsv//aSFOeiDuzm8mpnMisGJpuKmkj8CcNAJ2YptNEAu','2425256152'),(204,'monu@gmail.com','Monu','Kumar','$2a$10$c7SNfHLex14pgzSWFdqdNeiIMymrPsj0NYT7iuKgwozBO0VXZVGUS','2542625235'),(205,'akeera@gmail.com','Akeera','Kumari','$2a$10$nXNrpbGRmmw3WlffEYtQLufjY/LSrSsXxTNHE/SqKmeKlRcBpZubC','2424262425'),(206,'amitabh@gmail.com','Amitabh','Bachaan','$2a$10$CbSAbnKKUr.5vucDGscl4uq5eHGZfHLFIL7aRUtV9B8sEboUoF6aG','2425242313'),(252,'teju@gmail.com','tejaswi','yadav','$2a$10$SnVNSsY/KbBYgM/T87YQwe5MraVSNLVWMhzf1pSW0ZZahi1Gxh/yq','3532733535');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-13 18:51:48
