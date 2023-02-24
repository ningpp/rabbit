package me.ningpp.rabbit.csharp;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import me.ningpp.rabbit.kotlin.KtModifier;

public enum CSharpModifier {
    ABSTRACT(KtModifier.ABSTRACT),

    ASYNC(null),

    CONST(KtModifier.CONST),

    INTERNAL(KtModifier.INTERNAL),

    OVERRIDE(KtModifier.OVERRIDE),

    PARTIAL(null),

    PRIVATE(KtModifier.PRIVATE),

    PROTECTED(KtModifier.PROTECTED),

    PUBLIC(KtModifier.PUBLIC),

    STATIC(null),

    ENUM(KtModifier.ENUM),

    FINAL(KtModifier.FINAL),

    OPERATOR(KtModifier.OPERATOR),

    SEALED(KtModifier.SEALED);

    private final KtModifier kotlinModifier;

    CSharpModifier(KtModifier kotlinModifier) {
        this.kotlinModifier = kotlinModifier;
    }

    public KtModifier getKotlinModifier() {
        return kotlinModifier;
    }

    public static List<KtModifier> toKotlin(List<CSharpModifier> modifiers) {
        if (modifiers == null) {
            return List.of();
        }
        return modifiers.stream().map(CSharpModifier::getKotlinModifier)
                .filter(Objects::nonNull).distinct().toList();
    }

    public static List<KtModifier> parse2Kotlin(List<String> values) {
        return toKotlin( parse(values) );
    }

    public static List<CSharpModifier> parse(List<String> values) {
        if (values == null) {
            return List.of();
        }
        return values.stream().filter(StringUtils::isNotEmpty)
                .map(CSharpModifier::parse)
                .filter(Objects::nonNull)
                .distinct().toList();
    }

    public static CSharpModifier parse(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        String upper = value.toUpperCase(Locale.ENGLISH);
        CSharpModifier modifier = null;
        for (var m : CSharpModifier.values()) {
            if (upper.equals(m.name())) {
                modifier = m;
                break;
            }
        }
        return modifier;
    }
}
