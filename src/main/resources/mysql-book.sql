CREATE DATABASE IF NOT EXISTS book DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

drop table userinfo;
create table userinfo(
	id INT primary key AUTO_INCREMENT,
	username VARCHAR(16) NOT NULL,
	password VARCHAR(16) NOT NULL,
	email VARCHAR(32),
	cellphone VARCHAR(11),
	fullname VARCHAR(32),
	status INT default 0,
   	creater VARCHAR(32),
   	createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   	updater VARCHAR(32),
   	updateTime TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
select * from userinfo

drop table basicData;
create table basicData(
	id INT primary key AUTO_INCREMENT,
	basicValue VARCHAR(32) NOT NULL,
	userId INT,
	parentId INT,
	status INT default 0,
   	creater VARCHAR(32),
   	createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   	updater VARCHAR(32),
   	updateTime TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
SELECT * FROM basicData
