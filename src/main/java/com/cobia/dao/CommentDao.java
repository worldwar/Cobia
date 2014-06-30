package com.cobia.dao;

import com.cobia.domain.Comment;
import com.cobia.type.CommentType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commentDao")
public class CommentDao extends BaseDao<Comment> {
	public List<Comment> pageComments(String code) {
		String query = String.format( "from Comment where code='%s' + type=%d", code, CommentType.PAGE_COMMENT.getValue());
		return (List<Comment>) getSessionFactory().getCurrentSession().createQuery(query).list();
	}
}