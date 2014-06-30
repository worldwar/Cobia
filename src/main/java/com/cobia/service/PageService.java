package com.cobia.service;

import com.cobia.dao.*;
import com.cobia.domain.*;
import com.cobia.util.DateTimeUtil;
import com.cobia.util.GsonFactory;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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
	@Resource
	private CommentDao commentDao;
	@Resource
	private CommentViewDao commentViewDao;

	public Map<String, String> retrieve(String code) {
		Page page = pageDao.load(code);
		Chapter chapter = chapterDao.load(page.getChapter());
		Book book = bookDao.load(chapter.getBook());
		List<CommentView> comments = commentViewDao.pageComments(page.getCode());
		Gson gson = GsonFactory.newGson();
		String chapterJson = gson.toJson(chapter);
		String bookJson = gson.toJson(book);
		String commentsJson = gson.toJson(comments);
		Map<String, String> objects = new HashMap<String, String>();
		objects.put("code", page.getCode());
		objects.put("book", bookJson);
		objects.put("chapter", chapterJson);
		objects.put("image-url", page.getImage());
		objects.put("index", String.valueOf(page.getIndex()));
		objects.put("create-time", DateTimeUtil.toString(page.getCreateTime()));
		objects.put("comments", commentsJson);
		return objects;
	}
}
