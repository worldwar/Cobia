package com.cobia.domain;

import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "BOOK")
@Proxy(lazy = false)
public class Book {
	@Id
	@Column(name = "CODE")
	private String code;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "STATUS")
	private int status;
	@Column(name = "PAGE_COUNT")
	private int pageCount;
	@Column(name = "CHAPTER_COUNT")
	private int chapterCount;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "COVER")
	private String cover;
	@Column(name = "INTRO")
	private String intro;
	@Column(name = "CREATE_TIME")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime createTime;
	@Column(name = "PUBLISH_TIME")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime publishTime;

	public Book() {
	}

	public Book(String code, String author, int status, int pageCount, int chapterCount, String title, String cover, String intro, LocalDateTime createTime, LocalDateTime publishTime) {
		this.code = code;
		this.author = author;
		this.status = status;
		this.pageCount = pageCount;
		this.chapterCount = chapterCount;
		this.title = title;
		this.cover = cover;
		this.intro = intro;
		this.createTime = createTime;
		this.publishTime = publishTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getChapterCount() {
		return chapterCount;
	}

	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(LocalDateTime publishTime) {
		this.publishTime = publishTime;
	}
}
