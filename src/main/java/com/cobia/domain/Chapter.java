package com.cobia.domain;

import org.hibernate.annotations.Proxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CHAPTER")
@Proxy(lazy = false)
public class Chapter {
	@Id
	@Column(name = "CODE")
	private String code;
	@Column(name = "BOOK")
	private String book;
	@Column(name = "POSITION")
	private int position;
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

	public Chapter(String code, String book, int position, String title, String intro, int style, int pageCount) {
		this.code = code;
		this.book = book;
		this.position = position;
		this.title = title;
		this.intro = intro;
		this.style = style;
		this.pageCount = pageCount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}