package io.github.grigala.plugins.ruta.lang.highlighter

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import io.github.grigala.plugins.ruta.lang.lexer.RutaHighlightingLexer

class RutaHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = RutaHighlightingLexer()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> =
        pack(map(tokenType)?.textAttributesKey)

    companion object {
        fun map(tokenType: IElementType) : RutaColor? = when (tokenType) {
             else -> null
        }
    }
}
