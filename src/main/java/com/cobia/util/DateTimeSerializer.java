package com.cobia.util;

import com.google.gson.*;
import org.joda.time.LocalDateTime;

import java.lang.reflect.Type;

public class DateTimeSerializer implements JsonSerializer<LocalDateTime> {
	@Override
	public JsonElement serialize(final LocalDateTime localDateTime, final Type typeOfSrc, final JsonSerializationContext context) {
		return new JsonPrimitive(DateTimeUtil.toString(localDateTime));
	}
}