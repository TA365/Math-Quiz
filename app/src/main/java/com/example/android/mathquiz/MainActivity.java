package com.example.android.mathquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /***
     * Submit quiz order method will provide the final result of Quiz
     */
    public void submitQuizResult(View view){
        int duration = Toast.LENGTH_LONG;
        EditText mEdit = ((EditText) findViewById(R.id.name));
        String yourName = mEdit.getText().toString();
        /**
         * checking for the value of yourName is empty or not
         */
        if(yourName.isEmpty()){
            String text = "Please enter your name!!";
            /**
             * Setting and showing Toast value
             */
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }
        else {
            int qOneValue = questionOne();
            int qTwoValue = questionTwo();
            int qThreeValue = questionThree();
            int qFourValue = questionFour();
            int qFiveValue = questionFive();
            int totalScore = (qOneValue + qTwoValue + qThreeValue + qFourValue + qFiveValue);

            String text = "Hi : " + yourName;
            text += "\n" + "Point for question no one: " + qOneValue;
            text += "\n" + "Point for question no two: " + qTwoValue;
            text += "\n" + "Point for question no three: " + qThreeValue;
            text += "\n" + "Point for question no four: " + qFourValue;
            text += "\n" + "Point for question no five: " + qFiveValue;
            text += "\n" + "-------------------------------- ";
            text += "\n" + "Your total Point is: " + totalScore;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }


    }
    /***
     * questionOne method will check question one value
     */
    public int questionOne(){
        int value;
        // Is the button now checked?
        boolean checkedOne = ((RadioButton) findViewById(R.id.q_one_one)).isChecked();
        if(checkedOne){value=1;}
        else {value=0;}
        return value;
    }
    /***
     * questionTwo method will check question two value
     */
    public int questionTwo(){
        int value;
        // Is the button now checked?
        boolean checkedOne = ((CheckBox) findViewById(R.id.q_two_one)).isChecked();
        boolean checkedThree = ((CheckBox) findViewById(R.id.q_two_three)).isChecked();
        if(checkedOne&&checkedThree){value=1;}
        else {value=0;}
        return value;
    }
    /***
     * questionThree method will check question Three value
     */
    public int questionThree(){
        int value;
        // Is the button now checked?
        boolean checkedThree = ((RadioButton) findViewById(R.id.q_three_three)).isChecked();
        if(checkedThree){value=1;}
        else {value=0;}
        return value;
    }
    /***
     * questionFour method will check question Four value
     */
    public int questionFour(){
        int value;
        // Is the button now checked?
        boolean checkedTwo = ((RadioButton) findViewById(R.id.q_four_two)).isChecked();
        if(checkedTwo){value=1;}
        else {value=0;}
        return value;
    }
    /***
     * questionFive method will check question Five value
     */
    public int questionFive(){
        int value;
        // Is the button now checked?
        boolean checkedOne = ((RadioButton) findViewById(R.id.q_five_one)).isChecked();
        if(checkedOne){value=1;}
        else {value=0;}
        return value;
    }
}
