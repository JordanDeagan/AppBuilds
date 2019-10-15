package com.example.gamepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class GameSelect extends AppCompatActivity {
    public static DBHelper db;
    public ArrayList<String> games, previous;
    private int selectionState;
    private String username;
    LinearLayout chess;
    Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_select);
        db = MainActivity.db;
        if (getIntent().getExtras().getBoolean("INITIAL")){
            games = new ArrayList<>();
        }
        else {
            games = getIntent().getStringArrayListExtra("GAMES");
        }
        username = getIntent().getStringExtra("USERNAME");
        selectionState = getIntent().getExtras().getInt("STATE");
        if(selectionState==2){
            previous=getIntent().getStringArrayListExtra("LAST");
        }
        chess = findViewById(R.id.Chess);
        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame(Chess.class);
            }
        });
        sub = findViewById(R.id.submit);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submit();
            }
        });
    }

    private void startGame(Class choice){
        if(selectionState==0 || selectionState == 1) {
            Intent intent = new Intent(getBaseContext(), choice);
            intent.putExtra("GAMES", games);
            intent.putExtra("USERNAME", username);
            intent.putExtra("STATE", selectionState);
            startActivity(intent);
        }
        else if (selectionState == 2){
            Intent intent = new Intent(getBaseContext(), choice);
            intent.putExtra("GAMES", games);
            intent.putExtra("USERNAME", username);
            intent.putExtra("STATE", selectionState);
            intent.putExtra("LAST",previous);
            startActivity(intent);
        }
    }

    private void submit(){
        if(selectionState==0){
            if(db.logsIn(username,games)){
                Intent intent = new Intent(getBaseContext(), LoggedIn.class);
                intent.putExtra("USERNAME",username);
                startActivity(intent);
            }
        } else if(selectionState==1){
            confirmPassword();
            Log.d("GameSelect","Confirm Password");
        }
        else if(selectionState ==2){
            if(previous.equals(games)){
                db.addUser(username,games);
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        }
    }

    private void confirmPassword(){
        previous = games;
        games = new ArrayList<>();
        selectionState = 2;
    }
}
