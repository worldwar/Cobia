package com.cobia.domain;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "COMMENT")
public class Comment {
	@Id
	@Column(name = "CODE")
	private String code;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "TARGET")
	private String target;
	@Column(name = "TARGET_TYPE")
	private int targetType;
	@Column(name = "CONTENT")
	private String content;
	@Column(name = "CREATE_TIME")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime createTime;

	public Comment() {
	}

	public Comment(String code, String author, String target, int targetType, String content, LocalDateTime createTime) {
		this.code = code;
		this.author = author;
		this.target = target;
		this.targetType = targetType;
		this.content = content;
		this.createTime = createTime;
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

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getTargetType() {
		return targetType;
	}

	public void setTargetType(int targetType) {
		this.targetType = targetType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
}
