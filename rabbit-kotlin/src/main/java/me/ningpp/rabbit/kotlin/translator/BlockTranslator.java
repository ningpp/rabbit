package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.kotlin.util.KotlinUtil;
import me.ningpp.rabbit.model.BlockInfo;

public class BlockTranslator implements Translator<BlockInfo, String> {

    private static final BlockTranslator INSTANCE = new BlockTranslator();

    public static BlockTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, BlockInfo source, TranslateContext context) {
        return translateWithBrace(true, fileName, source, context);
    }

    public List<String> translateWithBrace(boolean withBrace, String fileName, BlockInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();

        if (withBrace) {
            lines.add("{");
        }

        lines.addAll(StatementTranslator.getInstance()
                .translate(fileName, source.getStatements(), context));

        if (withBrace) {
            lines.add("}");
        }
        return lines;
    }
}
