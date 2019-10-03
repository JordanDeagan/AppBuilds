package com.example.gamepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DBHelper(this);
    }

    private void goToSelection(String username, int state){
        Intent intent = new Intent(getBaseContext(),GameSelect.class);
        intent.putExtra("STATE", state);
        intent.putExtra("USERNAME", username);
        intent.putExtra("INITIAL",true);
        startActivity(intent);
    }
}
