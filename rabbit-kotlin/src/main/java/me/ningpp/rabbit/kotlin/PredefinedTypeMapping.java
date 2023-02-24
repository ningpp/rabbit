package me.ningpp.rabbit.kotlin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * TODO support nint,nuint?
 */
public final class PredefinedTypeMapping {

    private PredefinedTypeMapping() {
    }

    private static final Map<String, String> MAPPING = new HashMap<>();
    private static final Set<String> PRIMITIVE_TYPES = Set.of(
            "Boolean", "Char",
            "Float", "Double",
            "Byte", "Short",
            "Int", "Long",
            "UByte", "UShort",
            "UInt", "ULong"
    );

    public static String getKotlinType(String csharpType) {
        return MAPPING.get(csharpType);
    }

    public static boolean isPrimitiveType(String type) {
        return PRIMITIVE_TYPES.contains(type);
    }

    static {
        //https://discuss.kotlinlang.org/t/d128-basic-type/3953/7
        //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/java.math.-big-decimal/
        MAPPING.put("decimal", "BigDecimal");

        //https://learn.microsoft.com/en-us/dotnet/csharp/language-reference/builtin-types/integral-numeric-types
        MAPPING.put("nint", "Long");
        MAPPING.put("nuint", "ULong");

        MAPPING.put("bool", "Boolean");
        MAPPING.put("char", "Char");
        MAPPING.put("float", "Float");
        MAPPING.put("double", "Double");

        MAPPING.put("sbyte", "Byte");
        MAPPING.put("short", "Short");
        MAPPING.put("int", "Int");
        MAPPING.put("long", "Long");

        MAPPING.put("byte", "UByte");
        MAPPING.put("ushort", "UShort");
        MAPPING.put("uint", "UInt");
        MAPPING.put("ulong", "ULong");

        MAPPING.put("string", "String");
        MAPPING.put("object", "Object");
        MAPPING.put("dynamic", "Object");

        MAPPING.put("var", "var");

        MAPPING.put("void", "void");
    }

}
