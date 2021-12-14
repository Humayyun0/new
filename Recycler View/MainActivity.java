package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.myarraylist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] list={"shery","fero","atif","ali","a","b","c","d"};

        recyclerView.setAdapter(new addapterclass(list));
    }
}