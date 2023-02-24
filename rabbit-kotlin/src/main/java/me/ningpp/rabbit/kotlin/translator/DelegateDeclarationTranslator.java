package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.DelegateDeclarationInfo;

//https://learn.microsoft.com/en-us/dotnet/csharp/delegates-overview
public class DelegateDeclarationTranslator implements Translator<DelegateDeclarationInfo, KotlinNamedItem> {

    private static final DelegateDeclarationTranslator INSTANCE = new DelegateDeclarationTranslator();

    public static DelegateDeclarationTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinNamedItem> translate(String fileName, DelegateDeclarationInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        return List.of();
    }
}
