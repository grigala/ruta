package io.github.grigala.plugins.ruta.lang.highlighter

import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default


enum class RutaColor(humanName: String, default: TextAttributesKey? = null) {
    VARIABLE("Variables//Default", Default.IDENTIFIER),
    ;

    val textAttributesKey = TextAttributesKey.createTextAttributesKey("", default)
    val attributeDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
