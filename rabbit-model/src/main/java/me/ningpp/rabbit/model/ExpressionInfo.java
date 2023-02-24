package me.ningpp.rabbit.model;

import java.util.List;

public class ExpressionInfo extends CommentElement {

    private AnonymousMethodExpressionInfo anonymousMethodExpressionInfo;

    public AnonymousMethodExpressionInfo getAnonymousMethodExpressionInfo() {
        return anonymousMethodExpressionInfo;
    }

    public void setAnonymousMethodExpressionInfo(AnonymousMethodExpressionInfo anonymousMethodExpressionInfo) {
        this.anonymousMethodExpressionInfo = anonymousMethodExpressionInfo;
    }

    private ParenthesizedLambdaExpressionInfo parenthesizedLambdaExpressionInfo;

    public ParenthesizedLambdaExpressionInfo getParenthesizedLambdaExpressionInfo() {
        return parenthesizedLambdaExpressionInfo;
    }

    public void setParenthesizedLambdaExpressionInfo(ParenthesizedLambdaExpressionInfo parenthesizedLambdaExpressionInfo) {
        this.parenthesizedLambdaExpressionInfo = parenthesizedLambdaExpressionInfo;
    }

    private SimpleLambdaExpressionInfo simpleLambdaExpressionInfo;

    public SimpleLambdaExpressionInfo getSimpleLambdaExpressionInfo() {
        return simpleLambdaExpressionInfo;
    }

    public void setSimpleLambdaExpressionInfo(SimpleLambdaExpressionInfo simpleLambdaExpressionInfo) {
        this.simpleLambdaExpressionInfo = simpleLambdaExpressionInfo;
    }

    private StackAllocArrayCreationExpressionInfo stackAllocArrayCreationExpressionInfo;

    public StackAllocArrayCreationExpressionInfo getStackAllocArrayCreationExpressionInfo() {
        return stackAllocArrayCreationExpressionInfo;
    }

    public void setStackAllocArrayCreationExpressionInfo(StackAllocArrayCreationExpressionInfo stackAllocArrayCreationExpressionInfo) {
        this.stackAllocArrayCreationExpressionInfo = stackAllocArrayCreationExpressionInfo;
    }

    private AliasQualifiedNameInfo aliasQualifiedNameInfo;

    public AliasQualifiedNameInfo getAliasQualifiedNameInfo() {
        return aliasQualifiedNameInfo;
    }

    public void setAliasQualifiedNameInfo(AliasQualifiedNameInfo aliasQualifiedNameInfo) {
        this.aliasQualifiedNameInfo = aliasQualifiedNameInfo;
    }

    private QualifiedNameInfo qualifiedNameInfo;

    public QualifiedNameInfo getQualifiedNameInfo() {
        return qualifiedNameInfo;
    }

    public void setQualifiedNameInfo(QualifiedNameInfo qualifiedNameInfo) {
        this.qualifiedNameInfo = qualifiedNameInfo;
    }

    private GenericNameInfo genericNameInfo;

    public GenericNameInfo getGenericNameInfo() {
        return genericNameInfo;
    }

    public void setGenericNameInfo(GenericNameInfo genericNameInfo) {
        this.genericNameInfo = genericNameInfo;
    }

    private IdentifierNameInfo identifierNameInfo;

    public IdentifierNameInfo getIdentifierNameInfo() {
        return identifierNameInfo;
    }

    public void setIdentifierNameInfo(IdentifierNameInfo identifierNameInfo) {
        this.identifierNameInfo = identifierNameInfo;
    }

    private RefTypeInfo refTypeInfo;

    public RefTypeInfo getRefTypeInfo() {
        return refTypeInfo;
    }

    public void setRefTypeInfo(RefTypeInfo refTypeInfo) {
        this.refTypeInfo = refTypeInfo;
    }

    private PredefinedTypeInfo predefinedTypeInfo;

