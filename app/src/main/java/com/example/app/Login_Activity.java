package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.app.R;

public class Login_Activity extends AppCompatActivity {


    private Button Sign_up;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Sign_up = findViewById(R.id.btn_Sign_up);
        Sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sub_Sign();
            }
        });

        login = findViewById(R.id.btn_Login);
        login.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) { Sub_Login(); }
        }));
    }

    public void Sub_Sign(){
        Intent intent = new Intent(Login_Activity.this , Sign_Up.class);
        startActivity(intent);
    }

    public void Sub_Login(){
        Intent intent = new Intent(Login_Activity.this , Menu_Activity.class);
        startActivity(intent);

    }
}