package me.ningpp.rabbit.kotlin.translator;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.kotlin.PredefinedTypeMapping;
import me.ningpp.rabbit.model.TypeInfo;

public class TypeInfoTranlator {

    public static String translate(TypeInfo type, TranslateContext context) {
        String info;
        if (type == null) {
            info = "";
        } else if (type.getIsVar()) {
            info = "var";
        } else if (type.getIdentifierNameInfo() != null) {
            info = IdentifierNameTranslator.getInstance().translate(
                    type.getIdentifierNameInfo(),
                    context
            ).get(0);
        } else if (type.getPredefinedTypeInfo() != null) {
            info = PredefinedTypeMapping.getKotlinType(
                    type.getPredefinedTypeInfo().getKeyword());
        } else if (type.getArrayTypeInfo() != null) {
            info = String.join("",
                    ArrayTypeTranslator.getInstance()
                            .translate("", type.getArrayTypeInfo(), context));
        } else if (type.getGenericNameInfo() != null) {
            info = String.join("",
                    GenericNameTranslator.getInstance()
                            .translate("", type.getGenericNameInfo(), context));
        } else {
            //TODO
            info = "Object";
        }
        return info;
    }

}
