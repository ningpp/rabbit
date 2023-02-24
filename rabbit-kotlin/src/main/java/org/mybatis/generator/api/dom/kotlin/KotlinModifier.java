package org.mybatis.generator.api.dom.kotlin;

public enum KotlinModifier {
    ENUM("enum"),
    SEALED("sealed"),
    ANNOTATION("annotation"),
    DATA("data"),
    INNER("inner"),
    VALUE("value"),

    //memberModifier
    OVERRIDE("override"),
    LATEINIT("lateinit"),

    //visibilityModifier
    PUBLIC("public"),
    PRIVATE("private"),
    INTERNAL("internal"),
    PROTECTED("protected"),

    //varianceModifier
    IN("in"),
    OUT("out"),

    //functionModifier
    TAILREC("tailrec"),
    OPERATOR("operator"),
    INFIX("infix"),
    INLINE("inline"),
    EXTERNAL("external"),
    SUSPEND("suspend"),

    //propertyModifier
    CONST("const"),

    //inheritanceModifier
    ABSTRACT("abstract"),
    FINAL("final"),
    OPEN("open");

    private final String value;

    KotlinModifier(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
