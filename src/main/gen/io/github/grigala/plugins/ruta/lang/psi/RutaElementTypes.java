// This is a generated file. Not intended for manual editing.
package io.github.grigala.plugins.ruta.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.grigala.plugins.ruta.lang.impl.*;

public interface RutaElementTypes {

  IElementType PROPERTY = new RutaElementType("PROPERTY");

  IElementType COMMENT = new RutaTokenType("COMMENT");
  IElementType CRLF = new RutaTokenType("CRLF");
  IElementType KEY = new RutaTokenType("KEY");
  IElementType SEPARATOR = new RutaTokenType("SEPARATOR");
  IElementType VALUE = new RutaTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new RutaPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
