package com.example.netflixsecurityscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView game1, game2, game3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game1 = findViewById(R.id.Game1);
        game2 = findViewById(R.id.Game2);
        game3 = findViewById(R.id.Game3);
    }
}
