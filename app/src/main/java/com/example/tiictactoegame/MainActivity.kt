package com.example.tiictactoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private var playeroneTurn=true
    private var playeroneMoves= mutableListOf<Int>()
    private var playerTwomoves= mutableListOf<Int>()

    private val possibleWins: Array<List<Int>> = arrayof{

        listOf(1,2,3),
        listOf(4,5,6),
        listOf(7,8,9),

        listOf(1,4,37,
        listOf(2,5,8),
        listOf(3,6,9),

        listOf(1,5,0),
        listOf(3,5,7),


    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setUpBoard(){

    }
}