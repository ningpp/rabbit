package me.ningpp.rabbit;

import java.util.List;
import java.util.Objects;

public interface Translator<S, T> {

    List<T> translate(String fileName, S source, TranslateContext context);

    default List<T> translate(List<S> sources, TranslateContext context) {
        return translate("", sources, context);
    }

    default List<T> translate(String fileName, List<S> sources, TranslateContext context) {
        if (sources == null) {
            return List.of();
        }
        return sources.stream().filter(Objects::nonNull)
                .map(s -> translate(fileName, s, context))
                .flatMap(List::stream).toList();
    }

    default List<T> translate(S source, TranslateContext context) {
        return translate("", source, context);
    }

}
