use mydb;

create TABLE image(
	id BIGINT NOT NULL,
	name varchar(100) NOT NULL,
	data BLOB NOT NULL,
	PRIMARY KEY(id)
);

select * from image;

/*
drop table image;
*/