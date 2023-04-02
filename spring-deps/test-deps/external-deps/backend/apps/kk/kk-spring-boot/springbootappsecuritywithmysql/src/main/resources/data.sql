  INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
	('sean', '$2a$10$jqH4xT5DixjeThcVITk4nu47TLRZqsfsJaiAYVRiLsJIreghj78Xe', 'Sean Murphy', 'ROLE_ADMIN', 'US', 1),
	('pushkar', '$2a$10$jqH4xT5DixjeThcVITk4nu47TLRZqsfsJaiAYVRiLsJIreghj78Xe', 'Sean Murphy', 'ROLE_ADMIN', 'US', 1),
	('martin', '$2a$10$TSy9JCIPgOWcGZ8psgXyZeg/4Sp3ICmK8VCjJdTsaNSyKWnrqHK2.', 'Martin Bingel', 'ROLE_USER', 'India', 1); 

   INSERT INTO `topics` (`topic_id`, `title`, `category`) VALUES
	(1, 'Spring Rest Boot', 'Spring Boot'),
	(2, 'Spring Boot Security', 'Spring Boot'),
	(3, 'Spring MVC Framework', 'Spring Framework');