package com.example.bishallayoutlab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConstraintsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_constraints);
        Button submitBtn = findViewById(R.id.submitBtn);
        EditText emailEt = findViewById(R.id.EmailEt);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConstraintsActivity.this, "Submit button clicked", Toast.LENGTH_LONG).show();
            }
        });

        submitBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(ConstraintsActivity.this, "long pressed", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        emailEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(ConstraintsActivity.this, "Focus changed", Toast.LENGTH_SHORT).show();
            }
        });


    }
}