package io.github.grigala.plugins.ruta.language.psi

import com.intellij.psi.tree.IElementType
import io.github.grigala.plugins.ruta.language.RutaLanguage
import org.jetbrains.annotations.NonNls
import org.jetbrains.annotations.NotNull

class RutaTokenType(@NotNull debugName: @NonNls String?) :
    IElementType(debugName!!, RutaLanguage.INSTANCE) {
    override fun toString(): String {
        return "RutaTokenType." + super.toString()
    }
}
