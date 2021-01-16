package com.example.funnyimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gender extends AppCompatActivity {

    static boolean genderIsMale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }

    public void male(View view){
        genderIsMale = true;
        Intent intent = new Intent(getApplicationContext(), age.class);
        startActivity(intent);
    }
    public void female(View view){
        genderIsMale = false;
        Intent intent = new Intent(getApplicationContext(), age.class);
        startActivity(intent);
    }
}