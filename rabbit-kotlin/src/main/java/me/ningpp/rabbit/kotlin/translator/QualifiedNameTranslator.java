package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.QualifiedNameInfo;

public class QualifiedNameTranslator implements Translator<QualifiedNameInfo, String> {

    private static final QualifiedNameTranslator INSTANCE = new QualifiedNameTranslator();

    public static QualifiedNameTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, QualifiedNameInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> result;
        if (source.getLeft() == null) {
            result = SimpleNameTranslator.getInstance().translate(
                    source.getRight(), context);
        } else if (source.getRight() == null) {
            result =  NameTranslator.getInstance().translate(
                    source.getLeft(), context);
        } else {
            result = List.of(
                    NameTranslator.getInstance().translate(
                            source.getLeft(), context).get(0)
                            + "."
                            + SimpleNameTranslator.getInstance().translate(
                                    source.getRight(), context).get(0)
            );
        }
        return result;
    }
}
