package com.example.gamepassword;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class Clue extends GameBase {
    ListView mListView;
    ClueObject clueObject;
    RumorArray rumorAdapt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clue);
        clueObject = new ClueObject();
        mListView =(ListView) findViewById(R.id.RumorList);
        setAdapter();
    }

    private void setAdapter(){
        rumorAdapt = new RumorArray(this, R.layout.rumor, clueObject.rumors);
        clueObject.makeRumor("Hall","Gray","Knife",R.mipmap.hall_foreground,R.mipmap.gray_foreground,R.mipmap.knife_foreground);
        clueObject.makeRumor("Kitchen","Rose","Pipe",R.mipmap.kitchen_foreground,R.mipmap.rose_foreground,R.mipmap.pipe_foreground);
        mListView.setAdapter(rumorAdapt);
    }
}
