package me.ningpp.rabbit.kotlin.translator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.OperatorDeclarationInfo;

public class OperatorDeclarationTranslator implements Translator<OperatorDeclarationInfo, KotlinNamedItem> {

    private static final OperatorDeclarationTranslator INSTANCE = new OperatorDeclarationTranslator();

    public static OperatorDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, OperatorDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        //== !=需要特殊处理 equals
        //> <  >=  <=需要特殊处理 compareTo
        return List.of();
    }

    //https://learn.microsoft.com/en-us/dotnet/csharp/language-reference/operators/operator-overloading
    //https://kotlinlang.org/docs/operator-overloading.html
    private static final Map<String, String> OPERATOR_MAPPING = new HashMap<>();
    static {
        OPERATOR_MAPPING.put("++", "inc");
        OPERATOR_MAPPING.put("--", "dec");

        OPERATOR_MAPPING.put("+", "plus");
        OPERATOR_MAPPING.put("-", "minus");
        OPERATOR_MAPPING.put("*", "times");
        OPERATOR_MAPPING.put("/", "div");
        OPERATOR_MAPPING.put("%", "rem");

        OPERATOR_MAPPING.put("+=", "plusAssign");
        OPERATOR_MAPPING.put("-=", "minusAssign");
        OPERATOR_MAPPING.put("*=", "timesAssign");
        OPERATOR_MAPPING.put("/=", "divAssign");
        OPERATOR_MAPPING.put("%=", "remAssign");
    }

}
