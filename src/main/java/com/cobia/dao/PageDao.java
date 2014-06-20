package com.cobia.dao;

import com.cobia.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("pageDao")
@Transactional
public class PageDao extends BaseDao<Page> {
}