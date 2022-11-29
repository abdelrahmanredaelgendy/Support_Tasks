package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText firstNumEDT,secondeNumEDT;
        TextView resTV;
        Button calcoulatorBTN;
        firstNumEDT=findViewById(R.id.firstNumberEDT);
        secondeNumEDT=findViewById(R.id.secondeNumberEDT);
        resTV=findViewById(R.id.resualtTV);
        calcoulatorBTN=findViewById(R.id.calculateBTN);
        calcoulatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(firstNumEDT.getText().toString().equals("")&&secondeNumEDT.getText().toString().equals("")))
                {
                    String firstNum =firstNumEDT.getText().toString();
                    int valuFirst = Integer.parseInt(firstNum);
                    String secondeNum =secondeNumEDT.getText().toString();
                    int valuSeconde =Integer.parseInt(secondeNum);
                    int result =sum(valuFirst,valuSeconde);
                    String res =String.valueOf(result);
                    resTV.setText(res);
                }

            }
        });



    }
    private int sum (int num1 ,int num2){
        return num1+num2;
    }
}