    public PredefinedTypeInfo getPredefinedTypeInfo() {
        return predefinedTypeInfo;
    }

    public void setPredefinedTypeInfo(PredefinedTypeInfo predefinedTypeInfo) {
        this.predefinedTypeInfo = predefinedTypeInfo;
    }

    private ArrayTypeInfo arrayTypeInfo;

    public ArrayTypeInfo getArrayTypeInfo() {
        return arrayTypeInfo;
    }

    public void setArrayTypeInfo(ArrayTypeInfo arrayTypeInfo) {
        this.arrayTypeInfo = arrayTypeInfo;
    }

    private PointerTypeInfo pointerTypeInfo;

    public PointerTypeInfo getPointerTypeInfo() {
        return pointerTypeInfo;
    }

    public void setPointerTypeInfo(PointerTypeInfo pointerTypeInfo) {
        this.pointerTypeInfo = pointerTypeInfo;
    }

    private FunctionPointerTypeInfo functionPointerTypeInfo;

    public FunctionPointerTypeInfo getFunctionPointerTypeInfo() {
        return functionPointerTypeInfo;
    }

    public void setFunctionPointerTypeInfo(FunctionPointerTypeInfo functionPointerTypeInfo) {
        this.functionPointerTypeInfo = functionPointerTypeInfo;
    }

    private NullableTypeInfo nullableTypeInfo;

    public NullableTypeInfo getNullableTypeInfo() {
        return nullableTypeInfo;
    }

    public void setNullableTypeInfo(NullableTypeInfo nullableTypeInfo) {
        this.nullableTypeInfo = nullableTypeInfo;
    }

    private TupleTypeInfo tupleTypeInfo;

    public TupleTypeInfo getTupleTypeInfo() {
        return tupleTypeInfo;
    }

    public void setTupleTypeInfo(TupleTypeInfo tupleTypeInfo) {
        this.tupleTypeInfo = tupleTypeInfo;
    }

    private OmittedTypeArgumentInfo omittedTypeArgumentInfo;

    public OmittedTypeArgumentInfo getOmittedTypeArgumentInfo() {
        return omittedTypeArgumentInfo;
    }

    public void setOmittedTypeArgumentInfo(OmittedTypeArgumentInfo omittedTypeArgumentInfo) {
        this.omittedTypeArgumentInfo = omittedTypeArgumentInfo;
    }

    private ScopedTypeInfo scopedTypeInfo;

    public ScopedTypeInfo getScopedTypeInfo() {
        return scopedTypeInfo;
    }

    public void setScopedTypeInfo(ScopedTypeInfo scopedTypeInfo) {
        this.scopedTypeInfo = scopedTypeInfo;
    }

    private ParenthesizedExpressionInfo parenthesizedExpressionInfo;

    public ParenthesizedExpressionInfo getParenthesizedExpressionInfo() {
        return parenthesizedExpressionInfo;
    }

    public void setParenthesizedExpressionInfo(ParenthesizedExpressionInfo parenthesizedExpressionInfo) {
        this.parenthesizedExpressionInfo = parenthesizedExpressionInfo;
    }

    private TupleExpressionInfo tupleExpressionInfo;

    public TupleExpressionInfo getTupleExpressionInfo() {
        return tupleExpressionInfo;
    }

    public void setTupleExpressionInfo(TupleExpressionInfo tupleExpressionInfo) {
        this.tupleExpressionInfo = tupleExpressionInfo;
    }

    private PrefixUnaryExpressionInfo prefixUnaryExpressionInfo;

    public PrefixUnaryExpressionInfo getPrefixUnaryExpressionInfo() {
        return prefixUnaryExpressionInfo;
    }

    public void setPrefixUnaryExpressionInfo(PrefixUnaryExpressionInfo prefixUnaryExpressionInfo) {
        this.prefixUnaryExpressionInfo = prefixUnaryExpressionInfo;
    }

