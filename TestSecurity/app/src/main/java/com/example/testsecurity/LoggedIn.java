package com.example.testsecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoggedIn extends AppCompatActivity {

    Button logOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        logOut = (Button) findViewById(R.id.LogOut);

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loggingOut();
            }
        });
    }

    private void loggingOut(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
