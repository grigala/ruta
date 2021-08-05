package io.github.grigala.plugins.ruta.language

import com.intellij.lang.Language

class RutaLanguage(val name: String) : Language(name) {

    companion object {
        val INSTANCE: RutaLanguage = RutaLanguage("Ruta")
    }
}