    private AwaitExpressionInfo awaitExpressionInfo;

    public AwaitExpressionInfo getAwaitExpressionInfo() {
        return awaitExpressionInfo;
    }

    public void setAwaitExpressionInfo(AwaitExpressionInfo awaitExpressionInfo) {
        this.awaitExpressionInfo = awaitExpressionInfo;
    }

    private PostfixUnaryExpressionInfo postfixUnaryExpressionInfo;

    public PostfixUnaryExpressionInfo getPostfixUnaryExpressionInfo() {
        return postfixUnaryExpressionInfo;
    }

    public void setPostfixUnaryExpressionInfo(PostfixUnaryExpressionInfo postfixUnaryExpressionInfo) {
        this.postfixUnaryExpressionInfo = postfixUnaryExpressionInfo;
    }

    private MemberAccessExpressionInfo memberAccessExpressionInfo;

    public MemberAccessExpressionInfo getMemberAccessExpressionInfo() {
        return memberAccessExpressionInfo;
    }

    public void setMemberAccessExpressionInfo(MemberAccessExpressionInfo memberAccessExpressionInfo) {
        this.memberAccessExpressionInfo = memberAccessExpressionInfo;
    }

    private ConditionalAccessExpressionInfo conditionalAccessExpressionInfo;

    public ConditionalAccessExpressionInfo getConditionalAccessExpressionInfo() {
        return conditionalAccessExpressionInfo;
    }

    public void setConditionalAccessExpressionInfo(ConditionalAccessExpressionInfo conditionalAccessExpressionInfo) {
        this.conditionalAccessExpressionInfo = conditionalAccessExpressionInfo;
    }

    private MemberBindingExpressionInfo memberBindingExpressionInfo;

    public MemberBindingExpressionInfo getMemberBindingExpressionInfo() {
        return memberBindingExpressionInfo;
    }

    public void setMemberBindingExpressionInfo(MemberBindingExpressionInfo memberBindingExpressionInfo) {
        this.memberBindingExpressionInfo = memberBindingExpressionInfo;
    }

    private ElementBindingExpressionInfo elementBindingExpressionInfo;

    public ElementBindingExpressionInfo getElementBindingExpressionInfo() {
        return elementBindingExpressionInfo;
    }

    public void setElementBindingExpressionInfo(ElementBindingExpressionInfo elementBindingExpressionInfo) {
        this.elementBindingExpressionInfo = elementBindingExpressionInfo;
    }

    private RangeExpressionInfo rangeExpressionInfo;

    public RangeExpressionInfo getRangeExpressionInfo() {
        return rangeExpressionInfo;
    }

    public void setRangeExpressionInfo(RangeExpressionInfo rangeExpressionInfo) {
        this.rangeExpressionInfo = rangeExpressionInfo;
    }

    private ImplicitElementAccessInfo implicitElementAccessInfo;

    public ImplicitElementAccessInfo getImplicitElementAccessInfo() {
        return implicitElementAccessInfo;
    }

    public void setImplicitElementAccessInfo(ImplicitElementAccessInfo implicitElementAccessInfo) {
        this.implicitElementAccessInfo = implicitElementAccessInfo;
    }

    private BinaryExpressionInfo binaryExpressionInfo;

    public BinaryExpressionInfo getBinaryExpressionInfo() {
        return binaryExpressionInfo;
    }

    public void setBinaryExpressionInfo(BinaryExpressionInfo binaryExpressionInfo) {
        this.binaryExpressionInfo = binaryExpressionInfo;
    }

    private AssignmentExpressionInfo assignmentExpressionInfo;

    public AssignmentExpressionInfo getAssignmentExpressionInfo() {
        return assignmentExpressionInfo;
    }

    public void setAssignmentExpressionInfo(AssignmentExpressionInfo assignmentExpressionInfo) {
        this.assignmentExpressionInfo = assignmentExpressionInfo;
    }

