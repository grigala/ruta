package io.github.grigala.plugins.ruta.language

import com.intellij.openapi.fileTypes.LanguageFileType
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import javax.swing.Icon

class RutaFileType private constructor() : LanguageFileType(RutaLanguage.INSTANCE) {
    @NotNull
    override fun getName(): String {
        return "Ruta File"
    }

    @NotNull
    override fun getDescription(): String {
        return "Ruta language file"
    }

    @NotNull
    override fun getDefaultExtension(): String {
        return "ruta"
    }

    @Nullable
    override fun getIcon(): Icon? {
        return Icons.APP_ICON
    }

    companion object {
        val INSTANCE = RutaFileType()
    }
}
