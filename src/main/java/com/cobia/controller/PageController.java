package com.cobia.controller;

import com.cobia.domain.Book;
import com.cobia.domain.Chapter;
import com.cobia.domain.Comment;
import com.cobia.domain.CommentView;
import com.cobia.service.PageService;
import com.cobia.util.GsonFactory;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class PageController {

	@Resource
	private PageService pageService;

	@RequestMapping(value = "/page/code={code}")
	public ModelAndView retrieve(@PathVariable String code) {
		ModelAndView modelAndView = new ModelAndView("page");
		Map<String, String> objects = pageService.retrieve(code);
		modelAndView.addObject("pageCode", objects.get("code"));
		modelAndView.addObject("imageUrl", objects.get("image-url"));
		modelAndView.addObject("index", objects.get("index"));
		modelAndView.addObject("createTime", objects.get("create-time"));
		modelAndView.addObject("index", objects.get("index"));
		Gson gson = GsonFactory.newGson();
		Book book = gson.fromJson(objects.get("book"), Book.class);
		modelAndView.addObject("book", book);
		Chapter chapter = gson.fromJson(objects.get("chapter"), Chapter.class);
		modelAndView.addObject("chapter", chapter);
		modelAndView.addObject("comments", gson.fromJson(objects.get("comments"), new TypeToken<List<CommentView>>(){}.getType()));
//		modelAndView.addObject("pageJson", pageService.retrieve(code));
		return modelAndView;
	}

	@RequestMapping("/json/page/code={code}")
	@ResponseBody
	public String retrieveJson(@PathVariable String code) {
		return new Gson().toJson(pageService.retrieve(code));
	}
}
