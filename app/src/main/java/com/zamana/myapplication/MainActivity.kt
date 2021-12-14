package com.zamana.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.CheckBox
import android.widget.EditText
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.getString(R.string.string_for_text)
        this.getColor(R.color.gray)
        findViewById<EditText>(R.id.editTextTextEmailAddress)
            .addTextChangedListener(MyTextWatcher {
                it.isBlank()
            })
        findViewById<CheckBox>(R.id.checkBox).setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

            }
        }
    }
}