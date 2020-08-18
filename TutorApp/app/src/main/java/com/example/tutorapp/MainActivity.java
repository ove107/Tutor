package com.example.tutorapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public static final int CODE = 1234;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonOneClicked(View view) {
        Toast.makeText(this,"CLICKED",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

                String returnString = data.getExtras().getString("result");
                Log.d("RESULT ", returnString);
                Toast.makeText(this, "Result is = "+returnString, Toast.LENGTH_LONG).show();


        super.onActivityResult(requestCode, resultCode, data);
    }

}