    private ConditionalExpressionInfo conditionalExpressionInfo;

    public ConditionalExpressionInfo getConditionalExpressionInfo() {
        return conditionalExpressionInfo;
    }

    public void setConditionalExpressionInfo(ConditionalExpressionInfo conditionalExpressionInfo) {
        this.conditionalExpressionInfo = conditionalExpressionInfo;
    }

    private ThisExpressionInfo thisExpressionInfo;

    public ThisExpressionInfo getThisExpressionInfo() {
        return thisExpressionInfo;
    }

    public void setThisExpressionInfo(ThisExpressionInfo thisExpressionInfo) {
        this.thisExpressionInfo = thisExpressionInfo;
    }

    private BaseExpressionInfo baseExpressionInfo;

    public BaseExpressionInfo getBaseExpressionInfo() {
        return baseExpressionInfo;
    }

    public void setBaseExpressionInfo(BaseExpressionInfo baseExpressionInfo) {
        this.baseExpressionInfo = baseExpressionInfo;
    }

    private LiteralExpressionInfo literalExpressionInfo;

    public LiteralExpressionInfo getLiteralExpressionInfo() {
        return literalExpressionInfo;
    }

    public void setLiteralExpressionInfo(LiteralExpressionInfo literalExpressionInfo) {
        this.literalExpressionInfo = literalExpressionInfo;
    }

    private MakeRefExpressionInfo makeRefExpressionInfo;

    public MakeRefExpressionInfo getMakeRefExpressionInfo() {
        return makeRefExpressionInfo;
    }

    public void setMakeRefExpressionInfo(MakeRefExpressionInfo makeRefExpressionInfo) {
        this.makeRefExpressionInfo = makeRefExpressionInfo;
    }

    private RefTypeExpressionInfo refTypeExpressionInfo;

    public RefTypeExpressionInfo getRefTypeExpressionInfo() {
        return refTypeExpressionInfo;
    }

    public void setRefTypeExpressionInfo(RefTypeExpressionInfo refTypeExpressionInfo) {
        this.refTypeExpressionInfo = refTypeExpressionInfo;
    }

    private RefValueExpressionInfo refValueExpressionInfo;

    public RefValueExpressionInfo getRefValueExpressionInfo() {
        return refValueExpressionInfo;
    }

    public void setRefValueExpressionInfo(RefValueExpressionInfo refValueExpressionInfo) {
        this.refValueExpressionInfo = refValueExpressionInfo;
    }

    private CheckedExpressionInfo checkedExpressionInfo;

    public CheckedExpressionInfo getCheckedExpressionInfo() {
        return checkedExpressionInfo;
    }

    public void setCheckedExpressionInfo(CheckedExpressionInfo checkedExpressionInfo) {
        this.checkedExpressionInfo = checkedExpressionInfo;
    }

    private DefaultExpressionInfo defaultExpressionInfo;

    public DefaultExpressionInfo getDefaultExpressionInfo() {
        return defaultExpressionInfo;
    }

    public void setDefaultExpressionInfo(DefaultExpressionInfo defaultExpressionInfo) {
        this.defaultExpressionInfo = defaultExpressionInfo;
    }

    private TypeOfExpressionInfo typeOfExpressionInfo;

    public TypeOfExpressionInfo getTypeOfExpressionInfo() {
        return typeOfExpressionInfo;
    }

    public void setTypeOfExpressionInfo(TypeOfExpressionInfo typeOfExpressionInfo) {
        this.typeOfExpressionInfo = typeOfExpressionInfo;
    }

    private SizeOfExpressionInfo sizeOfExpressionInfo;

    public SizeOfExpressionInfo getSizeOfExpressionInfo() {
        return sizeOfExpressionInfo;
    }

    public void setSizeOfExpressionInfo(SizeOfExpressionInfo sizeOfExpressionInfo) {
        this.sizeOfExpressionInfo = sizeOfExpressionInfo;
    }

