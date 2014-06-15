package com.cobia.main;

import com.cobia.dao.AccountDao;
import com.cobia.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        AccountDao accountDao = (AccountDao)context.getBean("accountDao");
        accountDao.save(new Account("222111333", "haha@163.com", "111222"));
    }
}