package com.github.nxvzbgbfben.hsp3idea

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class HSP3FileType : LanguageFileType(HSP3Language.INSTANCE) {
    companion object {
        val INSTANCE = HSP3FileType()
    }

    override fun getName() = "HSP3 File"

    override fun getDescription() = "HSP3 script file"

    override fun getDefaultExtension() = "hsp"

    override fun getIcon(): Icon? = null
}