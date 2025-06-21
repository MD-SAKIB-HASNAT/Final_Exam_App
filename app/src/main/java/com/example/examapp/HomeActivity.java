package com.example.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    TextView txtWlc;
    Button jobBtn, catBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);


        txtWlc = findViewById(R.id.txt_wlc);
        jobBtn = findViewById(R.id.job_btn);
        catBtn = findViewById(R.id.cat_btn);

        Intent i = getIntent();
        String Name = i.getStringExtra("name");
        txtWlc.setText(Name + " আপনাকে স্বাগতম");

        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showConfirmationDialog();
            }
        });
        jobBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, JobActivity.class));
            }
        });
    }

    //Answer to the question no 4. AlertDialog with Buttons
    private void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
        builder.setTitle("Confirmation");
        builder.setMessage("Do you want to go to the next screen?");

        builder.setPositiveButton("Yes", (dialogInterface, i) -> {
            //Answer to the question no 1. Activity Navigation
            Intent intent = new Intent(HomeActivity.this, CategoryActivity.class);
            startActivity(intent);
        });

        builder.setNegativeButton("No", (dialogInterface, i) -> {
            dialogInterface.dismiss();
        });

        builder.show();
    }
}