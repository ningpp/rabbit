package me.ningpp.rabbit.kotlin.translator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.dom.DefaultKotlinFormatter;
import org.mybatis.generator.api.dom.kotlin.KotlinFile;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.model.CompilationUnitInfo;
import me.ningpp.rabbit.model.ExpressionInfo;
import me.ningpp.rabbit.util.JsonUtil;

class ExpressionTranslatorTest {

    @Test
    void translateTest() {

        var expressionInfo = JsonUtil.getBean(
                CompilationUnitTranslatorTest.class.getResourceAsStream("expression.json"),
                ExpressionInfo.class
        );
        assertNotNull(expressionInfo);
        var values = ExpressionTranslator.getInstance().translate("", expressionInfo,
                new TranslateContext());
        assertEquals(1, values.size());
        assertEquals("rectangles[0].Rectangle", values.get(0));
    }

}
