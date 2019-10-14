package com.example.gamepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chess extends GameBase {
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);
        gameBoard = new ChessObject();
        setValues();
        submit = findViewById(R.id.ChessSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnObjectHash();
            }
        });
    }

    @Override
    protected void reset() {

    }

}
