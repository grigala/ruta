package io.github.grigala.plugins.ruta.lang

import com.intellij.lang.Language

object RutaLanguage : Language("Ruta", "text/ruta") {

    override fun isCaseSensitive(): Boolean = true

    override fun getDisplayName(): String = "Ruta"
}
