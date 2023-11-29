package com.example.myapplication.ui.theme

import android.text.TextUtils

class Utils {
    companion object {
        @JvmStatic
        fun isMyName(name: String): Boolean {
            return !TextUtils.isEmpty(name) && name != "Shakir"
        }
    }
}