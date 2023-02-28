package org.mybatis.generator.api.dom.kotlin.render;

import org.mybatis.generator.api.dom.kotlin.KotlinFunction;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItem;
import org.mybatis.generator.api.dom.kotlin.KotlinNamedItemVisitor;
import org.mybatis.generator.api.dom.kotlin.KotlinProperty;
import org.mybatis.generator.api.dom.kotlin.KotlinType;

import java.util.List;

public class KotlinNamedItemRenderer implements KotlinNamedItemVisitor<List<String>> {

    public List<String> render(KotlinNamedItem namedItem) {
        return namedItem.accept(this);
    }

    @Override
    public List<String> visit(KotlinType kotlinType) {
        List<String> lines = kotlinType.getComments();
        lines.addAll(new KotlinTypeRenderer().render(kotlinType));
        return lines;
    }

    @Override
    public List<String> visit(KotlinProperty kotlinProperty) {
        List<String> lines = kotlinProperty.getComments();
        lines.addAll(new KotlinPropertyRenderer().render(kotlinProperty));
        return lines;
    }

    @Override
    public List<String> visit(KotlinFunction kotlinFunction) {
        List<String> lines = kotlinFunction.getComments();
        lines.addAll(new KotlinFunctionRenderer().render(kotlinFunction));
        return lines;
    }
}
