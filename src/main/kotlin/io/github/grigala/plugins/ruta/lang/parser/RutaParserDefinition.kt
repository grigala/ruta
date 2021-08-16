package io.github.grigala.plugins.ruta.lang.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.LanguageUtil
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import io.github.grigala.plugins.ruta.lang.lexer.RutaLexer
import io.github.grigala.plugins.ruta.lang.psi.RUTA_ALL_STRING_LITERALS
import io.github.grigala.plugins.ruta.lang.psi.RUTA_COMMENTS
import io.github.grigala.plugins.ruta.lang.psi.RutaElementTypes
import io.github.grigala.plugins.ruta.lang.psi.RutaTokenType

class RutaParserDefinition : ParserDefinition {

    override fun createLexer(project: Project?): Lexer = RutaLexer()

    override fun createParser(project: Project?): PsiParser = RutaParser()

    override fun getFileNodeType(): IFileElementType {
        TODO("Not yet implemented")
    }

    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)

    override fun getCommentTokens(): TokenSet = RUTA_COMMENTS

    override fun getStringLiteralElements(): TokenSet = RUTA_ALL_STRING_LITERALS

    override fun createElement(node: ASTNode?): PsiElement =
        RutaElementTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider?): PsiFile {
        TODO("Not yet implemented")
    }

    override fun spaceExistenceTypeBetweenTokens(
        left: ASTNode?,
        right: ASTNode?
    ): ParserDefinition.SpaceRequirements {
        return super.spaceExistenceTypeBetweenTokens(left, right)
    }

    override fun spaceExistanceTypeBetweenTokens(
        left: ASTNode?,
        right: ASTNode?
    ): ParserDefinition.SpaceRequirements {
        val leftElementType = left?.elementType

        if (leftElementType == EOL_COMMENT) {
            return ParserDefinition.SpaceRequirements.MUST_LINE_BREAK
        }

        return LanguageUtil.canStickTokensTogetherByLexer(left, right, RutaLexer())
    }

    companion object {
        @JvmField
        val BLOCK_COMMENT = RutaTokenType("<BLOCK_COMMENT")
        @JvmField
        val EOL_COMMENT = RutaTokenType("<EOL_COMMENT>")

        /**
         * Should be increased after any change of lexer rules
         */
        const val LEXER_VERSION: Int = 3

        /**
         * Should be increased after any change of parser rules
         */
        const val PARSER_VERSION: Int = LEXER_VERSION + 28
    }
}
