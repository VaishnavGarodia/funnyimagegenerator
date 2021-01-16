package com.example.funnyimageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class profession extends AppCompatActivity {

    static int profession;
    ListView listView;
    ArrayList<String> professions;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profession);


        List<String> professionslist = Arrays.asList( "software engineer", "doctor", "scientist","teacher","student");
        professions = new ArrayList<String>();
        professions.addAll(professionslist);
        listView =findViewById(R.id.listview);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,professions);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                profession = position;
                Intent intent = new Intent(getApplicationContext(),showmeme.class);
                startActivity(intent);
            }
        });
    }


}