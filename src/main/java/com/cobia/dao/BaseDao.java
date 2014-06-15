package com.cobia.dao;

import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
@Transactional
public class BaseDao<T> extends HibernateDaoSupport implements Dao<T> {
    private Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public BaseDao() {
        this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public HibernateTemplate getCustomHibernateTemplate() {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(getSessionFactory());
        hibernateTemplate.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        return hibernateTemplate;
    }

    @Resource
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Override
    public void save(T entity) {
        getCustomHibernateTemplate().save(entity);
    }

    @Override
    public void update(T entity) {
        getCustomHibernateTemplate().update(entity);
    }

    @Override
    public void delete(T entity) {
        getCustomHibernateTemplate().delete(entity);
    }

    @Override
    public T load(String code)
    {
        return getCustomHibernateTemplate().load(entityClass, code);
    }
}
