CREATE TABLE `phones` (
  `phone_id` int NOT NULL,
  `number` varchar(45) DEFAULT NULL,
  `device` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`phone_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `plan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT NULL,
  `international` varchar(255) DEFAULT NULL,
  `minutes` varchar(255) DEFAULT NULL,
  `rate` int DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6v9oyhv17wp72rf92m6pblsgp` (`phone_id`),
  CONSTRAINT `FK6v9oyhv17wp72rf92m6pblsgp` FOREIGN KEY (`phone_id`) REFERENCES `phones` (`phone_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `balance` int DEFAULT NULL,
  `numlines` int DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user_plan` (
  `junc_id` int NOT NULL,
  `user_id` int DEFAULT NULL,
  `plan_id` int DEFAULT NULL,
  PRIMARY KEY (`junc_id`),
  KEY `FKfgwof219hqbrb6am5awwan8r2` (`plan_id`),
  KEY `FKr1gojepx9qoalgmd17gurr1dl` (`user_id`),
  CONSTRAINT `FKfgwof219hqbrb6am5awwan8r2` FOREIGN KEY (`plan_id`) REFERENCES `plan` (`id`),
  CONSTRAINT `FKr1gojepx9qoalgmd17gurr1dl` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;