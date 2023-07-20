package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.healthapp.databinding.ActivityLoginBinding;
import com.example.healthapp.databinding.ActivityProvideDetailBinding;


public class ProvideDetail extends AppCompatActivity {
    ActivityProvideDetailBinding binding;








    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProvideDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.predict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProvideDetail.this, HomePageActivity.class));
            }
        });
    }}