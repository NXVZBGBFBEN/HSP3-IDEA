// This is a generated file. Not intended for manual editing.
package com.github.nxvzbgbfben.hsp3idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.nxvzbgbfben.hsp3idea.psi.HSP3Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.nxvzbgbfben.hsp3idea.psi.*;

public class HSP3PropertyImpl extends ASTWrapperPsiElement implements HSP3Property {

  public HSP3PropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull HSP3Visitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HSP3Visitor) accept((HSP3Visitor)visitor);
    else super.accept(visitor);
  }

}
