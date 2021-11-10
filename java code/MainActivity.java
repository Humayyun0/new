package com.example.learnarabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void practiceWindow(View view)
    {
        Intent intent = new Intent(this, Practice.class);
        startActivity(intent);
    }

    public void quizWindow( View view)
    {
        Intent quiz = new Intent(this, Quiz.class);
        startActivity(quiz);
    }
    public void repo(View view)
    {
        Uri uri = Uri.parse("https://github.com/Humayyun0/MCREP");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}