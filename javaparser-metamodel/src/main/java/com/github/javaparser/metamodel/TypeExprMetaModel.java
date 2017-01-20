package com.github.javaparser.metamodel;

import java.util.Optional;

public class TypeExprMetaModel extends BaseNodeMetaModel {

    TypeExprMetaModel(JavaParserMetaModel parent, Optional<BaseNodeMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.expr.TypeExpr.class, "TypeExpr", "com.github.javaparser.ast.expr.TypeExpr", "com.github.javaparser.ast.expr", false);
    }
}

