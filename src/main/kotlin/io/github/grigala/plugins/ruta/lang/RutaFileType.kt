package io.github.grigala.plugins.ruta.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile

import javax.swing.Icon

object RutaFileType : LanguageFileType(RutaLanguage) {

    override fun getName(): String = "Ruta File"

    override fun getIcon(): Icon = Icons.APP_ICON

    override fun getDefaultExtension(): String = "ruta"

    override fun getDescription(): String = "Ruta language file"

    override fun getCharset(file: VirtualFile, content: ByteArray?): String = "UTF-8"

}
