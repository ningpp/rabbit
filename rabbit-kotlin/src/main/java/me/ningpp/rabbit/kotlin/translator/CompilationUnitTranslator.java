package me.ningpp.rabbit.kotlin.translator;

import java.util.List;

import org.mybatis.generator.api.dom.kotlin.KotlinFile;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.CompilationUnitInfo;

public class CompilationUnitTranslator implements Translator<CompilationUnitInfo, KotlinFile> {

    private static final CompilationUnitTranslator INSTANCE = new CompilationUnitTranslator();

    public static CompilationUnitTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<KotlinFile> translate(String fileName, CompilationUnitInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }

        String packageName;
        if (source.getMembers() != null
                && !source.getMembers().isEmpty()
                && source.getMembers().get(0).getNamespaceDeclarationInfo() != null) {
            packageName = NameTranslator.getInstance()
                    .translate(
                            fileName,
                            source.getMembers().get(0)
                                .getNamespaceDeclarationInfo().getName(),
                            context
                    ).get(0);
        } else {
            packageName = "";
        }

        KotlinFile kotlinFile = new KotlinFile(fileName);

        kotlinFile.setPackage(packageName);

        kotlinFile.addImports(
            UsingDirectiveTranslator.getInstance()
                .translate(fileName, source.getUsings(), context)
        );

        List<KotlinNamedItem> memberItems = MemberDeclarationTranslator.getInstance()
                .translate(fileName, source.getMembers(), context);
        for (KotlinNamedItem memberItem : memberItems) {
            kotlinFile.addNamedItem(memberItem);
        }

        return List.of(kotlinFile);
    }

}
