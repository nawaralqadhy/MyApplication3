package com.example.nawaralqadhy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculator, calender;
        // Nawar Alqadhy


// get the reference of Button's
        calculator = (Button) findViewById(R.id.calculator);
        calender = (Button) findViewById(R.id.calender);

// perform setOnClickListener event on First Button
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Activity
                calculator();
            }
        });
// perform setOnClickListener event on Second Button
        calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Activity
                calender();
            }
        });

    }
    private void calculator() {

        Intent intent1 = new Intent(this, Calculator.class);
        startActivity(intent1);
    }
    private void calender() {

        Intent intent2 = new Intent(this, Calender.class);
        startActivity(intent2);
    }


}
