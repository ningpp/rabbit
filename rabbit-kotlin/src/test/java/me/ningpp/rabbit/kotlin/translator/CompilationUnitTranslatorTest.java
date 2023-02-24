package me.ningpp.rabbit.kotlin.translator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.dom.DefaultKotlinFormatter;
import org.mybatis.generator.api.dom.kotlin.KotlinFile;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.model.CompilationUnitInfo;
import me.ningpp.rabbit.util.JsonUtil;

class CompilationUnitTranslatorTest {

    @Test
    void translateTest() {
        var compilationUnitInfo = JsonUtil.getBean(
                CompilationUnitTranslatorTest.class.getResourceAsStream("NetworkSimplex.cs.json"),
                CompilationUnitInfo.class
        );
        assertNotNull(compilationUnitInfo);
        String fileName = "NetworkSimplex.cs";
        CompilationUnitTranslator translator = CompilationUnitTranslator.getInstance();
        List<KotlinFile> kotlinFiles = translator.translate(
                fileName,
                compilationUnitInfo,
                new TranslateContext());
        assertEquals(1, kotlinFiles.size());

        System.out.println(new DefaultKotlinFormatter().getFormattedContent(
                kotlinFiles.get(0)
        ));
    }

}
