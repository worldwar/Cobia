package com.cobia.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CHAPTER")
public class Chapter {
	@Id
	@Column(name = "CODE")
	private String code;
	@Column(name = "BOOK")
	private String book;
	//index is a reserved word in mysql
	//so quote it with "``"
	@Column(name = "`INDEX`")
	private int index;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "INTRO")
	private String intro;
	@Column(name = "STYLE")
	private int style;
	@Column(name = "PAGE_COUNT")
	private int pageCount;

	public Chapter() {
	}

	public Chapter(String code, String book, int index, String title, String intro, int style, int pageCount) {
		this.code = code;
		this.book = book;
		this.index = index;
		this.title = title;
		this.intro = intro;
		this.style = style;
		this.pageCount = pageCount;
	}

	public String code() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String book() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public int index() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String title() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String intro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int style() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int pageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}