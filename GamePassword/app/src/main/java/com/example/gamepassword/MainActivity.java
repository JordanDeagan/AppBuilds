package com.example.gamepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    public static DBHelper db;
    public LinkedList<ArrayList<String>[]> games;
    Button test, fill,add;
    ChessPassword chess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chess = new ChessPassword();
        db = new DBHelper(this);
        games = new LinkedList<>();
        games.add(chess.passBoard());
        test = findViewById(R.id.tester);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testResult();
            }
        });
        fill = findViewById(R.id.fill);
        fill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fillChess();
            }
        });
        add = findViewById(R.id.adder);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUser();
            }
        });
    }

    private void fillChess(){
        chess.fillBoard();
        Toast toast = Toast.makeText(this, "Chess board filled", Toast.LENGTH_SHORT);
        toast.show();
    }

    private void addUser(){
        db.addUser("Elf",games);
        Toast toast = Toast.makeText(this, "User Added", Toast.LENGTH_SHORT);
        toast.show();
    }

    private void testResult(){
        boolean result = db.logsIn("Elf",games);
        Toast loggedIn = Toast.makeText(this,String.valueOf(result),Toast.LENGTH_SHORT);
        loggedIn.show();
    }
}
