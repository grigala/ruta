package io.github.grigala.plugins.ruta.lang.highlighter

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import io.github.grigala.plugins.ruta.lang.Icons
import javax.swing.Icon

class RutaColorSettingsPage : ColorSettingsPage {
    private val DESCRIPTORS: Array<AttributesDescriptor> = TODO()

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = "Ruta"

    override fun getIcon(): Icon = Icons.APP_ICON

    override fun getHighlighter(): SyntaxHighlighter = RutaHighlighter()

    override fun getDemoText(): String {
        TODO("Not yet implemented")
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? {
        TODO("Not yet implemented")
    }

}
