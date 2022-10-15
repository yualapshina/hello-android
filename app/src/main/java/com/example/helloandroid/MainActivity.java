package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getResultActivity(View view)
    {
        Intent intent = new Intent(this, ResultActivity.class);
        EditText keyword = findViewById(R.id.keyword);
        intent.putExtra("keyword", keyword.getText().toString());
        startActivity(intent);
    }

}