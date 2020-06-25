package com.example.bignerdranch.geoquiz


import androidx.lifecycle.ViewModel
import com.example.geoquiz.R

class QuizViewModel : ViewModel() {
     var isCheater = false;

    private val questionBank= listOf(
        Question(R.string.question_australia, true, isCheater),
        Question(R.string.question_oceans, true, isCheater),
        Question(R.string.question_mideast, true,isCheater),
        Question(R.string.question_africa, true,isCheater),
        Question(R.string.question_americas, true,isCheater),
        Question(R.string.question_asia, true,isCheater)
    )

    var currentIndex = 0;


    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer



    val currentQuestionCheat: Boolean
        get() = questionBank[currentIndex].cheat

    fun setCheat(cheat:Boolean){
        questionBank[currentIndex].cheat = cheat
    }


    val currentQuestionText: Int
        get() =  questionBank[currentIndex].textResId

    fun moveToNext(){
        currentIndex = (currentIndex+1) % questionBank.size
    }
}
