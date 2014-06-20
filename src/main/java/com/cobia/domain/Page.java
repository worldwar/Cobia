package com.cobia.domain;

import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "PAGE")
@Proxy(lazy = false)
public class Page {
	@Id
	@Column(name = "CODE")
	private String code;
	@Column(name = "CHAPTER")
	private String chapter;
	//index is a reserved word in mysql
	//so quote it with "``"
	@Column(name = "`INDEX`")
	private int index;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "CREATE_TIME")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime createTime;

	public Page() {
	}

	public Page(String code, String chapter, int index, String image, LocalDateTime createTime) {
		this.code = code;
		this.chapter = chapter;
		this.index = index;
		this.image = image;
		this.createTime = createTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
}
