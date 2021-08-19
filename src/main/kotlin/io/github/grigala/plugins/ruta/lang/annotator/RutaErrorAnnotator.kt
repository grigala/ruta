package io.github.grigala.plugins.ruta.lang.annotator

import com.intellij.codeInsight.daemon.impl.HighlightRangeExtension
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class RutaErrorAnnotator : AnnotatorBase(), HighlightRangeExtension {
    override fun annotateInternal(element: PsiElement, holder: AnnotationHolder) {
        TODO("Not yet implemented")
    }

    override fun isForceHighlightParents(file: PsiFile): Boolean {
        TODO("Not yet implemented")
    }
}
