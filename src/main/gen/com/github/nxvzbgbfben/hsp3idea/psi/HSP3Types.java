// This is a generated file. Not intended for manual editing.
package com.github.nxvzbgbfben.hsp3idea.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.nxvzbgbfben.hsp3idea.psi.impl.*;

public interface HSP3Types {

  IElementType PROPERTY = new HSP3ElementType("PROPERTY");

  IElementType COMMENT = new HSP3TokenType("COMMENT");
  IElementType CRLF = new HSP3TokenType("CRLF");
  IElementType KEY = new HSP3TokenType("KEY");
  IElementType SEPARATOR = new HSP3TokenType("SEPARATOR");
  IElementType VALUE = new HSP3TokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new HSP3PropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
