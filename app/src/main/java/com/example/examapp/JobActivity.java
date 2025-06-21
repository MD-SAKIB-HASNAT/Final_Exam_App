package com.example.examapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class JobActivity extends AppCompatActivity {

    RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_job);

        recView = findViewById(R.id.rec_view);
        recView.setLayoutManager(new LinearLayoutManager(this));
        //Answer to the question no 2. RecyclerView Adapter
        JobAdapter jobAdapter = new JobAdapter();
        recView.setAdapter(jobAdapter);

    }
}