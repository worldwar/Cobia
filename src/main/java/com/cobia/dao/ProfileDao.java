package com.cobia.dao;

import com.cobia.domain.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("profileDao")
@Transactional
public class ProfileDao extends BaseDao<Profile>{
}