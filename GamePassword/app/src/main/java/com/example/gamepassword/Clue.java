package com.example.gamepassword;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class Clue extends GameBase {
    ImageView board;
    ListView mListView;
    ClueObject clueObject;
    RumorArray rumorAdapt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clue);
        board = findViewById(R.id.ClueBoard);
        clueObject = new ClueObject();
        mListView =(ListView) findViewById(R.id.RumorList);

        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        setAdapter();
    }

    private void setAdapter(){
        rumorAdapt = new RumorArray(this, R.layout.rumor, clueObject.rumors);

        mListView.setAdapter(rumorAdapt);
    }
}
