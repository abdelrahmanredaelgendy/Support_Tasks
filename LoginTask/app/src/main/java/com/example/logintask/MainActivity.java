package com.example.logintask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signupBTN, loginBTN;
    EditText emailloginEDT, passwordloginEDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signupBTN = findViewById(R.id.signupBTN);
        loginBTN = findViewById(R.id.loginBTN);
        emailloginEDT = findViewById(R.id.emailloginEDT);
        passwordloginEDT = findViewById(R.id.passwordloginEDT);
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, homePage.class);

                if (!(emailloginEDT.getText().toString().equals("") || passwordloginEDT.getText().toString().equals(""))) {
                    String s = emailloginEDT.getText().toString();
                    s = "Welcome Back " + s;
                    intent.putExtra("name_user", s);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Complete Data", Toast.LENGTH_SHORT).show();
                }

            }
        });
        signupBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSignUp();
            }
        });
    }

    public void toSignUp() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}