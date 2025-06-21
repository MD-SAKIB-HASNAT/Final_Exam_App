package com.example.examapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CategoryActivity extends AppCompatActivity {
    ListView lstCat;
    String[] ctg = {
            "ইন্টার্নশিপ (Internship)",
            "পার্ট-টাইম (Part-Time)",
            "ফুল-টাইম (Full-Time)",
            "রিমোট (Remote)",
            "চুক্তিভিত্তিক (Contract)",
            "ফ্রিল্যান্স (Freelance)",
            "অস্থায়ী (Temporary)",
            "অফিস ভিত্তিক (On-Site)",
            "হাইব্রিড (Hybrid)",
            "স্বেচ্ছাসেবক (Volunteer)",
            "প্রবেশনারী (Entry Level)",
            "মধ্যম পর্যায় (Mid Level)",
            "জ্যেষ্ঠ পর্যায় (Senior Level)",
            "ম্যানেজমেন্ট (Management)",
            "পরামর্শক (Consultant)"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_category);



        lstCat = findViewById(R.id.list_view_category);
        //Answer to the question no  5. ListView with ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ctg);
        lstCat.setAdapter(adapter);





    }
}