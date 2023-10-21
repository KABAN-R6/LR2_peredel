package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.ListFormatter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.intellij.lang.annotations.JdkConstants;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvname = findViewById(R.id.name);
        TextView tvcompony = findViewById(R.id.company);
        TextView tvage = findViewById(R.id.age);


        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            String name = arguments.get("name").toString();
            String company = arguments.get("company").toString();
            int age = (int) arguments.get("age");

            tvname.setText("Name- " + name);
            tvcompony.setText("Compan- " + company);
            tvage.setText("Age- " + age);
        }



    }


    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}