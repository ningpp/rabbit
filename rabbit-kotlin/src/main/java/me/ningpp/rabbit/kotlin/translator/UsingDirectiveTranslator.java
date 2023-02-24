package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.UsingDirectiveInfo;

public class UsingDirectiveTranslator implements Translator<UsingDirectiveInfo, String> {


    private static final UsingDirectiveTranslator INSTANCE = new UsingDirectiveTranslator();

    public static UsingDirectiveTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, UsingDirectiveInfo source, TranslateContext context) {
        String qualifiedName = null;
        String alias = null;
        if (source.getAlias() != null) {
            alias = IdentifierNameTranslator.getInstance()
                        .translate(
                                source.getAlias().getName(),
                                context
                        ).get(0);
        }

        String importString = null;
        if (source.getName() != null) {
            String suffix;
            if (StringUtils.isNotEmpty(alias)
                    || StringUtils.isNotEmpty(source.getStaticKeyword())) {
                suffix = "";
            } else {
                suffix = ".*";
            }
            var x = NameTranslator.getInstance().translate(source.getName(), context);
            qualifiedName = x.get(0) + suffix;

            if (StringUtils.isNotEmpty(alias)) {
                importString = qualifiedName + " as " + alias;
            } else {
                importString = qualifiedName;
            }
        }

        if (StringUtils.isEmpty(importString)) {
            return List.of();
        } else {
            return List.of(importString);
        }
    }

}
