CREATE TABLE PROFILE (
  CODE varchar(16) NOT NULL,
  TYPE int DEFAULT NULL,
  NAME varchar(32) DEFAULT NULL,
  PORTRAIT varchar(256) DEFAULT NULL,
  PRIMARY KEY (CODE)
) ;

INSERT INTO PROFILE (CODE, TYPE, NAME, PORTRAIT) VALUES
	('0', 2, '无聊看客', 'http://worldwar.u.qiniudn.com/portrait.jpg'),
	('1', 2, '小贱贱', 'http://worldwar.u.qiniudn.com/sheep-portrait.jpg'),
	('112233', 1, '朱然', 'http://blhalbha.com'),
	('2', 2, '多情剑客无比贱', 'http://worldwar.u.qiniudn.com/yf-portrait.jpg'),
	('222111333', 1, '朱然', 'http://www.idpmultimedia.com.au/tv/images/cutouts/cutout_dinosaur.gif'),
	('999999', 1, '特约评论员', 'http://worldwar.u.qiniudn.com/portrait.jpg');