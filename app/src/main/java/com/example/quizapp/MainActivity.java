package com.example.quizapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int score;
    int scoreQuestionOne;
    int scoreQuestionTwo;
    int scoreQuestionThree;
    int scoreQuestionFour;
    int scoreQuestionFive;
    int scoreQuestionSix;
    int scoreQuestionSeven;
    int scoreQuestionEight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Calculates score and displays toast.
     */
    public void calculateScore(View view) {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();
        questionEight();
        score = scoreQuestionOne + scoreQuestionTwo + scoreQuestionThree + scoreQuestionFour + scoreQuestionFive + scoreQuestionSix + scoreQuestionSeven + scoreQuestionEight;
        displayScore(score);
        Toast scoreToast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.toastMessage, score), Toast.LENGTH_SHORT);
        scoreToast.show();
    }

    /**
     * Check's if the right answer was chosen and updates scoreQuestionOne to 1 if correct.
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
     * Check's if the right answer was chosen and updates scoreQuestionTwo to 1 if correct.
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
     * Check's if the right answer was chosen and updates scoreQuestionThree to 1 if correct.
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
     * Check's if the right answer was chosen and updates scoreQuestionFour to 1 if correct.
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
     * Check's if the right answer was chosen and updates scoreQuestionFive to 1 if correct.
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
     * Check's if the right answer was chosen and updates scoreQuestionSix to 1 if correct.
     * If scoreQuestionSix is updated to 1 the answer is correct.
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
     * Check's if the right answer was chosen and updates scoreQuestionSix to 1 if correct.
     * If scoreQuestionSeven is updated to 1 the answer is correct.
     */
    public void questionSeven() {
        CheckBox questionSevenAnswerOne = findViewById(R.id.questionSevenAnswerOne);
        CheckBox questionSevenAnswerTwo = findViewById(R.id.questionSevenAnswerTwo);
        CheckBox questionSevenAnswerThree = findViewById(R.id.questionSevenAnswerThree);
        CheckBox questionSevenAnswerFour = findViewById(R.id.questionSevenAnswerFour);
        questionSevenAnswerOne.isChecked();
        if (questionSevenAnswerOne.isChecked() && questionSevenAnswerTwo.isChecked() && !questionSevenAnswerThree.isChecked() && questionSevenAnswerFour.isChecked()) {
            scoreQuestionSeven = 1;
            displayScore(score);
        } else {
            scoreQuestionSeven = 0;
        }
    }

    /**
     * Check's if the right answer was typed and updates scoreQuestionEight to 1 if correct.
     * If scoreQuestionEight is updated to 1 the answer is correct.
     */
    public void questionEight() {
        EditText questionEightProvidedAnswer = findViewById(R.id.questionEight);
        if (questionEightProvidedAnswer.getText().toString().trim().equalsIgnoreCase(getString(R.string.questionEightAnswer))) {
            scoreQuestionEight = 1;
        } else {
            scoreQuestionEight = 0;
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
     * Resets score and uncheck's all RadioButton's and CheckBoxes.
     */
    public void resetScore(View view) {
        RadioGroup questionOne = findViewById(R.id.radioGroupOne);
        RadioGroup questionTwo = findViewById(R.id.radioGroupTwo);
        RadioGroup questionThree = findViewById(R.id.radioGroupThree);
        RadioGroup questionFour = findViewById(R.id.radioGroupFour);
        RadioGroup questionFive = findViewById(R.id.radioGroupFive);
        RadioGroup questionSix = findViewById(R.id.radioGroupSix);
        CheckBox questionSevenAnswerOne = findViewById(R.id.questionSevenAnswerOne);
        CheckBox questionSevenAnswerTwo = findViewById(R.id.questionSevenAnswerTwo);
        CheckBox questionSevenAnswerThree = findViewById(R.id.questionSevenAnswerThree);
        CheckBox questionSevenAnswerFour = findViewById(R.id.questionSevenAnswerFour);
        EditText questionEightProvidedAnswer = findViewById(R.id.questionEight);
        questionOne.clearCheck();
        questionTwo.clearCheck();
        questionThree.clearCheck();
        questionFour.clearCheck();
        questionFive.clearCheck();
        questionSix.clearCheck();
        questionSevenAnswerOne.setChecked(false);
        questionSevenAnswerTwo.setChecked(false);
        questionSevenAnswerThree.setChecked(false);
        questionSevenAnswerFour.setChecked(false);
        questionEightProvidedAnswer.getText().clear();
        score = 0;
        scoreQuestionOne = 0;
        scoreQuestionTwo = 0;
        scoreQuestionThree = 0;
        scoreQuestionFour = 0;
        scoreQuestionFive = 0;
        scoreQuestionSix = 0;
        scoreQuestionSeven = 0;
        scoreQuestionEight = 0;
        displayScore(score);
    }
}