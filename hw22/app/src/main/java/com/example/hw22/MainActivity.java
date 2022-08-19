package com.example.hw22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText namee = findViewById(R.id.name);
        EditText agee = findViewById(R.id.age);
        EditText job = findViewById(R.id.urjob);
        EditText number = findViewById(R.id.num);
        EditText email = findViewById(R.id.email);
        Button button = findViewById(R.id.button);

        if(namee.getText().toString().equals("")){
            namee.setError("empty!!!");

        }
        if (agee.getText().toString().equals("")){
            agee.setError("empty!!!");
        }
        if(job.getText().toString().equals("")){
            job.setError("empty!!!");

        }
        if (number.getText().toString().equals("")){
            number.setError("empty!!!");
        }
        if (email.getText().toString().equals("")){
            email.setError("empty!!!");
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = namee.getText().toString();
                int age = Integer.parseInt(agee.getText().toString());
                String urJob = job.getText().toString();
                String Email = email.getText().toString();
                int phoneNumber = Integer.parseInt(number.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", name );
                intent.putExtra("age", age);
                intent.putExtra("email", Email );
                intent.putExtra("urjob", urJob);
                intent.putExtra("phonenumber", phoneNumber);
                startActivity(intent);


            }
        });

    }
}