package me.ningpp.rabbit.kotlin.translator;

import com.facebook.ktfmt.format.Formatter;
import com.facebook.ktfmt.format.FormattingOptions;
import com.google.googlejavaformat.java.FormatterException;
import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.model.CompilationUnitInfo;
import me.ningpp.rabbit.util.JsonUtil;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.dom.DefaultKotlinFormatter;
import org.mybatis.generator.api.dom.kotlin.KotlinFile;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CompilationUnitTranslatorTest {

    @Test
    void translateTest() throws FormatterException {
        var compilationUnitInfo = JsonUtil.getBean(
                CompilationUnitTranslatorTest.class.getResourceAsStream("LayeredLayoutEngine.cs.json"),
                CompilationUnitInfo.class
        );
        assertNotNull(compilationUnitInfo);
        String fileName = "LayeredLayoutEngine.cs";
        CompilationUnitTranslator translator = CompilationUnitTranslator.getInstance();
        List<KotlinFile> kotlinFiles = translator.translate(
                fileName,
                compilationUnitInfo,
                new TranslateContext());
        assertEquals(1, kotlinFiles.size());

        FormattingOptions formattingOptions = new FormattingOptions()
                .copy(FormattingOptions.Style.GOOGLE, 100,
                        4, 4,
                        false, false);
        String content = new DefaultKotlinFormatter().getFormattedContent(
                kotlinFiles.get(0)
        );
        try {
            System.out.println(Formatter.format(
                    formattingOptions,
                    content
            ));
        } catch (Exception e) {
            System.out.println(content);
            e.printStackTrace();
        }
    }

}
