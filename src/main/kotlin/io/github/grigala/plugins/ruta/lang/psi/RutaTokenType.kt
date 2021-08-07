package io.github.grigala.plugins.ruta.lang.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import io.github.grigala.plugins.ruta.lang.RutaLanguage

open class RutaTokenType(debugName: String) : IElementType(debugName, RutaLanguage) {
    override fun toString(): String = "RutaTokenType." + super.toString()
}

fun tokenSetOf(vararg tokens: IElementType) = TokenSet.create(*tokens)

val RUTA_CONDITIONS = tokenSetOf()

val RUTA_OPERATORS = tokenSetOf()

val RUTA_BLOCKS = tokenSetOf()
