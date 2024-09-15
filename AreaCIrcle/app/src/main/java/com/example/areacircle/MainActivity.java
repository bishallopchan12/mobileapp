package com.example.areacircle;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputRadius;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputRadius = findViewById(R.id.inputRadius);
        calculateButton = findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        String radiusText = inputRadius.getText().toString();

        if (radiusText.isEmpty()) {
            Toast.makeText(this, "Please enter a radius", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double radius = Double.parseDouble(radiusText);
            if (radius <= 0) {
                Toast.makeText(this, "Please enter a positive value", Toast.LENGTH_SHORT).show();
                return;
            }

            double area = Math.PI * radius * radius;
            showAreaDialog(area);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_SHORT).show();
        }
    }

    private void showAreaDialog(double area) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Area of Circle");
        builder.setMessage("The area is: " + area + " square units");
        builder.setPositiveButton("OK", null);
        builder.show();
    }
}
