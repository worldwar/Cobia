package com.cobia.main;

import com.cobia.dao.AccountDao;
import com.cobia.dao.ProfileDao;
import com.cobia.domain.Account;
import com.cobia.domain.Profile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        AccountDao accountDao = (AccountDao)context.getBean("accountDao");
        //accountDao.save(new Account("222111333", "haha@163.com", "111222"));
        ProfileDao profileDao = (ProfileDao)context.getBean("profileDao");
        profileDao.save(new Profile("222111333", "1", "朱然", "http://www.idpmultimedia.com.au/tv/images/cutouts/cutout_dinosaur.gif"));
    }
}