package com.example.gamepassword;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class Clue extends GameBase {
    ListView mListView;
    ClueObject gameBoard;
    RumorArray rumorAdapt;
    Button startRumor, submit, undo, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clue);
        setValues();
        gameBoard = new ClueObject();
        mListView =(ListView) findViewById(R.id.RumorList);
        startRumor = findViewById(R.id.RumorButton);
        submit = findViewById(R.id.clueSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                returnObjectHash();
            }
        });
        undo = findViewById(R.id.clueUndo);
        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gameBoard.undo();
            }
        });
        reset = findViewById(R.id.clueReset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        setAdapter();
    }

    private void setAdapter(){
        rumorAdapt = new RumorArray(this, R.layout.rumor, gameBoard.rumors);
        mListView.setAdapter(rumorAdapt);
    }
}