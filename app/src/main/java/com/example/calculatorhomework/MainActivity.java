package com.example.calculatorhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ButtonClick(View view){

        EditText EditOne = (EditText)findViewById(R.id.textOne);

        EditText EditTwo = (EditText)findViewById(R.id.textTwo);

        TextView TextOne = (TextView)findViewById(R.id.viewOne);

        // now converting va;ues

        double EditOneText = Double.parseDouble(EditOne.getText().toString());

        double EditTwoText = Double.parseDouble(EditTwo.getText().toString());

        double results = EditOneText + EditTwoText;

        TextOne.setText(results + "");




    }

    public void Subtraction(View view){

        EditText EditOne = (EditText)findViewById(R.id.textOne);

        EditText EditTwo = (EditText)findViewById(R.id.textTwo);

        TextView TextOne = (TextView)findViewById(R.id.viewOne);

        // now converting va;ues

        double EditOneText = Double.parseDouble(EditOne.getText().toString());

        double EditTwoText = Double.parseDouble(EditTwo.getText().toString());

        double results = EditOneText - EditTwoText;

        TextOne.setText(results + "");


    }
    public void Divide(View view){


        EditText EditOne = (EditText)findViewById(R.id.textOne);

        EditText EditTwo = (EditText)findViewById(R.id.textTwo);

        TextView TextOne = (TextView)findViewById(R.id.viewOne);

        // now converting va;ues

        double EditOneText = Double.parseDouble(EditOne.getText().toString());

        double EditTwoText = Double.parseDouble(EditTwo.getText().toString());

        double results = EditOneText / EditTwoText;

        TextOne.setText(results + "");

    }
    public void  Multiplication(View view){

        EditText EditOne = (EditText)findViewById(R.id.textOne);

        EditText EditTwo = (EditText)findViewById(R.id.textTwo);

        TextView TextOne = (TextView)findViewById(R.id.viewOne);

        // now converting va;ues

        double EditOneText = Double.parseDouble(EditOne.getText().toString());

        double EditTwoText = Double.parseDouble(EditTwo.getText().toString());

       double results = EditOneText * EditTwoText;

        TextOne.setText(results + "");

    }





}
