package com.example.quizapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreQuestionOne = 0;
    int scoreQuestionTwo = 0;
    int scoreQuestionThree = 0;
    int scoreQuestionFour = 0;
    int scoreQuestionFive = 0;
    int scoreQuestionSix = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Calculates score.
     */
    public void calculateScore(View view) {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        score = scoreQuestionOne + scoreQuestionTwo + scoreQuestionThree + scoreQuestionFour + scoreQuestionFive + scoreQuestionSix;
        displayScore(score);
    }

    /**
     * Check's if the right answer was chosen and updates scoreQuestionOne.
     * If scoreQuestionOne is updated to 1 the answer is correct.
     */
    @SuppressLint("NonConstantResourceId")
    public void questionOne() {
        RadioGroup questionOne = findViewById(R.id.radioGroupOne);
        switch (questionOne.getCheckedRadioButtonId()) {
            case R.id.questionOneAnswerOne:
            case R.id.questionOneAnswerThree:
            case R.id.questionOneAnswerTwo:
                scoreQuestionOne = 0;
                displayScore(score);
                break;
            case R.id.questionOneAnswerFour:
                scoreQuestionOne = 1;
                displayScore(score);
                break;
        }
    }

    /**
     * Check's if the right answer was chosen and updates scoreQuestionTwo.
     * If scoreQuestionTwo is updated to 1 the answer is correct.
     */
    @SuppressLint("NonConstantResourceId")
    public void questionTwo() {
        RadioGroup questionTwo = findViewById(R.id.radioGroupTwo);
        switch (questionTwo.getCheckedRadioButtonId()) {
            case R.id.questionTwoAnswerOne:
            case R.id.questionTwoAnswerTwo:
            case R.id.questionTwoAnswerFour:
                scoreQuestionTwo = 0;
                displayScore(score);
                break;
            case R.id.questionTwoAnswerThree:
                scoreQuestionTwo = 1;
                displayScore(score);
                break;
        }
    }

    /**
     * Check's if the right answer was chosen and updates scoreQuestionThree.
     * If scoreQuestionThree is updated to 1 the answer is correct.
     */
    @SuppressLint("NonConstantResourceId")
    public void questionThree() {
        RadioGroup questionThree = findViewById(R.id.radioGroupThree);
        switch (questionThree.getCheckedRadioButtonId()) {
            case R.id.questionThreeAnswerTwo:
                scoreQuestionThree = 0;
                displayScore(score);
                break;
            case R.id.questionThreeAnswerOne:
                scoreQuestionThree = 1;
                displayScore(score);
                break;
        }
    }

    /**
     * Check's if the right answer was chosen and updates scoreQuestionFour.
     * If scoreQuestionFour is updated to 1 the answer is correct.
     */
    @SuppressLint("NonConstantResourceId")
    public void questionFour() {
        RadioGroup questionFour = findViewById(R.id.radioGroupFour);
        switch (questionFour.getCheckedRadioButtonId()) {
            case R.id.questionFourAnswerOne:
            case R.id.questionFourAnswerThree:
            case R.id.questionFourAnswerFour:
                scoreQuestionFour = 0;
                displayScore(score);
                break;
            case R.id.questionFourAnswerTwo:
                scoreQuestionFour = 1;
                displayScore(score);
                break;
        }
    }

    /**
     * Check's if the right answer was chosen and updates scoreQuestionFive.
     * If scoreQuestionFive is updated to 1 the answer is correct.
     */
    @SuppressLint("NonConstantResourceId")
    public void questionFive() {
        RadioGroup questionFive = findViewById(R.id.radioGroupFive);
        switch (questionFive.getCheckedRadioButtonId()) {
            case R.id.questionFiveAnswerOne:
            case R.id.questionFiveAnswerTwo:
            case R.id.questionFiveAnswerFour:
                scoreQuestionFive = 0;
                displayScore(score);
                break;
            case R.id.questionFiveAnswerThree:
                scoreQuestionFive = 1;
                displayScore(score);
                break;
        }
    }

    /**
     * Check's if the right answer was chosen and updates scoreQuestionSix.
     * If scoreQuestionSic is updated to 1 the answer is correct.
     */
    @SuppressLint("NonConstantResourceId")
    public void questionSix() {
        RadioGroup questionSix = findViewById(R.id.radioGroupSix);
        switch (questionSix.getCheckedRadioButtonId()) {
            case R.id.questionSixAnswerOne:
            case R.id.questionSixAnswerTwo:
            case R.id.questionSixAnswerFour:
                scoreQuestionSix = 0;
                displayScore(score);
                break;
            case R.id.questionSixAnswerThree:
                scoreQuestionSix = 1;
                displayScore(score);
                break;
        }
    }

    /**
     * Display's users score.
     */
    @SuppressLint("SetTextI18n")
    private void displayScore(int number) {
        TextView quantityTextView = findViewById(R.id.score_number);
        quantityTextView.setText("" + number);
    }

    /**
     * Resets score and unchecks all RadioButton's.
     */
    public void resetScore(View view) {
        RadioGroup questionOne = findViewById(R.id.radioGroupOne);
        RadioGroup questionTwo = findViewById(R.id.radioGroupTwo);
        RadioGroup questionThree = findViewById(R.id.radioGroupThree);
        RadioGroup questionFour = findViewById(R.id.radioGroupFour);
        RadioGroup questionFive = findViewById(R.id.radioGroupFive);
        RadioGroup questionSix = findViewById(R.id.radioGroupSix);
        questionOne.clearCheck();
        questionTwo.clearCheck();
        questionThree.clearCheck();
        questionFour.clearCheck();
        questionFive.clearCheck();
        questionSix.clearCheck();
        score = 0;
        scoreQuestionOne = 0;
        scoreQuestionTwo = 0;
        scoreQuestionThree = 0;
        scoreQuestionFour = 0;
        scoreQuestionFive = 0;
        scoreQuestionSix = 0;
        displayScore(score);
    }
}