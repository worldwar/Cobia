package com.cobia.domain;

import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "COMMENT_VIEW")
@Proxy(lazy = false)
public class CommentView {
	@Id
	@Column(name = "CODE")
	private String code;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "TARGET")
	private String target;
	@Column(name = "TYPE")
	private int type;
	@Column(name = "RECEIVER")
	private String receiver;
	@Column(name = "CONTENT")
	private String content;
	@Column(name = "CREATE_TIME")
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime createTime;
	@Column(name = "AUTHOR_NAME")
	private String authorName;
	@Column(name = "AUTHOR_PORTRAIT")
	private String authorPortrait;
	@Column(name = "RECEIVER_NAME")
	private String receiverName;

	public CommentView() {
	}

	public CommentView(String code, String author, String target, int type, String receiver, String content, LocalDateTime createTime, String authorName, String authorPortrait, String receiverName) {
		this.code = code;
		this.author = author;
		this.target = target;
		this.type = type;
		this.receiver = receiver;
		this.content = content;
		this.createTime = createTime;
		this.authorName = authorName;
		this.authorPortrait = authorPortrait;
		this.receiverName = receiverName;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
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

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorPortrait() {
		return authorPortrait;
	}

	public void setAuthorPortrait(String authorPortrait) {
		this.authorPortrait = authorPortrait;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
}