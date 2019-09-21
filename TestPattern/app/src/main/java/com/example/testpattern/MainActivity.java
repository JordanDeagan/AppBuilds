package com.example.testpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {
    RadioButton[][] radioGrid;
    Button reset, submit;
    TextView test;
    String location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGrid = new RadioButton[3][3];
        radioGrid[0][0] = findViewById(R.id.radioOne);
        radioGrid[0][1] = findViewById(R.id.radioTwo);
        radioGrid[0][2] = findViewById(R.id.radioThree);
        radioGrid[1][0] = findViewById(R.id.radioFour);
        radioGrid[1][1] = findViewById(R.id.radioFive);
        radioGrid[1][2] = findViewById(R.id.radioSix);
        radioGrid[2][0] = findViewById(R.id.radioSeven);
        radioGrid[2][1] = findViewById(R.id.radioEight);
        radioGrid[2][2] = findViewById(R.id.radioNine);

        test = findViewById(R.id.textView2);
        reset = findViewById(R.id.Reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitPattern();
            }
        });
        location = "";

    }
    private void reset(){
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                radioGrid[i][j].setChecked(false);
            }
        }
        location = "";
    }

    private void checkGrid(int x, int y){
        for(int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                if(x >= radioGrid[i][j].getX()-16 && x<= radioGrid[i][j].getX()+112 && y >= radioGrid[i][j].getY()-16 && y<= radioGrid[i][j].getY()+112){
                    if(!radioGrid[i][j].isChecked()) {
                        radioGrid[i][j].setChecked(true);
                        location += i;
                        location += j;
                    }
                }
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        checkGrid(x,y);
        test.setX(x);
        test.setY(y);
        return super.onTouchEvent(event);
    }

    private void submitPattern(){
        Toast toast = Toast.makeText(this,location,Toast.LENGTH_SHORT);
        toast.show();
    }
}
