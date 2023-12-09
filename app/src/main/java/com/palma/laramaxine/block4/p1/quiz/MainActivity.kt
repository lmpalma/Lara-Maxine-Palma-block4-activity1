package com.palma.laramaxine.block4.p1.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var studentName: EditText
    private lateinit var amountPaid: EditText
    private lateinit var paymentPurpose: EditText
    private lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        studentName = findViewById(R.id.nameInput)
        amountPaid = findViewById(R.id.paymentInput)
        paymentPurpose = findViewById(R.id.purposeInput)
        addButton = findViewById(R.id.addButton)

        addButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}