package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
     EditText num1,num2;
     Button addBtn,subBtn,mulBtn,divBtn,clearBtn;
     EditText show_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        addBtn = findViewById(R.id.addBtn);
        subBtn = findViewById(R.id.subBtn);
        mulBtn = findViewById(R.id.mulBtn);
        divBtn = findViewById(R.id.divBtn);

        show_result = findViewById(R.id.show_result);
        clearBtn=findViewById(R.id.clearBtn);



//onclicklistener on addition button.............

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(num1.getText().toString())){
                    num1.setError("Please Enter Value");
                }

                if(TextUtils.isEmpty(num2.getText().toString())){
                    num2.setError("Please Enter Value");
                }
                else{
                double n1 = Double.parseDouble(num1.getText().toString());
                double n2 = Double.parseDouble(num2.getText().toString());
                double result = n1 + n2;
                show_result.setText("" + String.format("%.2f", result));
            }
            }
        });
//onclicklistener on addition button.............

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(num1.getText().toString())){
                    num1.setError("Please Enter Value");
                }

                if(TextUtils.isEmpty(num2.getText().toString())){
                    num2.setError("Please Enter Value");
                }
                else {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    double result = n1 - n2;
                    show_result.setText("" + String.format("%.2f", result));
                }
            }
        });
//onclicklistener on multiplication button.............

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(num1.getText().toString())){
                    num1.setError("Please Enter Value");
                }

                if(TextUtils.isEmpty(num2.getText().toString())){
                    num2.setError("Please Enter Value");
                }
                else {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    double result = n1 * n2;

                    show_result.setText("" + String.format("%.2f", result));
                }
            }
        });
//onclicklistener on division button.............

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(num1.getText().toString())){
                    num1.setError("Please Enter Value");
                }

                if(TextUtils.isEmpty(num2.getText().toString())){
                    num2.setError("Please Enter Value");
                }
                else {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());
                    double result = n1 / n2;
                    show_result.setText("" + String.format("%.2f", result));
                }
            }
        });
//onclicklistener on clear button.............

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mangesh","All field are cleared");
                    num1.setText("");
                    num2.setText("");
                    show_result.setText("");


            }
        });
    }


}