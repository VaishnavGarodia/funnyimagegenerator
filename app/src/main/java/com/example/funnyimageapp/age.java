package com.example.funnyimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

public class age extends AppCompatActivity {

    NumberPicker numberPicker;
    static int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        numberPicker = findViewById(R.id.agepicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(125);

    }

    public void agechosen(View view){
        age = numberPicker.getValue();
        Intent intent = new Intent(getApplicationContext(), profession.class);
        startActivity(intent);
    }


}