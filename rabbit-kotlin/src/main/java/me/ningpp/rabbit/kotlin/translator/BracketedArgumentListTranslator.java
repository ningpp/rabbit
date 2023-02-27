package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ArgumentInfo;
import me.ningpp.rabbit.model.BracketedArgumentListInfo;
import me.ningpp.rabbit.util.Constants;

public class BracketedArgumentListTranslator implements Translator<BracketedArgumentListInfo, String> {

    private static final BracketedArgumentListTranslator INSTANCE = new BracketedArgumentListTranslator();

    public static BracketedArgumentListTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, BracketedArgumentListInfo source, TranslateContext context) {
        if (source == null || source.getArguments() == null) {
            return List.of();
        }
        //must loop by here
        // code like this  a = b[ x ? 1 : 0]
        List<List<String>> values = new ArrayList<>();
        for (ArgumentInfo arg : source.getArguments()) {
            var one = ArgumentTranslator.getInstance().translate(fileName, arg, context);
            if (!one.isEmpty()) {
                values.add(one);
            }
        }
        String passValue;
        if (values.size() == 1) {
            passValue = String.join("", values.get(0));
        } else {
            passValue = String.join(", ",
                    values.stream()
                            .map(list -> String.join(Constants.DEFAULT_LINE_SEPARATOR, list)).toList());
        }
        return List.of("[" + passValue + "]");
    }
}
