package com.cobia.dao;

import com.cobia.domain.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("bookDao")
@Transactional
public class BookDao extends BaseDao<Book> {
}
