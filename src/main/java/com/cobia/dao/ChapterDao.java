package com.cobia.dao;

import com.cobia.domain.Chapter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("chapterDao")
@Transactional
public class ChapterDao extends BaseDao<Chapter> {
}