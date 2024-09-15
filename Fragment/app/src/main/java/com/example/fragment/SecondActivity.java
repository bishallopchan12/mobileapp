package com.example.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);


        Button btnFirst=findViewById(R.id.btnFirst);
        Button btnSecond=findViewById(R.id.btnSecond);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FirstFragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction= manager.beginTransaction();
                transaction.replace(R.id.fragment,fragment);
                transaction.commit();

            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FirstFragment();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction= manager.beginTransaction();
                transaction.replace(R.id.fragment,fragment);
                transaction.commit();


            }
        });



}}