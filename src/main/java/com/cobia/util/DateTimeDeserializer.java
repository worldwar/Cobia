package com.cobia.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.joda.time.LocalDateTime;

import java.lang.reflect.Type;

public class DateTimeDeserializer implements JsonDeserializer<LocalDateTime> {
	@Override
	public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		String dateTimeString = json.getAsString();
		return DateTimeUtil.parse(dateTimeString);
	}
}
