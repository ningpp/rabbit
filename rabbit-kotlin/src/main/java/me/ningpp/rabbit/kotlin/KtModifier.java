package me.ningpp.rabbit.kotlin;

import org.mybatis.generator.api.dom.kotlin.KotlinModifier;

public enum KtModifier {
    //classModifier
    ENUM(KotlinModifier.ENUM),
    SEALED(KotlinModifier.SEALED),
    ANNOTATION(KotlinModifier.ANNOTATION),
    DATA(KotlinModifier.DATA),
    INNER(KotlinModifier.INNER),
    VALUE(KotlinModifier.VALUE),

    //memberModifier
    OVERRIDE(KotlinModifier.OVERRIDE),
    LATEINIT(KotlinModifier.LATEINIT),

    //visibilityModifier
    PUBLIC(KotlinModifier.PUBLIC),
    PRIVATE(KotlinModifier.PRIVATE),
    INTERNAL(KotlinModifier.INTERNAL),
    PROTECTED(KotlinModifier.PROTECTED),

    //varianceModifier
    IN(KotlinModifier.IN),
    OUT(KotlinModifier.OUT),

    //functionModifier
    TAILREC(KotlinModifier.TAILREC),
    OPERATOR(KotlinModifier.OPERATOR),
    INFIX(KotlinModifier.INFIX),
    INLINE(KotlinModifier.INLINE),
    EXTERNAL(KotlinModifier.EXTERNAL),
    SUSPEND(KotlinModifier.SUSPEND),

    //propertyModifier
    CONST(KotlinModifier.CONST),

    //inheritanceModifier
    ABSTRACT(KotlinModifier.ABSTRACT),
    FINAL(KotlinModifier.FINAL),
    OPEN(KotlinModifier.OPEN);

    private final KotlinModifier kotlinModifier;

    KtModifier(KotlinModifier kotlinModifier) {
        this.kotlinModifier = kotlinModifier;
    }

    public KotlinModifier getKotlinModifier() {
        return kotlinModifier;
    }
}
