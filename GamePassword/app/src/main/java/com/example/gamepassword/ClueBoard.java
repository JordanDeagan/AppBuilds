package com.example.gamepassword;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ClueBoard extends AppCompatActivity {

    ImageView study, billiard, ball, hall, lounge, library, conserv, kitchen, dining, shown;
    int roomImage;
    String roomName;
    Button back, submit;
    boolean roomSelected;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clue_board_layout);
        study = findViewById(R.id.Study);
        billiard = findViewById(R.id.Billiard);
        ball = findViewById(R.id.Ball);
        hall = findViewById(R.id.Hall);
        lounge = findViewById(R.id.Lounge);
        library = findViewById(R.id.Library);
        conserv = findViewById(R.id.Conservatory);
        kitchen = findViewById(R.id.Kitchen);
        dining = findViewById(R.id.Dining);
        shown = findViewById(R.id.RoomChoice);
        back = findViewById(R.id.BoardBack);
        submit = findViewById(R.id.BoardSubmit);
        study.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.study_foreground, "Study");
                return false;
            }
        });
        billiard.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.billiard_foreground, "Billiard Room");
                return false;
            }
        });
        ball.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.ball_foreground, "Ball Room");
                return false;
            }
        });
        hall.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.hall_foreground, "Hall");
                return false;
            }
        });
        lounge.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.lounge_foreground, "Lounge");
                return false;
            }
        });
        library.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.library_foreground, "Library");
                return false;
            }
        });
        conserv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.conservatory_foreground, "Conservatory");
                return false;
            }
        });
        kitchen.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.kitchen_foreground, "Kitchen");
                return false;
            }
        });
        dining.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectRoom(R.mipmap.dining_foreground,"Dining Room");
                return false;
            }
        });
        roomSelected = false;
    }

    private void selectRoom(int val, String name){
        shown.setImageResource(val);
        roomImage = val;
        roomName = name;
        if(!roomSelected){
            roomSelected = true;
        }
    }
}
