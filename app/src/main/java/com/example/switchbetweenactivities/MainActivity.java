package com.example.switchbetweenactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSecondActivity(View view) {

        String name="Android";
        int age=100;
        byte[] random={99, 104, 97, 109, 97};
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("my_name",name);
        intent.putExtra("my_age",age);
        intent.putExtra("random",random);
        startActivity(intent);


    }
}