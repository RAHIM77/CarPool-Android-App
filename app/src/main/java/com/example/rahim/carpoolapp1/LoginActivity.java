package com.example.rahim.carpoolapp1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    protected TextView mSignUpTextView;
    protected Button loginbtn;
    protected TextView mresetTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mSignUpTextView=(TextView)findViewById(R.id.signup);
        loginbtn=(Button) findViewById(R.id.loginbtn);
        mresetTextview=(TextView)findViewById(R.id.resetpass);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent2);

            }
        });
        mSignUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,Registoractivity.class);
                startActivity(intent);
            }
        });
        mresetTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6=new Intent(LoginActivity.this,ResetPassword.class);
                startActivity(intent6);
            }
        });

    }
}
