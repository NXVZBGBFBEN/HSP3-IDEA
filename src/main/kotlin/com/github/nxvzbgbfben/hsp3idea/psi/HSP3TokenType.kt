package com.github.nxvzbgbfben.hsp3idea.psi

import com.github.nxvzbgbfben.hsp3idea.HSP3Language
import com.intellij.psi.tree.IElementType

class HSP3TokenType(debugName: String) : IElementType(debugName, HSP3Language.INSTANCE) {
    override fun toString() = "HSP3TokenType.${super.toString()}"
}