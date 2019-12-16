package com.example.gamepassword;

import android.os.Bundle;
import android.widget.ImageView;

public class Clue extends GameBase {
    ImageView board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clue);
        board = findViewById(R.id.ClueBoard);

    }
}
