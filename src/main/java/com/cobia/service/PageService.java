package com.cobia.service;

import com.cobia.dao.BookDao;
import com.cobia.dao.ChapterDao;
import com.cobia.dao.PageDao;
import com.cobia.dao.ProfileDao;
import com.cobia.domain.Book;
import com.cobia.domain.Chapter;
import com.cobia.domain.Page;
import com.cobia.util.DateTimeUtil;
import com.cobia.util.GsonFactory;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("pageService")
public class PageService {

	@Resource
	private  ChapterDao chapterDao;
	@Resource
	private  BookDao bookDao;
	@Resource
	private  ProfileDao profileDao;
	@Resource
	private PageDao pageDao;

	public Map<String, String> retrieve(String code) {
		Page page = pageDao.load(code);
		Chapter chapter = chapterDao.load(page.getChapter());
		Book book = bookDao.load(chapter.getBook());
		Gson gson = GsonFactory.newGson();
		String chapterJson = gson.toJson(chapter);
		String bookJson = gson.toJson(book);
		Map<String, String> objects = new HashMap<String, String>();
		objects.put("code", page.getCode());
		objects.put("book", bookJson);
		objects.put("chapter", chapterJson);
		objects.put("image-url", page.getImage());
		objects.put("index", String.valueOf(page.getIndex()));
		objects.put("create-time", DateTimeUtil.toString(page.getCreateTime()));
		return objects;
	}
}
