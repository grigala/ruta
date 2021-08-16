package io.github.grigala.plugins.ruta.lang.highlighter

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey

enum class RutaColor(humanName: String, default: TextAttributesKey? = null) {
    VARIABLE("Variables//Default", DefaultLanguageHighlighterColors.IDENTIFIER),
    ;

    val textAttributesKey = TextAttributesKey.createTextAttributesKey("", default)
}
