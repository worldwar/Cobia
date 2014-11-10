create table ACCOUNT(
    CODE VARCHAR(16) PRIMARY KEY,
    EMAIL VARCHAR(64) UNIQUE,
    PASSWORD VARCHAR(64)
);


INSERT INTO ACCOUNT (CODE, EMAIL, PASSWORD) VALUES
	('0', '0@0.com', '0'),
	('1', '1@1.com', '1'),
	('2', '2@2.com', '2'),
	('222111333', 'haha@163.com', '111222'),
	('999999', 'comment@cobia.com', '123');
