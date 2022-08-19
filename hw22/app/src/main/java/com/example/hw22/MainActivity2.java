package com.example.hw22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView3 = findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView5 = findViewById(R.id.textView5);
        TextView textView = findViewById(R.id.textView);
        TextView textView4 = findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("name");
        textView3.setText(name);

        String Email = bundle.getString("email");
        textView4.setText(Email);

        String job = bundle.getString("job");
        textView5.setText(job);

        int age = bundle.getInt("age");
        textView2.setText(String.valueOf(age));

        int NUMBER = bundle.getInt("NUMBER");
        textView.setText(String.valueOf(NUMBER));



    }
}