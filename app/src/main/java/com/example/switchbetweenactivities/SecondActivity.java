package com.example.switchbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Arrays;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String name=intent.getStringExtra("my_name");
        int age=intent.getIntExtra("my_age",0);
        byte[] random=intent.getByteArrayExtra("random");

        System.out.println("MainActivityden gelen name:"+name);
        System.out.println("MainActivityden gelen age:"+age);
        System.out.println("MainActivityden gelen random:"+ Arrays.toString(random));




    }
}