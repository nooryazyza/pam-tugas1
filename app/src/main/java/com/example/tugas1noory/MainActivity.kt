package com.example.tugas1noory

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val frameLayout = FrameLayout(this)
        frameLayout.setPadding(32)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val nimTextView = TextView(this)
        nimTextView.text = getString(R.string.nim_text)
        nimTextView.textSize = 20f
        layout.addView(nimTextView)

        val nameTextView = TextView(this)
        nameTextView.text = getString(R.string.name_text)
        nameTextView.textSize = 20f
        layout.addView(nameTextView)

        frameLayout.addView(layout)
        val params = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT)
        params.gravity = android.view.Gravity.CENTER
        layout.layoutParams = params

        setContentView(frameLayout)
    }
}