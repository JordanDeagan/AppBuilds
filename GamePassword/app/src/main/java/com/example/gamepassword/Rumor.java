package com.example.gamepassword;

import android.graphics.drawable.Drawable;
import android.media.Image;

import androidx.annotation.NonNull;

import java.util.WeakHashMap;

public class Rumor {
    String Room, Sus, Weap;
    Drawable RoomImage, Suspect, Weapon;
    public Rumor(String R, String S, String W, Drawable r, Drawable s, Drawable w){
        Room = R;
        Sus = S;
        Weap = R;
        RoomImage = r;
        Suspect = s;
        Weapon = w;
    }

    @NonNull
    @Override
    public String toString() {
        String r = Room + Sus + Weap;
        return r;
    }

    public Drawable getRoom(){
        return RoomImage;
    }

    public Drawable getSuspect(){
        return Suspect;
    }

    public Drawable getWeapon(){
        return Weapon;
    }
}
