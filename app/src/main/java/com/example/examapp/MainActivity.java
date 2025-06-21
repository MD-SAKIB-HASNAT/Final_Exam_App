package com.example.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button stBtn;
    EditText edtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        stBtn = findViewById(R.id.start_btn);
        edtName = findViewById(R.id.edt_name);


        stBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = edtName.getText().toString();
                if(Name.isEmpty()){
                    edtName.setError("আপনার নাম লিখুন");
                }
                else {

                    // Answer to the question no 3. Intent with Data Passing
                    Intent i =new Intent(MainActivity.this, HomeActivity.class);
                    i.putExtra("name", Name);
                    startActivity(i);
                }
            }
        });
    }
}