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

public class SignUp extends AppCompatActivity {

    Button signUp;
    TextView username, pass1, pass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUp = (Button) findViewById(R.id.finishSignup);
        username = (TextView) findViewById(R.id.SignUpUsername);
        pass1 = (TextView) findViewById(R.id.firstPassword);
        pass2 = (TextView) findViewById(R.id.secondPassword);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    signingUp();
                } catch (InvalidKeySpecException e) {
                    e.printStackTrace();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void signingUp() throws InvalidKeySpecException, NoSuchAlgorithmException {
        String user = username.getText().toString();
        String password = pass1.getText().toString();
        String confirm = pass2.getText().toString();
        if(user.length()>0 && password.length()>0 && confirm.length()>0) {
            if(!MainActivity.db.usernameExists(user)) {
                if(password.equals(confirm)) {
                    MainActivity.db.addUser(user,password);
                    Intent intent = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast toast = Toast.makeText(this, "Check your passwords match\nand try again", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            else {
                Toast toast = Toast.makeText(this,"That username already exists\nplease make a new one",Toast.LENGTH_SHORT);
                toast.show();
            }
        }
        else {
            Toast toast = Toast.makeText(this,"Please enter your\nusername and password",Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
