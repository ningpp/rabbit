package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.kotlin.PredefinedTypeMapping;
import me.ningpp.rabbit.model.ArrayTypeInfo;
import me.ningpp.rabbit.util.JsonUtil;

public class ArrayTypeTranslator implements Translator<ArrayTypeInfo, String> {

    private static final ArrayTypeTranslator INSTANCE = new ArrayTypeTranslator();

    public static ArrayTypeTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ArrayTypeInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        String type = TypeInfoTranlator.translate(source.getElementType(), context);
        List<String> rankValues = ArrayRankSpecifierTranlator.getInstance()
                .translate(fileName, source.getRankSpecifiers(), context);
        if (PredefinedTypeMapping.isPrimitiveType(type)) {
            String value = null;
            if (rankValues.size() == 0) {
                value = type + "Array";
            } else if (rankValues.size() == 1) {
                if (StringUtils.isEmpty(rankValues.get(0))) {
                    value = type + "Array";
                } else {
                    value = type + "Array(" + rankValues.get(0) + ")";
                }
            } else if (rankValues.size() == 2) {
                value = "Array<" + type + "Array>";
            }
            if (value != null) {
                return List.of(value);
            }
        } else {
            String value = null;
            if (rankValues.size() == 1) {
                if (StringUtils.isEmpty(rankValues.get(0))) {
                    value = "Array<" + type + ">";
                } else {
                    value = "Array<" + type + ">(" + rankValues.get(0) + ")";
                }
            }
            if (value != null) {
                return List.of(value);
            }
        }
        throw new IllegalArgumentException("unsupport arrayType : " + JsonUtil.toJson(source));
    }

}
