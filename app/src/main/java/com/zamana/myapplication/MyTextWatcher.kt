package com.zamana.myapplication

import android.text.Editable
import android.text.TextWatcher

class MyTextWatcher(val onFinishInput: (text: String) -> Unit) : TextWatcher {

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        //   TODO("Not yet implemented")
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        //    TODO("Not yet implemented")
    }

    override fun afterTextChanged(p0: Editable?) {
        onFinishInput(p0.toString())
    }
}