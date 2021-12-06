package com.example.makharijal_huruf;

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

    public void openPractice(View view)
    {
        Intent intent = new Intent(this, Practice.class);
        startActivity(intent);
    }

    public void openQuiz(View view)
    {
        Intent quiz = new Intent(this, MainQuiz.class);
        startActivity(quiz);
    }


}
