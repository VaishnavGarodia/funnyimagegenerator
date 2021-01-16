package com.example.funnyimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class showmeme extends AppCompatActivity {


    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showmeme);
        Random random = new Random();
        imageView = findViewById(R.id.imageView4);
        int rand;
        switch(profession.profession){
            case 0:
                rand = random.nextInt(2);
                switch(rand){
                    case 1:
                        imageView.setImageResource(R.drawable.computer2);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.computer3);
                        break;
                    case 0:
                    default:
                        imageView.setImageResource(R.drawable.computer1);
                        break;
                }
                break;
            case 1:
                rand = random.nextInt(1);
                switch(rand){
                    case 1:
                        imageView.setImageResource(R.drawable.doctor2);
                        break;
                    case 0:
                    default:
                        imageView.setImageResource(R.drawable.doctor1);
                        break;
                }
                break;
            case 2:
                rand = random.nextInt(1);
                switch(rand){
                    case 1:
                        imageView.setImageResource(R.drawable.scientist1);
                        break;
                    case 0:
                    default:
                        imageView.setImageResource(R.drawable.scientist2);
                        break;
                }
                break;
            case 4:
                rand = random.nextInt(2);
                switch(rand){
                    case 1:
                        imageView.setImageResource(R.drawable.student1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.student2);
                        break;
                    case 0:
                    default:
                        imageView.setImageResource(R.drawable.student3);
                        break;
                }
                break;
            case 3:
                rand = random.nextInt(2);
                Log.i("random",Integer.toString(rand));
                switch(rand){
                    case 1:
                        imageView.setImageResource(R.drawable.teacher1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.teacher2);
                        break;
                    case 0:
                    default:
                        imageView.setImageResource(R.drawable.teacher3);
                        break;
                }
                break;
        }

    }
    public void restart(View view){
        Intent intent = new Intent(getApplicationContext(),gender.class);
        startActivity(intent);
    }
}