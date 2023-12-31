package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v)
    {
        EditText nameText = findViewById(R.id.name);
        EditText companyText = findViewById(R.id.company);
        EditText ageText = findViewById(R.id.age);

        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("company",company);
        intent.putExtra("age",age);
        startActivity(intent);
    }


    public void onClick2(View view) {
        System.exit(0);
    }
}