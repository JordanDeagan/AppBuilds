package com.example.picturepoints;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.security.acl.LastOwnerException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<RadioButton> points = new ArrayList<>();
    ConstraintLayout layout;
    ImageView imageChoice;
    float x, y;
    View.OnTouchListener pointPicker = new View.OnTouchListener() {
        @SuppressLint("ClickableViewAccessibility")
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()){
                case MotionEvent.ACTION_DOWN:
                    savePoint(motionEvent.getX(),motionEvent.getY());
                    String temp = "Touched Down: " + String.valueOf(motionEvent.getX()) + " " + String.valueOf(motionEvent.getY());
                    makeToast(temp);
                    break;
                case MotionEvent.ACTION_UP:
                    compare(motionEvent.getX(),motionEvent.getY());
                    String temp2 = "Lifted up: " + String.valueOf(motionEvent.getX()) + " " + String.valueOf(motionEvent.getY());
                    makeToast(temp2);
            }

            return true;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.linearLayout);
        imageChoice = findViewById(R.id.imageView);
        imageChoice.setOnTouchListener(pointPicker);
    }

    private RadioButton makeRadioButton(float x, float y){
        RadioButton temp = new RadioButton(this);
        temp.setX(x-32);
        temp.setY(y-32);
        layout.addView(temp);
        return temp;
    }

    private void makeToast(String text){
        Toast toast = Toast.makeText(this, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    private void savePoint(float newX, float newY){
        x = newX;
        y = newY;
    }

    private void compare(float newX, float newY){
        if(newX == x && newY == y){
            points.add(makeRadioButton(x, y));
        }
        else {
            x = -1;
            y = -1;
        }
    }
}
