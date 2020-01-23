package com.example.postservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    var b1:Button by Delegates.notNull<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        b1 = findViewById(R.id.button)
        b1.setOnClickListener{
            var post:AsynkHttp = AsynkHttp("Android",10.11)
            post.execute()

        }
    }
}
