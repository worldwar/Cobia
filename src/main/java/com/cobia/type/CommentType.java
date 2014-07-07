package com.cobia.type;

public enum CommentType {
	BOOK_COMMENT(1), PAGE_COMMENT(2), COMMENT_REPLY(3);
	private int value;
	CommentType(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static CommentType from(int value) {
		for (CommentType type : CommentType.values()) {
			if (type.getValue() == value) {
				return type;
			}
		}
		throw new IllegalArgumentException("No constant with value " + value + " found");
	}
}