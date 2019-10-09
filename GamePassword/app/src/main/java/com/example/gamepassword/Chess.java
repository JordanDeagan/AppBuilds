package com.example.gamepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Chess extends GameBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
        gameBoard = new ChessObject();
    }

    @Override
    protected void reset() {

    }
}
