package com.cobia.dao;

import com.cobia.domain.Account;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("accountDao")
@Transactional
public class AccountDao extends BaseDao<Account>{
}