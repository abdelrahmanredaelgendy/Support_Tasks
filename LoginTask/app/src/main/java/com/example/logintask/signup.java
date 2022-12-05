package com.example.logintask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button login_sigBTN, signup_sigBTN;
        EditText namesignupEDT, emailsignupEDT, passwordsignupEdT;
        namesignupEDT = (EditText) findViewById(R.id.namesignupEDT);
        emailsignupEDT = findViewById(R.id.emailsignupEDT);
        passwordsignupEdT = findViewById(R.id.passwordsignupEDT);
        signup_sigBTN = findViewById(R.id.signup_sigBTN);
        signup_sigBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String valu=namesignupEDT.getText().toString();
                if (!(namesignupEDT.getText().toString().equals("") || emailsignupEDT.getText().toString().equals("") || passwordsignupEdT.getText().toString().equals(""))) {
                    Intent intent = new Intent(signup.this, homePage.class);
                    String s = namesignupEDT.getText().toString();
                    s = "Welcome," + s;
                    intent.putExtra("name_user", s);
                    startActivity(intent);
                } else {
                    Toast.makeText(signup.this, "Complete Data", Toast.LENGTH_SHORT).show();
                }
            }
        });


        login_sigBTN = findViewById(R.id.login_sigBTN);
        login_sigBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toLogin();
            }
        });
    }

    public void toLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toHome() {


    }

}