package com.cobia.dao;

import com.cobia.domain.Comment;
import org.springframework.stereotype.Repository;

@Repository("commentDao")
public class CommentDao extends BaseDao<Comment> {
}
