package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.StatementInfo;

public class StatementTranslator implements Translator<StatementInfo, String> {

    private static final StatementTranslator INSTANCE = new StatementTranslator();

    public static StatementTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, StatementInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();

        lines.addAll(BlockTranslator.getInstance().translate(fileName, source.getBlockInfo(), context));
        lines.addAll(BreakStatementTranslator.getInstance().translate(fileName, source.getBreakStatementInfo(), context));
        lines.addAll(CheckedStatementTranslator.getInstance().translate(fileName, source.getCheckedStatementInfo(), context));
        lines.addAll(ContinueStatementTranslator.getInstance().translate(fileName, source.getContinueStatementInfo(), context));
        lines.addAll(LocalDeclarationStatementTranslator.getInstance().translate(fileName, source.getLocalDeclarationStatementInfo(), context));
        lines.addAll(DoStatementTranslator.getInstance().translate(fileName, source.getDoStatementInfo(), context));
        lines.addAll(EmptyStatementTranslator.getInstance().translate(fileName, source.getEmptyStatementInfo(), context));
        lines.addAll(ExpressionStatementTranslator.getInstance().translate(fileName, source.getExpressionStatementInfo(), context));
        lines.addAll(FixedStatementTranslator.getInstance().translate(fileName, source.getFixedStatementInfo(), context));
        lines.addAll(ForStatementTranslator.getInstance().translate(fileName, source.getForStatementInfo(), context));
        lines.addAll(GotoStatementTranslator.getInstance().translate(fileName, source.getGotoStatementInfo(), context));
        lines.addAll(IfStatementTranslator.getInstance().translate(fileName, source.getIfStatementInfo(), context));
        lines.addAll(LabeledStatementTranslator.getInstance().translate(fileName, source.getLabeledStatementInfo(), context));
        lines.addAll(LocalFunctionStatementTranslator.getInstance().translate(fileName, source.getLocalFunctionStatementInfo(), context));
        lines.addAll(LockStatementTranslator.getInstance().translate(fileName, source.getLockStatementInfo(), context));
        lines.addAll(ReturnStatementTranslator.getInstance().translate(fileName, source.getReturnStatementInfo(), context));
        lines.addAll(SwitchStatementTranslator.getInstance().translate(fileName, source.getSwitchStatementInfo(), context));
        lines.addAll(ThrowStatementTranslator.getInstance().translate(fileName, source.getThrowStatementInfo(), context));
        lines.addAll(TryStatementTranslator.getInstance().translate(fileName, source.getTryStatementInfo(), context));
        lines.addAll(UnsafeStatementTranslator.getInstance().translate(fileName, source.getUnsafeStatementInfo(), context));
        lines.addAll(UsingStatementTranslator.getInstance().translate(fileName, source.getUsingStatementInfo(), context));
        lines.addAll(WhileStatementTranslator.getInstance().translate(fileName, source.getWhileStatementInfo(), context));
        lines.addAll(YieldStatementTranslator.getInstance().translate(fileName, source.getYieldStatementInfo(), context));
        lines.addAll(ForEachStatementTranslator.getInstance().translate(fileName, source.getForEachStatementInfo(), context));
        lines.addAll(ForEachVariableStatementTranslator.getInstance().translate(fileName, source.getForEachVariableStatementInfo(), context));

        return lines;
    }

}
