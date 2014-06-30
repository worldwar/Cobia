package com.cobia.type;

public enum CommentType {
	PAGE_COMMENT(1), BOOK_COMMENT(2);
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