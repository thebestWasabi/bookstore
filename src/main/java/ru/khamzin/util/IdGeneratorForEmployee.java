package ru.khamzin.util;

import java.util.List;
import java.util.function.Function;

public class IdGeneratorForEmployee {

    public static <T> long generatedId(List<T> items, Function<T, Long> idExtractor) {
        return items.stream()
                .mapToLong(idExtractor::apply)
                .max().orElse(0) + 1;
    }

}
