create table userinfo(
	id INT primary key AUTO_INCREMENT,
	username VARCHAR(16) NOT NULL,
	password VARCHAR(16) NOT NULL,
	email VARCHAR(32),
	cellphone VARCHAR(11),
	fullname VARCHAR(32),
	status INT default 0,
   	creater VARCHAR(32),
   	create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   	updater VARCHAR(32),
   	update_time TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
ALTER TABLE userinfo RENAME TO book_userinfo;

create table basic_data(
	id INT primary key AUTO_INCREMENT,
	basic_value VARCHAR(32) NOT NULL,
	user_id INT,
	parent_id INT,
	status INT default 0,
   	creater VARCHAR(32),
   	create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   	updater VARCHAR(32),
   	update_time TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
ALTER TABLE basic_data RENAME TO book_basic_data;