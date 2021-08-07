// This is a generated file. Not intended for manual editing.
package io.github.grigala.plugins.ruta.lang.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.grigala.plugins.ruta.lang.psi.RutaElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.grigala.plugins.ruta.lang.psi.*;

public class RutaPropertyImpl extends ASTWrapperPsiElement implements RutaProperty {

  public RutaPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RutaVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RutaVisitor) accept((RutaVisitor)visitor);
    else super.accept(visitor);
  }

}