    private InvocationExpressionInfo invocationExpressionInfo;

    public InvocationExpressionInfo getInvocationExpressionInfo() {
        return invocationExpressionInfo;
    }

    public void setInvocationExpressionInfo(InvocationExpressionInfo invocationExpressionInfo) {
        this.invocationExpressionInfo = invocationExpressionInfo;
    }

    private ElementAccessExpressionInfo elementAccessExpressionInfo;

    public ElementAccessExpressionInfo getElementAccessExpressionInfo() {
        return elementAccessExpressionInfo;
    }

    public void setElementAccessExpressionInfo(ElementAccessExpressionInfo elementAccessExpressionInfo) {
        this.elementAccessExpressionInfo = elementAccessExpressionInfo;
    }

    private DeclarationExpressionInfo declarationExpressionInfo;

    public DeclarationExpressionInfo getDeclarationExpressionInfo() {
        return declarationExpressionInfo;
    }

    public void setDeclarationExpressionInfo(DeclarationExpressionInfo declarationExpressionInfo) {
        this.declarationExpressionInfo = declarationExpressionInfo;
    }

    private CastExpressionInfo castExpressionInfo;

    public CastExpressionInfo getCastExpressionInfo() {
        return castExpressionInfo;
    }

    public void setCastExpressionInfo(CastExpressionInfo castExpressionInfo) {
        this.castExpressionInfo = castExpressionInfo;
    }

    private RefExpressionInfo refExpressionInfo;

    public RefExpressionInfo getRefExpressionInfo() {
        return refExpressionInfo;
    }

    public void setRefExpressionInfo(RefExpressionInfo refExpressionInfo) {
        this.refExpressionInfo = refExpressionInfo;
    }

    private InitializerExpressionInfo initializerExpressionInfo;

    public InitializerExpressionInfo getInitializerExpressionInfo() {
        return initializerExpressionInfo;
    }

    public void setInitializerExpressionInfo(InitializerExpressionInfo initializerExpressionInfo) {
        this.initializerExpressionInfo = initializerExpressionInfo;
    }

    private ImplicitObjectCreationExpressionInfo implicitObjectCreationExpressionInfo;

    public ImplicitObjectCreationExpressionInfo getImplicitObjectCreationExpressionInfo() {
        return implicitObjectCreationExpressionInfo;
    }

    public void setImplicitObjectCreationExpressionInfo(ImplicitObjectCreationExpressionInfo implicitObjectCreationExpressionInfo) {
        this.implicitObjectCreationExpressionInfo = implicitObjectCreationExpressionInfo;
    }

    private ObjectCreationExpressionInfo objectCreationExpressionInfo;

    public ObjectCreationExpressionInfo getObjectCreationExpressionInfo() {
        return objectCreationExpressionInfo;
    }

    public void setObjectCreationExpressionInfo(ObjectCreationExpressionInfo objectCreationExpressionInfo) {
        this.objectCreationExpressionInfo = objectCreationExpressionInfo;
    }

    private WithExpressionInfo withExpressionInfo;

    public WithExpressionInfo getWithExpressionInfo() {
        return withExpressionInfo;
    }

    public void setWithExpressionInfo(WithExpressionInfo withExpressionInfo) {
        this.withExpressionInfo = withExpressionInfo;
    }

    private AnonymousObjectCreationExpressionInfo anonymousObjectCreationExpressionInfo;

    public AnonymousObjectCreationExpressionInfo getAnonymousObjectCreationExpressionInfo() {
        return anonymousObjectCreationExpressionInfo;
    }

    public void setAnonymousObjectCreationExpressionInfo(AnonymousObjectCreationExpressionInfo anonymousObjectCreationExpressionInfo) {
        this.anonymousObjectCreationExpressionInfo = anonymousObjectCreationExpressionInfo;
    }

