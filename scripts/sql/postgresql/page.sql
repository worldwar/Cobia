create table PAGE(
    CODE VARCHAR(16) PRIMARY KEY,
    CHAPTER VARCHAR(16),
    POSITION INT,
    IMAGE VARCHAR(256),
    CREATE_TIME TIMESTAMP
);

INSERT INTO PAGE (CODE, CHAPTER, POSITION, IMAGE, CREATE_TIME) VALUES
	('page000001', 'chapter0001111', 1, 'http://worldwar.u.qiniudn.com/chapter01-01.png', '2014-06-19 16:54:47'),
	('page000002', 'chapter0001111', 2, 'http://worldwar.u.qiniudn.com/chapter01-02.png', '2014-06-19 16:54:48'),
	('page000003', 'chapter0001112', 1, 'http://worldwar.u.qiniudn.com/chapter02-01.png', '2014-06-19 17:10:46'),
	('page000004', 'chapter0001112', 2, 'http://worldwar.u.qiniudn.com/chapter02-02.png', '2014-06-19 17:10:48');