package com.cobia.main;

import com.cobia.dao.*;
import com.cobia.domain.*;
import org.joda.time.LocalDateTime;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        AccountDao accountDao = (AccountDao)context.getBean("accountDao");
        //accountDao.save(new Account("222111333", "haha@163.com", "111222"));
        ProfileDao profileDao = (ProfileDao)context.getBean("profileDao");
        //profileDao.save(new Profile("222111333", "1", "朱然", "http://www.idpmultimedia.com.au/tv/images/cutouts/cutout_dinosaur.gif"));
		BookDao bookDao = (BookDao)context.getBean("bookDao");
//		bookDao.save(new Book("book456789456", "222111333", 1, 10, 2, "摩登时代",
//				"http://blahblah.com", "这是查理·卓别林(Charles Chaplin)一部非常优秀的作品，因为这部影片超越了其他单纯以他个人特点为卖点的悲剧性主题作品，改而反映了当时社会中一些重要的问题。",
//				new LocalDateTime(), new LocalDateTime()));
		ChapterDao chapterDao = (ChapterDao)context.getBean("chapterDao");
//		chapterDao.save(new Chapter("chapter0001112", "book456789456", 1, "荒蛮时代", "人类社会初级阶段", 1, 2));
		PageDao pageDao = (PageDao) context.getBean("pageDao");
		pageDao.save(new Page("page000003", "chapter0001112", 1, "http://worldwar.u.qiniudn.com/chapter02-01.png", new LocalDateTime()));
		pageDao.save(new Page("page000004", "chapter0001112", 2, "http://worldwar.u.qiniudn.com/chapter02-02.png", new LocalDateTime()));
    }
}