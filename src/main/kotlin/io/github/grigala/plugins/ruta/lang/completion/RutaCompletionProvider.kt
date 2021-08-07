package io.github.grigala.plugins.ruta.lang.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.patterns.ElementPattern
import com.intellij.psi.PsiElement

abstract class RutaCompletionProvider : CompletionProvider<CompletionParameters>() {
    abstract val elementPattern: ElementPattern<out PsiElement>
}
