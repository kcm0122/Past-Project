package com.example.gpproject;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
public class Login extends AppCompatActivity {
private String login_user ="demo123";
private String login_pw="demo123" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        username.setText(R.string.gay);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(login_user) && password.getText().toString().equals(login_pw)) {
                    gloVAR.Username=login_user;
                    gloVAR.UserPw=login_pw;
                    startActivity(new Intent(Login.this,MainActivity.class));
                    Toast.makeText(Login.this, "Welcome", Toast.LENGTH_SHORT).show();
                    finish();
                }else
                    Toast.makeText(Login.this, "Incorrect input", Toast.LENGTH_SHORT).show(); }
        });
    }
}