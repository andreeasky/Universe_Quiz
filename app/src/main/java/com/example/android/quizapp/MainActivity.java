package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    int scoreQuestion1, scoreQuestion2, scoreQuestion3, scoreQuestion4, scoreQuestion5, scoreQuestion6, scoreQuestion7, scoreQuestion8, scoreQuestion9, scoreQuestion10 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method checks the responses for all questions and calculates the total score

    public void checkScore(View view) {

        // Check response for Question 1 //

        RadioButton question1OptionA = (RadioButton) findViewById(R.id.Question1_OptionA);
        boolean isQuestion1OptionA = question1OptionA.isChecked();
        RadioButton question1OptionB = (RadioButton) findViewById(R.id.Question1_OptionB);
        boolean isQuestion1OptionB = question1OptionB.isChecked();
        RadioButton question1OptionC = (RadioButton) findViewById(R.id.Question1_OptionC);
        boolean isQuestion1OptionC = question1OptionC.isChecked();
        if (isQuestion1OptionB) {
            scoreQuestion1 = 1;
        } else {
            scoreQuestion1 = 0;
        }

        // Check response for Question 2 //

        RadioButton question2OptionA = (RadioButton) findViewById(R.id.Question2_OptionA);
        boolean isQuestion2OptionA = question2OptionA.isChecked();
        RadioButton question2OptionB = (RadioButton) findViewById(R.id.Question2_OptionB);
        boolean isQuestion2OptionB = question2OptionB.isChecked();
        RadioButton question2OptionC = (RadioButton) findViewById(R.id.Question2_OptionC);
        boolean isQuestion2OptionC = question2OptionC.isChecked();
        if (isQuestion2OptionC) {
            scoreQuestion2 = 1;
        } else {
            scoreQuestion2 = 0;
        }

        // Check response for Question 3 //

        RadioButton question3OptionA = (RadioButton) findViewById(R.id.Question3_OptionA);
        boolean isQuestion3OptionA = question3OptionA.isChecked();
        RadioButton question3OptionB = (RadioButton) findViewById(R.id.Question3_OptionB);
        boolean isQuestion3OptionB = question3OptionB.isChecked();
        RadioButton question3OptionC = (RadioButton) findViewById(R.id.Question3_OptionC);
        boolean isQuestion3OptionC = question3OptionC.isChecked();
        if (isQuestion3OptionB) {
            scoreQuestion3 = 1;
        } else {
            scoreQuestion3 = 0;
        }

        // Check response for Question 4 //

        RadioButton question4OptionA = (RadioButton) findViewById(R.id.Question4_OptionA);
        boolean isQuestion4OptionA = question4OptionA.isChecked();
        RadioButton question4OptionB = (RadioButton) findViewById(R.id.Question4_OptionB);
        boolean isQuestion4OptionB = question4OptionB.isChecked();
        RadioButton question4OptionC = (RadioButton) findViewById(R.id.Question4_OptionC);
        boolean isQuestion4OptionC = question4OptionC.isChecked();
        if (isQuestion4OptionA) {
            scoreQuestion4 = 1;
        } else {
            scoreQuestion4 = 0;
        }

        // Check response for Question 5 //

        EditText question5Response = (EditText) findViewById(R.id.Question5_Response);
        String responseQuestion5 = question5Response.getText().toString().toLowerCase();
        if (responseQuestion5.equals("jupiter")) {
            scoreQuestion5 = 1;
        } else {
            scoreQuestion5 = 0;
        }

        // Check response for Question 6 //

        CheckBox question6OptionA = (CheckBox) findViewById(R.id.Question6_OptionA);
        boolean isQuestion6OptionA = question6OptionA.isChecked();
        CheckBox question6OptionB = (CheckBox) findViewById(R.id.Question6_OptionB);
        boolean isQuestion6OptionB = question6OptionB.isChecked();
        CheckBox question6OptionC = (CheckBox) findViewById(R.id.Question6_OptionC);
        boolean isQuestion6OptionC = question6OptionC.isChecked();
        CheckBox question6OptionD = (CheckBox) findViewById(R.id.Question6_OptionD);
        boolean isQuestion6OptionD = question6OptionD.isChecked();
        CheckBox question6OptionE = (CheckBox) findViewById(R.id.Question6_OptionE);
        boolean isQuestion6OptionE = question6OptionE.isChecked();
        CheckBox question6OptionF = (CheckBox) findViewById(R.id.Question6_OptionF);
        boolean isQuestion6OptionF = question6OptionF.isChecked();
        if (isQuestion6OptionB && isQuestion6OptionC && isQuestion6OptionE && isQuestion6OptionF && !isQuestion6OptionA && !isQuestion6OptionD) {
            scoreQuestion6 = 1;
        }

        // Check response for Question 7 //

        RadioButton question7OptionA = (RadioButton) findViewById(R.id.Question7_OptionA);
        boolean isQuestion7OptionA = question7OptionA.isChecked();
        RadioButton question7OptionB = (RadioButton) findViewById(R.id.Question7_OptionB);
        boolean isQuestion7OptionB = question7OptionB.isChecked();
        RadioButton question7OptionC = (RadioButton) findViewById(R.id.Question7_OptionC);
        boolean isQuestion7OptionC = question7OptionC.isChecked();
        if (isQuestion7OptionA) {
            scoreQuestion7 = 1;
        } else {
            scoreQuestion7 = 0;
        }

        // Check response for Question 8 //

        RadioButton question8OptionA = (RadioButton) findViewById(R.id.Question8_OptionA);
        boolean isQuestion8OptionA = question8OptionA.isChecked();
        RadioButton question8OptionB = (RadioButton) findViewById(R.id.Question8_OptionB);
        boolean isQuestion8OptionB = question8OptionB.isChecked();
        RadioButton question8OptionC = (RadioButton) findViewById(R.id.Question8_OptionC);
        boolean isQuestion8OptionC = question8OptionC.isChecked();
        if (isQuestion8OptionC) {
            scoreQuestion8 = 1;
        } else {
            scoreQuestion8 = 0;
        }

        // Check response for Question 9 //

        RadioButton question9OptionA = (RadioButton) findViewById(R.id.Question9_OptionA);
        boolean isQuestion9OptionA = question9OptionA.isChecked();
        RadioButton question9OptionB = (RadioButton) findViewById(R.id.Question9_OptionB);
        boolean isQuestion9OptionB = question9OptionB.isChecked();
        if (isQuestion9OptionA) {
            scoreQuestion9 = 1;
        } else {
            scoreQuestion9 = 0;
        }

        // Check response for Question 10 //

        RadioButton question10OptionA = (RadioButton) findViewById(R.id.Question10_OptionA);
        boolean isQuestion10OptionA = question10OptionA.isChecked();
        RadioButton question10OptionB = (RadioButton) findViewById(R.id.Question10_OptionB);
        boolean isQuestion10OptionB = question10OptionB.isChecked();
        RadioButton question10OptionC = (RadioButton) findViewById(R.id.Question10_OptionC);
        boolean isQuestion10OptionC = question10OptionC.isChecked();
        RadioButton question10OptionD = (RadioButton) findViewById(R.id.Question10_OptionD);
        boolean isQuestion10OptionD = question10OptionD.isChecked();
        if (isQuestion10OptionC) {
            scoreQuestion10 = 1;
        } else {
            scoreQuestion10 = 0;
        }

        // This method calculates the total score //

        score = scoreQuestion1 + scoreQuestion2 + scoreQuestion3 + scoreQuestion4 + scoreQuestion5 + scoreQuestion6 + scoreQuestion7 + scoreQuestion8 + scoreQuestion9 + scoreQuestion10;

        // This method displays the total score //

        Toast.makeText(this, "Your score is " + score + " out of 10", Toast.LENGTH_LONG).show();
    }
}


