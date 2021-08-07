package io.github.grigala.plugins.ruta.lang.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType

class RutaCompletionContributor : CompletionContributor() {

    init {

    }

    fun extend(type: CompletionType?, provider: RutaCompletionProvider) {
        extend(type, provider.elementPattern, provider)
    }
}