    private ArrayCreationExpressionInfo arrayCreationExpressionInfo;

    public ArrayCreationExpressionInfo getArrayCreationExpressionInfo() {
        return arrayCreationExpressionInfo;
    }

    public void setArrayCreationExpressionInfo(ArrayCreationExpressionInfo arrayCreationExpressionInfo) {
        this.arrayCreationExpressionInfo = arrayCreationExpressionInfo;
    }

    private ImplicitArrayCreationExpressionInfo implicitArrayCreationExpressionInfo;

    public ImplicitArrayCreationExpressionInfo getImplicitArrayCreationExpressionInfo() {
        return implicitArrayCreationExpressionInfo;
    }

    public void setImplicitArrayCreationExpressionInfo(ImplicitArrayCreationExpressionInfo implicitArrayCreationExpressionInfo) {
        this.implicitArrayCreationExpressionInfo = implicitArrayCreationExpressionInfo;
    }

    private ImplicitStackAllocArrayCreationExpressionInfo implicitStackAllocArrayCreationExpressionInfo;

    public ImplicitStackAllocArrayCreationExpressionInfo getImplicitStackAllocArrayCreationExpressionInfo() {
        return implicitStackAllocArrayCreationExpressionInfo;
    }

    public void setImplicitStackAllocArrayCreationExpressionInfo(ImplicitStackAllocArrayCreationExpressionInfo implicitStackAllocArrayCreationExpressionInfo) {
        this.implicitStackAllocArrayCreationExpressionInfo = implicitStackAllocArrayCreationExpressionInfo;
    }

    private QueryExpressionInfo queryExpressionInfo;

    public QueryExpressionInfo getQueryExpressionInfo() {
        return queryExpressionInfo;
    }

    public void setQueryExpressionInfo(QueryExpressionInfo queryExpressionInfo) {
        this.queryExpressionInfo = queryExpressionInfo;
    }

    private OmittedArraySizeExpressionInfo omittedArraySizeExpressionInfo;

    public OmittedArraySizeExpressionInfo getOmittedArraySizeExpressionInfo() {
        return omittedArraySizeExpressionInfo;
    }

    public void setOmittedArraySizeExpressionInfo(OmittedArraySizeExpressionInfo omittedArraySizeExpressionInfo) {
        this.omittedArraySizeExpressionInfo = omittedArraySizeExpressionInfo;
    }

    private InterpolatedStringExpressionInfo interpolatedStringExpressionInfo;

    public InterpolatedStringExpressionInfo getInterpolatedStringExpressionInfo() {
        return interpolatedStringExpressionInfo;
    }

    public void setInterpolatedStringExpressionInfo(InterpolatedStringExpressionInfo interpolatedStringExpressionInfo) {
        this.interpolatedStringExpressionInfo = interpolatedStringExpressionInfo;
    }

    private IsPatternExpressionInfo isPatternExpressionInfo;

    public IsPatternExpressionInfo getIsPatternExpressionInfo() {
        return isPatternExpressionInfo;
    }

    public void setIsPatternExpressionInfo(IsPatternExpressionInfo isPatternExpressionInfo) {
        this.isPatternExpressionInfo = isPatternExpressionInfo;
    }

    private ThrowExpressionInfo throwExpressionInfo;

    public ThrowExpressionInfo getThrowExpressionInfo() {
        return throwExpressionInfo;
    }

    public void setThrowExpressionInfo(ThrowExpressionInfo throwExpressionInfo) {
        this.throwExpressionInfo = throwExpressionInfo;
    }

    private SwitchExpressionInfo switchExpressionInfo;

    public SwitchExpressionInfo getSwitchExpressionInfo() {
        return switchExpressionInfo;
    }

    public void setSwitchExpressionInfo(SwitchExpressionInfo switchExpressionInfo) {
        this.switchExpressionInfo = switchExpressionInfo;
    }
}
