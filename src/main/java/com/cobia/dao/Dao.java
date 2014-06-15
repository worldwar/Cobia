package com.cobia.dao;

public interface Dao<T> {
    public void save(T entity);

    public void update(T entity);

    public void delete(T entity);

    public T load(String code);
}