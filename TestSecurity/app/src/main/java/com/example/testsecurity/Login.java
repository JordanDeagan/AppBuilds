package com.example.testsecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Login extends AppCompatActivity {


    private Button login;
    private TextView username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = (Button) findViewById(R.id.login);
        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    loggingIn();
                } catch (InvalidKeySpecException e) {
                    e.printStackTrace();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private void loggingIn() throws InvalidKeySpecException, NoSuchAlgorithmException {
        String user = username.getText().toString();
        String pass = password.getText().toString();
        if(user.length()>0 && pass.length()>0) {
            if(MainActivity.db.usernameExists(user)){
                if(MainActivity.db.logsIn(user,pass)){
                    Intent intent = new Intent(this, LoggedIn.class);
                    startActivity(intent);
                }
                else {
                    Toast toast = Toast.makeText(this, "Check your password is correct\nand try again", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            else {
                Toast toast = Toast.makeText(this,"Make sure you enter\na proper username",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else {
            Toast toast = Toast.makeText(this,"Please enter your\nusername and password",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
