package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            //val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

        if (diceRoll == 1) {
            val toast =
                Toast.makeText(this, "You rolled a 1! Great job!", Toast.LENGTH_SHORT).show()
        } else if (diceRoll == 2) {
            val toast =
                Toast.makeText(this, "You rolled a 2! Great job!", Toast.LENGTH_SHORT).show()
        } else if (diceRoll == 3) {
            val toast =
                Toast.makeText(this, "You rolled a 3! Great job!", Toast.LENGTH_SHORT).show()
        } else if (diceRoll == 4) {
            val toast =
                Toast.makeText(this, "You rolled a 4! Great job!", Toast.LENGTH_SHORT).show()
        } else if (diceRoll == 5) {
            val toast =
                Toast.makeText(this, "You rolled a 5! Great job!", Toast.LENGTH_SHORT).show()
        } else if (diceRoll == 6) {
            val toast =
                Toast.makeText(this, "You rolled a 6! Great job!", Toast.LENGTH_SHORT).show()
        }
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}