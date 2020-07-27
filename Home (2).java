package com.example.july2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    EditText firstValue, secondValue;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        firstValue = findViewById(R.id.first_value);
        secondValue = findViewById(R.id.second_value);
        answer = findViewById(R.id.answer);
    }

    public void addNumbers(View view) {
        String FirstValueData = firstValue.getText().toString();
        String secondValueData = secondValue.getText().toString();
        if (FirstValueData.isEmpty() || secondValueData.isEmpty()) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        } else {

            try {
                int firstValueInt = Integer.parseInt(FirstValueData);
                int secondValueInt = Integer.parseInt(secondValueData);
                int answerValue = firstValueInt + secondValueInt;
                String AnswerValue = String.valueOf(answerValue);
                answer.setText(AnswerValue);


            } catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        }}
    public void subNumbers(View view) {
        String FirstValueData = firstValue.getText().toString();
        String secondValueData = secondValue.getText().toString();

        if (FirstValueData.isEmpty() || secondValueData.isEmpty()) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        } else {

            try {
                int firstValueInt = Integer.parseInt(FirstValueData);
                int secondValueInt = Integer.parseInt(secondValueData);
                int answerValue = firstValueInt - secondValueInt;
                String AnswerValue = String.valueOf(answerValue);
                answer.setText(AnswerValue);


            } catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void multiplyNumbers(View view) {
        String FirstValueData = firstValue.getText().toString();
        String secondValueData = secondValue.getText().toString();

        if (FirstValueData.isEmpty() || secondValueData.isEmpty()) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        } else {

            try {
                int firstValueInt = Integer.parseInt(FirstValueData);
                int secondValueInt = Integer.parseInt(secondValueData);
                int answerValue = firstValueInt * secondValueInt;
                String AnswerValue = String.valueOf(answerValue);
                answer.setText(AnswerValue);


            } catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void divideNumbers(View view) {
        String FirstValueData = firstValue.getText().toString();
        String secondValueData = secondValue.getText().toString();

        if (FirstValueData.isEmpty() || secondValueData.isEmpty()) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        } else {

            try {
                int firstValueInt = Integer.parseInt(FirstValueData);
                int secondValueInt = Integer.parseInt(secondValueData);
                int answerValue = firstValueInt / secondValueInt;
                String AnswerValue = String.valueOf(answerValue);
                answer.setText(AnswerValue);


            } catch (Exception e) {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
            }
        }
    }

}