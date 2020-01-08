package com.example.gamepassword;

import android.os.Bundle;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class OtherChoice extends AppCompatActivity {

    private String roomName, weaponName, suspectName;
    private int roomImage, weaponImage, suspectImage;
    Button back, submit;
    ImageView axe, candle, gun, knife, pipe, poison, rope, wrench,
            grey, green, mustard, plum, peacock, rose, scarlet, white, previousSus, previousWep;
    boolean suspectSelected, weaponSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_choice_layout);
        back = findViewById(R.id.ChoiceBack);
        submit = findViewById(R.id.ChoiceSubmit);
        axe = findViewById(R.id.Axe);
        candle = findViewById(R.id.Candle);
        gun = findViewById(R.id.Gun);
        knife = findViewById(R.id.Knife);
        pipe = findViewById(R.id.Pipe);
        poison = findViewById(R.id.Poison);
        rope = findViewById(R.id.Rope);
        wrench = findViewById(R.id.Wrench);
        grey = findViewById(R.id.Grey);
        green = findViewById(R.id.Green);
        mustard = findViewById(R.id.Mustard);
        plum = findViewById(R.id.Plum);
        peacock = findViewById(R.id.Peacock);
        rose = findViewById(R.id.Rose);
        scarlet = findViewById(R.id.Scarlet);
        white = findViewById(R.id.White);
        axe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.axe_foreground, "Axe");
                previousWep = axe;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        candle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.candle_foreground, "Candle");
                previousWep = candle;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        gun.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.gun_foreground, "Gun");
                previousWep = gun;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        knife.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.knife_foreground, "Knife");
                previousWep = knife;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        pipe.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.pipe_foreground, "Pipe");
                previousWep = pipe;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        poison.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.poison_foreground, "Poison");
                previousWep = poison;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        rope.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.rope_foreground, "Rope");
                previousWep = rope;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        wrench.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectWeapon(R.mipmap.wrench_foreground, "Wrench");
                previousWep = wrench;
                previousWep.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        grey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.gray_foreground, "Sergeant Gray");
                previousSus = grey;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        green.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.green_foreground, "Mr Green");
                previousSus = green;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        mustard.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.mustard_foreground, "Colonel Mustard");
                previousSus = mustard;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        plum.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.plum_foreground, "Professor Plum");
                previousSus = plum;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        peacock.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.peacock_foreground, "Mrs Peacock");
                previousSus = peacock;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        rose.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.rose_foreground, "Madame Rose");
                previousSus = rose;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        scarlet.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.scarlet_foreground, "Miss Scarlet");
                previousSus = scarlet;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        white.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                selectSuspect(R.mipmap.white_foreground, "Mrs White");
                previousSus = white;
                previousSus.setBackgroundResource(R.drawable.black_background);
                return false;
            }
        });
        weaponSelected = false;
        suspectSelected = false;
    }

    private void selectWeapon(int val, String name){
        weaponImage = val;
        weaponName = name;
        if(!weaponSelected){
            weaponSelected = true;
        } else {
            previousWep.setBackground(null);
        }
    }

    private void selectSuspect(int val, String name){
        suspectImage = val;
        suspectName = name;
        if(!suspectSelected){
            suspectSelected = true;
        } else {
            previousSus.setBackground(null);
        }
    }

    void createRumor(){

    }
}
