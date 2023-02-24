package me.ningpp.rabbit.util;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public static String toJson(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return OBJECT_MAPPER.writeValueAsString(obj);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static <T> T getBean(InputStream stream, Class<T> clazz) {
        if (stream == null) {
            return null;
        }
        try {
            return OBJECT_MAPPER.readValue(stream, clazz);
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static <T> List<T> getList(InputStream stream, Class<T> clazz) {
        if (stream == null) {
            return List.of();
        }
        try {
            JavaType listJavaType = OBJECT_MAPPER.getTypeFactory()
                    .constructParametricType(List.class, clazz);
            List<T> result = OBJECT_MAPPER.readValue(stream, listJavaType);
            return result != null
                    ? result.stream().filter(Objects::nonNull)
                    .collect(Collectors.toList())
                    : List.of();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

}
