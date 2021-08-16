package io.github.grigala.plugins.ruta.lang.psi

import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import io.github.grigala.plugins.ruta.lang.RutaLanguage
import io.github.grigala.plugins.ruta.lang.parser.RutaParserDefinition.Companion.BLOCK_COMMENT
import io.github.grigala.plugins.ruta.lang.parser.RutaParserDefinition.Companion.EOL_COMMENT

open class RutaTokenType(debugName: String) : IElementType(debugName, RutaLanguage)

fun tokenSetOf(vararg tokens: IElementType) = TokenSet.create(*tokens)

val RUTA_ALL_STRING_LITERALS = tokenSetOf()

val RUTA_CONDITIONS = tokenSetOf()

val RUTA_OPERATORS = tokenSetOf()

val RUTA_BLOCKS = tokenSetOf()


val RUTA_REGULAR_COMMENTS = tokenSetOf(BLOCK_COMMENT, EOL_COMMENT)
val RUTA_EOL_COMMENTS = tokenSetOf(EOL_COMMENT)
val RUTA_COMMENTS = TokenSet.orSet(RUTA_REGULAR_COMMENTS)
