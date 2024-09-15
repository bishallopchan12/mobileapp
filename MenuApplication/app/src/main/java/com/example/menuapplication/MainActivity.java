package com.example.menuapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btnClick=findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }
    protected  void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Calculate");
        builder.setCancelable(true);
        LayoutInflater inflater=getLayoutInflater();
        View view=inflater.inflate(R.layout.custom_dialog,null);
        builder.setView(view);
        EditText edtfirst=view.findViewById(R.id.first);
        EditText edtsecond=view.findViewById(R.id.second);
        Button btnCalculate=view.findViewById(R.id.btnCalculate);
        TextView txtresult=view.findViewById(R.id.result);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first, second, result;
                first=Integer.parseInt(edtfirst.getText().toString());
                second=Integer.parseInt(edtsecond.getText().toString());
                result=first+second;
                txtresult.setText("Result="+result);

            }
        });
        AlertDialog alert= builder.create();
        alert.show();
    }
}