package com.github.javaparser.metamodel;

import java.util.Optional;

public class UnknownTypeMetaModel extends BaseNodeMetaModel {

    UnknownTypeMetaModel(JavaParserMetaModel parent, Optional<BaseNodeMetaModel> superClassMetaModel) {
        super(superClassMetaModel, parent, com.github.javaparser.ast.type.UnknownType.class, "UnknownType", "com.github.javaparser.ast.type.UnknownType", "com.github.javaparser.ast.type", false);
    }
}

