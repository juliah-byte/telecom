#select * from User;
#insert into user(username, password, first_name, last_name, email)
#values("Jetta10", "passWord1", "James", "Smith", "jazy1@gmail.com" );

CREATE TABLE `plan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT NULL,
  `international` varchar(255) DEFAULT NULL,
  `minutes` varchar(255) DEFAULT NULL,
  `rate` int DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK271ok4ss5pcte25w6o3hvv60x` (`user_id`),
  CONSTRAINT `FK271ok4ss5pcte25w6o3hvv60x` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
insert into plan(name, rate, minutes, international, data, text, user_id)
values("Basic",35 , "limited", "limited", "limited", "limited", 1);
insert into plan(name, rate, minutes, international, data, text)
values("Premimum", 45 , "Standard", "Standard", "Standard", "limited");
