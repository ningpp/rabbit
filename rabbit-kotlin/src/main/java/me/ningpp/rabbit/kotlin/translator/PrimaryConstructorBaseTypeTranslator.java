package me.ningpp.rabbit.kotlin.translator;

import java.util.List;
import java.util.Locale;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.PrimaryConstructorBaseTypeInfo;

public class PrimaryConstructorBaseTypeTranslator implements Translator<PrimaryConstructorBaseTypeInfo, String> {

    private static final PrimaryConstructorBaseTypeTranslator INSTANCE = new PrimaryConstructorBaseTypeTranslator();

    public static PrimaryConstructorBaseTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, PrimaryConstructorBaseTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        String suffix;
        if (source.getArgumentList() != null) {
            List<String> args = ArgumentListTranslator.getInstance()
                    .translate(fileName, source.getArgumentList(), context);
            suffix = String.format(Locale.ROOT, "<%s>",
                    String.join(", ", args));
        } else {
            suffix = "";
        }
        return List.of(
                TypeInfoTranlator.translate(source.getType(), context)
                + suffix
        );
    }
}
