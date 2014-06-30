package com.cobia.dao;

import com.cobia.domain.CommentView;
import com.cobia.type.CommentType;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commentViewDao")
public class CommentViewDao extends BaseDao<CommentView> {
	public List<CommentView> pageComments(String code) {
		Session session = getCustomHibernateTemplate().getSessionFactory().getCurrentSession();
		String query = String.format( "from com.cobia.domain.CommentView where target='%s' and type=%d", code, CommentType.PAGE_COMMENT.getValue());
		List list = session.createQuery(query).list();
		return (List<CommentView>) session.createQuery(query).list();
	}
}