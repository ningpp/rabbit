package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.NameInfo;

public class NameTranslator implements Translator<NameInfo, String> {

    private static final NameTranslator INSTANCE = new NameTranslator();

    public static NameTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, NameInfo source, TranslateContext context) {
        if (source.getIsVar()) {
            return List.of("var");
        }
        List<String> result;
        if (source.getAliasQualifiedNameInfo() != null) {
            result = AliasQualifiedNameTranslator.getInstance()
                    .translate(source.getAliasQualifiedNameInfo(), context);
        } else if (source.getQualifiedNameInfo() != null) {
            result = QualifiedNameTranslator.getInstance()
                    .translate(source.getQualifiedNameInfo(), context);
        } else if (source.getGenericNameInfo() != null) {
            result = GenericNameTranslator.getInstance()
                    .translate(source.getGenericNameInfo(), context);
        } else if (source.getIdentifierNameInfo() != null) {
            result = IdentifierNameTranslator.getInstance()
                    .translate(source.getIdentifierNameInfo(), context);
        } else {
            result = List.of();
        }
        return result;
    }
}
