package com.example.gamepassword;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class ClueObject implements GameObject {

    List<Rumor> rumors;
    boolean empty;

    ClueObject(){
        rumors = new ArrayList<>();
        empty = true;
    }
    public void placePiece(String R, String S, String W, Drawable r, Drawable s, Drawable w){
        rumors.add(new Rumor(R,S,W,r,s,w));
        if(empty){
            empty = false;
        }
    }

    @Override
    public String returnHash() {
        byte[] hashedBoard = MainActivity.db.hashed(rumors.toString(), "Clue".getBytes());
        return new String(hashedBoard);
    }

    @Override
    public boolean isEmpty(){
        return empty;
    }
}
