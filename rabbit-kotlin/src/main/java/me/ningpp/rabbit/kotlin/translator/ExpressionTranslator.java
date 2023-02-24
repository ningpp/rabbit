package me.ningpp.rabbit.kotlin.translator;

import java.util.ArrayList;
import java.util.List;

import me.ningpp.rabbit.TranslateContext;
import me.ningpp.rabbit.Translator;
import me.ningpp.rabbit.model.ExpressionInfo;

public class ExpressionTranslator implements Translator<ExpressionInfo, String> {

    private static final ExpressionTranslator INSTANCE = new ExpressionTranslator();

    public static ExpressionTranslator getInstance() {
        return INSTANCE;
    }

    @Override
    public List<String> translate(String fileName, ExpressionInfo source, TranslateContext context) {
        if (source == null) {
            return List.of();
        }
        List<String> lines = new ArrayList<>();

        lines.addAll(AnonymousMethodExpressionTranslator.getInstance().translate(fileName, source.getAnonymousMethodExpressionInfo(), context));
        lines.addAll(ParenthesizedLambdaExpressionTranslator.getInstance().translate(fileName, source.getParenthesizedLambdaExpressionInfo(), context));
        lines.addAll(SimpleLambdaExpressionTranslator.getInstance().translate(fileName, source.getSimpleLambdaExpressionInfo(), context));
        lines.addAll(StackAllocArrayCreationExpressionTranslator.getInstance().translate(fileName, source.getStackAllocArrayCreationExpressionInfo(), context));
        lines.addAll(AliasQualifiedNameTranslator.getInstance().translate(fileName, source.getAliasQualifiedNameInfo(), context));
        lines.addAll(QualifiedNameTranslator.getInstance().translate(fileName, source.getQualifiedNameInfo(), context));
        lines.addAll(GenericNameTranslator.getInstance().translate(fileName, source.getGenericNameInfo(), context));
        lines.addAll(IdentifierNameTranslator.getInstance().translate(fileName, source.getIdentifierNameInfo(), context));
        lines.addAll(RefTypeTranslator.getInstance().translate(fileName, source.getRefTypeInfo(), context));
        lines.addAll(PredefinedTypeTranslator.getInstance().translate(fileName, source.getPredefinedTypeInfo(), context));
        lines.addAll(ArrayTypeTranslator.getInstance().translate(fileName, source.getArrayTypeInfo(), context));
        lines.addAll(PointerTypeTranslator.getInstance().translate(fileName, source.getPointerTypeInfo(), context));
        lines.addAll(FunctionPointerTypeTranslator.getInstance().translate(fileName, source.getFunctionPointerTypeInfo(), context));
        lines.addAll(NullableTypeTranslator.getInstance().translate(fileName, source.getNullableTypeInfo(), context));
        lines.addAll(TupleTypeTranslator.getInstance().translate(fileName, source.getTupleTypeInfo(), context));
        lines.addAll(OmittedTypeArgumentTranslator.getInstance().translate(fileName, source.getOmittedTypeArgumentInfo(), context));
        lines.addAll(ScopedTypeTranslator.getInstance().translate(fileName, source.getScopedTypeInfo(), context));
        lines.addAll(ParenthesizedExpressionTranslator.getInstance().translate(fileName, source.getParenthesizedExpressionInfo(), context));
        lines.addAll(TupleExpressionTranslator.getInstance().translate(fileName, source.getTupleExpressionInfo(), context));
        lines.addAll(PrefixUnaryExpressionTranslator.getInstance().translate(fileName, source.getPrefixUnaryExpressionInfo(), context));
        lines.addAll(AwaitExpressionTranslator.getInstance().translate(fileName, source.getAwaitExpressionInfo(), context));
        lines.addAll(PostfixUnaryExpressionTranslator.getInstance().translate(fileName, source.getPostfixUnaryExpressionInfo(), context));
        lines.addAll(MemberAccessExpressionTranslator.getInstance().translate(fileName, source.getMemberAccessExpressionInfo(), context));
        lines.addAll(ConditionalAccessExpressionTranslator.getInstance().translate(fileName, source.getConditionalAccessExpressionInfo(), context));
        lines.addAll(MemberBindingExpressionTranslator.getInstance().translate(fileName, source.getMemberBindingExpressionInfo(), context));
        lines.addAll(ElementBindingExpressionTranslator.getInstance().translate(fileName, source.getElementBindingExpressionInfo(), context));
        lines.addAll(RangeExpressionTranslator.getInstance().translate(fileName, source.getRangeExpressionInfo(), context));
        lines.addAll(ImplicitElementAccessTranslator.getInstance().translate(fileName, source.getImplicitElementAccessInfo(), context));
        lines.addAll(BinaryExpressionTranslator.getInstance().translate(fileName, source.getBinaryExpressionInfo(), context));
        lines.addAll(AssignmentExpressionTranslator.getInstance().translate(fileName, source.getAssignmentExpressionInfo(), context));
        lines.addAll(ConditionalExpressionTranslator.getInstance().translate(fileName, source.getConditionalExpressionInfo(), context));
        lines.addAll(ThisExpressionTranslator.getInstance().translate(fileName, source.getThisExpressionInfo(), context));
        lines.addAll(BaseExpressionTranslator.getInstance().translate(fileName, source.getBaseExpressionInfo(), context));
        lines.addAll(LiteralExpressionTranslator.getInstance().translate(fileName, source.getLiteralExpressionInfo(), context));
        lines.addAll(MakeRefExpressionTranslator.getInstance().translate(fileName, source.getMakeRefExpressionInfo(), context));
        lines.addAll(RefTypeExpressionTranslator.getInstance().translate(fileName, source.getRefTypeExpressionInfo(), context));
        lines.addAll(RefValueExpressionTranslator.getInstance().translate(fileName, source.getRefValueExpressionInfo(), context));
        lines.addAll(CheckedExpressionTranslator.getInstance().translate(fileName, source.getCheckedExpressionInfo(), context));
        lines.addAll(DefaultExpressionTranslator.getInstance().translate(fileName, source.getDefaultExpressionInfo(), context));
        lines.addAll(TypeOfExpressionTranslator.getInstance().translate(fileName, source.getTypeOfExpressionInfo(), context));
        lines.addAll(SizeOfExpressionTranslator.getInstance().translate(fileName, source.getSizeOfExpressionInfo(), context));
        lines.addAll(InvocationExpressionTranslator.getInstance().translate(fileName, source.getInvocationExpressionInfo(), context));
        lines.addAll(ElementAccessExpressionTranslator.getInstance().translate(fileName, source.getElementAccessExpressionInfo(), context));
        lines.addAll(DeclarationExpressionTranslator.getInstance().translate(fileName, source.getDeclarationExpressionInfo(), context));
        lines.addAll(CastExpressionTranslator.getInstance().translate(fileName, source.getCastExpressionInfo(), context));
        lines.addAll(RefExpressionTranslator.getInstance().translate(fileName, source.getRefExpressionInfo(), context));
        lines.addAll(InitializerExpressionTranslator.getInstance().translate(fileName, source.getInitializerExpressionInfo(), context));
        lines.addAll(ImplicitObjectCreationExpressionTranslator.getInstance().translate(fileName, source.getImplicitObjectCreationExpressionInfo(), context));
        lines.addAll(ObjectCreationExpressionTranslator.getInstance().translate(fileName, source.getObjectCreationExpressionInfo(), context));
        lines.addAll(WithExpressionTranslator.getInstance().translate(fileName, source.getWithExpressionInfo(), context));
        lines.addAll(AnonymousObjectCreationExpressionTranslator.getInstance().translate(fileName, source.getAnonymousObjectCreationExpressionInfo(), context));
        lines.addAll(ArrayCreationExpressionTranslator.getInstance().translate(fileName, source.getArrayCreationExpressionInfo(), context));
        lines.addAll(ImplicitArrayCreationExpressionTranslator.getInstance().translate(fileName, source.getImplicitArrayCreationExpressionInfo(), context));
        lines.addAll(ImplicitStackAllocArrayCreationExpressionTranslator.getInstance().translate(fileName, source.getImplicitStackAllocArrayCreationExpressionInfo(), context));
        lines.addAll(QueryExpressionTranslator.getInstance().translate(fileName, source.getQueryExpressionInfo(), context));
        lines.addAll(OmittedArraySizeExpressionTranslator.getInstance().translate(fileName, source.getOmittedArraySizeExpressionInfo(), context));
        lines.addAll(InterpolatedStringExpressionTranslator.getInstance().translate(fileName, source.getInterpolatedStringExpressionInfo(), context));
        lines.addAll(IsPatternExpressionTranslator.getInstance().translate(fileName, source.getIsPatternExpressionInfo(), context));
        lines.addAll(ThrowExpressionTranslator.getInstance().translate(fileName, source.getThrowExpressionInfo(), context));
        lines.addAll(SwitchExpressionTranslator.getInstance().translate(fileName, source.getSwitchExpressionInfo(), context));

        return lines;
    }
}
