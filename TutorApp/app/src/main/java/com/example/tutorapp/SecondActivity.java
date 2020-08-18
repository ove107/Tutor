package com.example.tutorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private int num1 = 0;
    private int num2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void buttonTwoClicked(View view) {
        Intent intent = new Intent();
        EditText et = (EditText)findViewById(R.id.num1);
        EditText ett = findViewById(R.id.num2);
        num1 = Integer.parseInt(et.getText().toString());
        num2 = Integer.parseInt(ett.getText().toString());
        String sum = String.valueOf(num1+num2);
        intent.putExtra("result",sum);
        setResult(1234,intent);
        finish();//finishing activity
    }
}