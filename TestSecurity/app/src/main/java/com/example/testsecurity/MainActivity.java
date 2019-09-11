package com.example.testsecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button login, signUp;
    static public DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DBHelper(this);
        login = (Button) findViewById(R.id.loginPage);
        signUp = (Button) findViewById(R.id.signupPage);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loggingIn();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signingUp();
            }
        });
    }

    private void signingUp(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

    private void loggingIn(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
