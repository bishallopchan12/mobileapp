package com.example.lab7menusapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popUpBtn = findViewById(R.id.btn1);
        popUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });
    }

    public void showMenu(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.my_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Home:
                showDialog();
                return true;
            case R.id.About:
                showDialog();
                return true;
            case R.id.contact:

                return true;
            case R.id.showCustomDialog:
                showDialog();
                return true;
            default:
                return false;
        }
    }

    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Calculate Simple Interest");
        builder.setCancelable(true);

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_layout, null);
        builder.setView(view);

        EditText editTextPrincipal = view.findViewById(R.id.principle);
        EditText editTextRate = view.findViewById(R.id.rate);
        EditText editTextTime = view.findViewById(R.id.time);
        Button buttonCalculate = view.findViewById(R.id.calculate);
        TextView textViewResult = view.findViewById(R.id.result);

        buttonCalculate.setOnClickListener(v -> {
            String principalStr = editTextPrincipal.getText().toString();
            String rateStr = editTextRate.getText().toString();
            String timeStr = editTextTime.getText().toString();

            if (!principalStr.isEmpty() && !rateStr.isEmpty() && !timeStr.isEmpty()) {
                double principal = Double.parseDouble(principalStr);
                double rate = Double.parseDouble(rateStr);
                double time = Double.parseDouble(timeStr);

                double simpleInterest = (principal * rate * time) / 100;
                textViewResult.setText("Simple Interest: " + simpleInterest);
            } else {
                textViewResult.setText("Please fill all fields");
            }
        });

        builder.setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        builder.create().show();
    }
}
