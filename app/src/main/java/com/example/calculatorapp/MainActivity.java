package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView resultview;
     MaterialButton buttonAc,buttonPlusDivide,buttonPercent,buttonDiv,button7,button8,button9,buttonX,button4,button5,button6,buttonSub,button1,button2,button3,buttonPlus,buttonZer,buttonV,buttonEqual;

    private double result1 = 0;
    private double result2 = 0;
    double ans = 0;
    int check = 0;
    private String operation = "";
    @Override





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultview = findViewById(R.id.resultNumber);


        assignButton(button1,R.id.button1);
        assignButton(button2,R.id.button2);
        assignButton(button3,R.id.button3);
        assignButton(button4,R.id.button4);
        assignButton(button5,R.id.button5);
        assignButton(button6,R.id.button6);
        assignButton(button7,R.id.button7);
        assignButton(button8,R.id.button8);
        assignButton(button9,R.id.button9);
        assignButton(buttonAc,R.id.buttonAc);
        assignButton(buttonDiv,R.id.buttonDiv);
        assignButton(buttonEqual,R.id.buttonEqual);
        assignButton(buttonPercent,R.id.buttonPercent);
        assignButton(buttonPlus,R.id.buttonPlus);
        assignButton(buttonPlusDivide,R.id.buttonPlusDivide);
        assignButton(buttonSub,R.id.buttonSub);
        assignButton(buttonV,R.id.buttonV);
        assignButton(buttonX,R.id.buttonX);
        assignButton(buttonZer,R.id.buttonZer);
    }

    void assignButton(MaterialButton button,int id) {
        button = findViewById(id);
        button.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        String resultText = resultview.getText().toString();


        boolean flag = false;
        if(check == ans) {
            flag = true;
        }



        if(buttonText.equals("AC")) {
            resultview.setText("0");
        } else if(buttonText.equals(",")) {
            resultview.setText(resultText + ".");

        } else if(buttonText.equals("+")) {
            result1 = Double.parseDouble(resultText);
            resultview.setText("");
            operation = "+";
        } else if(buttonText.equals("-")) {
            result1 = Double.parseDouble(resultText);
            resultview.setText("");
            operation = "-";
        } else if(buttonText.equals("x")) {
            result1 = Double.parseDouble(resultText);
            resultview.setText("");
            operation = "x";
        } else if(buttonText.equals("÷")) {
            result1 = Double.parseDouble(resultText);
            resultview.setText("");
            operation = "÷";
        } else if(buttonText.equals("=")) {
            result2 = Double.parseDouble(resultText);
            if(operation.equals("+")) {
                ans = result1+result2;
            } else if(operation.equals("-")) {
                ans = result1-result2;
            } else if(operation.equals("x")) {
                ans = result1*result2;
            } else if(operation.equals("÷")) {
                ans = result1/result2;
            }
            check = (int) ans;
            if(flag) {
                resultview.setText(Integer.toString(check));
            } else {
                resultview.setText(Double.toString(ans));
            }

        } else {
            resultview.setText(resultText+buttonText);
        }



/*

        if(buttonText.equals("1")) {
            resultview.setText(resultText + "1");
        }
        if(buttonText.equals("2")) {
            resultview.setText(resultText + "2");
        }
        if(buttonText.equals("3")) {
            resultview.setText(resultText + "3");
        }
        if(buttonText.equals("4")) {
            resultview.setText(resultText + "4");
        }
        if(buttonText.equals("5")) {
            resultview.setText(resultText + "5");
        }
        if(buttonText.equals("6")) {
            resultview.setText(resultText + "6");
        }
        if(buttonText.equals("7")) {
            resultview.setText(resultText + "7");
        }
        if(buttonText.equals("8")) {
            resultview.setText(resultText + "8");
        }
        if(buttonText.equals("9")) {
            resultview.setText(resultText + "9");
        }
        if(buttonText.equals("0")) {
            resultview.setText(resultText + "0");
        }
      */
    }
}