package com.cobia.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.joda.time.LocalDateTime;

public class GsonFactory {

	private static GsonBuilder gsonBuilder;
	static {
		gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(LocalDateTime.class, new DateTimeSerializer());
		gsonBuilder.registerTypeAdapter(LocalDateTime.class, new DateTimeDeserializer());
	}

	public static Gson newGson() {
		return gsonBuilder.create();
	}
}
