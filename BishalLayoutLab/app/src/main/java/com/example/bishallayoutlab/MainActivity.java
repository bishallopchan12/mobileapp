package com.example.bishallayoutlab;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText nameEditText, emailEditText, passwordEditText;
    private RadioGroup radioGroup;
    private Spinner stateSpinner;
    private TextView resultTextView;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        radioGroup = findViewById(R.id.radioGroup);
        stateSpinner = findViewById(R.id.stateSpinner);
        resultTextView = findViewById(R.id.resultTextView);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                int selectedId = radioGroup.getCheckedRadioButtonId();
                RadioButton selectedRadioButton = findViewById(selectedId);
                String gender = selectedRadioButton.getText().toString();

                String state = stateSpinner.getSelectedItem().toString();

                String result = "Name: " + name + "\nEmail: " + email + "\nPassword: " + password +
                        "\nGender: " + gender + "\nState: " + state;

                resultTextView.setText(result);
                resultTextView.setVisibility(View.VISIBLE);
            }
        });
    }
}