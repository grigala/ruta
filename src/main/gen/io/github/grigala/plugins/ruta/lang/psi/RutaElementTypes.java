// This is a generated file. Not intended for manual editing.
package io.github.grigala.plugins.ruta.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.grigala.plugins.ruta.lang.impl.*;

public interface RutaElementTypes {

  IElementType PROPERTY = new RutaElementType("PROPERTY");

  IElementType AND = new RutaTokenType("&");
  IElementType ANDAND = new RutaTokenType("&&");
  IElementType ANDEQ = new RutaTokenType("&=");
  IElementType ARROW = new RutaTokenType("->");
  IElementType AT = new RutaTokenType("@");
  IElementType COLON = new RutaTokenType(":");
  IElementType COLONCOLON = new RutaTokenType("::");
  IElementType COMMA = new RutaTokenType(",");
  IElementType COMMENT = new RutaTokenType("COMMENT");
  IElementType CRLF = new RutaTokenType("CRLF");
  IElementType DIV = new RutaTokenType("/");
  IElementType DIVEQ = new RutaTokenType("/=");
  IElementType DOLLAR = new RutaTokenType("$");
  IElementType DOT = new RutaTokenType(".");
  IElementType DOTDOT = new RutaTokenType("..");
  IElementType DOTDOTDOT = new RutaTokenType("...");
  IElementType DOTDOTEQ = new RutaTokenType("..=");
  IElementType EQ = new RutaTokenType("=");
  IElementType EQEQ = new RutaTokenType("==");
  IElementType EXCL = new RutaTokenType("!");
  IElementType EXCLEQ = new RutaTokenType("!=");
  IElementType FAT_ARROW = new RutaTokenType("=>");
  IElementType GT = new RutaTokenType(">");
  IElementType KEY = new RutaTokenType("KEY");
  IElementType LBRACE = new RutaTokenType("{");
  IElementType LBRACK = new RutaTokenType("[");
  IElementType LPAREN = new RutaTokenType("(");
  IElementType LT = new RutaTokenType("<");
  IElementType MINUS = new RutaTokenType("-");
  IElementType MINUSEQ = new RutaTokenType("-=");
  IElementType MUL = new RutaTokenType("*");
  IElementType MULEQ = new RutaTokenType("*=");
  IElementType OR = new RutaTokenType("|");
  IElementType OREQ = new RutaTokenType("|=");
  IElementType PLUS = new RutaTokenType("+");
  IElementType PLUSEQ = new RutaTokenType("+=");
  IElementType Q = new RutaTokenType("?");
  IElementType RBRACE = new RutaTokenType("}");
  IElementType RBRACK = new RutaTokenType("]");
  IElementType REM = new RutaTokenType("%");
  IElementType REMEQ = new RutaTokenType("%=");
  IElementType RPAREN = new RutaTokenType(")");
  IElementType SEMICOLON = new RutaTokenType(";");
  IElementType SEPARATOR = new RutaTokenType("SEPARATOR");
  IElementType SHA = new RutaTokenType("#");
  IElementType UNDERSCORE = new RutaTokenType("_");
  IElementType VALUE = new RutaTokenType("VALUE");
  IElementType XOR = new RutaTokenType("^");
  IElementType XOREQ = new RutaTokenType("^=");

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
