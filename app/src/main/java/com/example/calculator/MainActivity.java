package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

/*
    private Button btn9,btn8,btn7,btn6,btn5,btn4,btn3,btn2,btn1,btn0,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnClr;
    private TextView text,result;
    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char DIVISION='/';
    private final char MULTIPLICATION='*';
    private final char EQU='=';
    private double val1=Double.NaN;
    private double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setUpUiViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "9");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1) + "+");
                text.setText(null);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=SUBTRACTION;
                result.setText(String.valueOf(val1) + "-");
                text.setText(null);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                text.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISION;
                result.setText(String.valueOf(val1) + "/");
                text.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));  //result.gettext.tostring contains the number and the operator
                text.setText(null);

            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.getText().length()>0){
                    CharSequence name= text.getText().toString();  //sequence
                    text.setText(name.subSequence(0,name.length()-1));

                }
                else {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    text.setText(null);
                    result.setText(null);
                }
            }
        });










    }
    public void setUpUiViews(){
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnAdd=findViewById(R.id.btnadd);
        btnSub=findViewById(R.id.btnsub);
        btnMul=findViewById(R.id.btnmul);
        btnDiv=findViewById(R.id.btndiv);
        btnEqual=findViewById(R.id.btnequal);
        btnClr=findViewById(R.id.btnclear);
        text=findViewById(R.id.text);
        result=findViewById(R.id.Result);
    }

    public void compute(){
        if(!Double.isNaN(val1)){          //if val1 is a number condition true

            val2=Double.parseDouble(text.getText().toString());

            switch (ACTION){

                case ADDITION:
                    val1=val1+val2;
                    break;
                case SUBTRACTION:
                    val1=val1-val2;
                    break;
                case MULTIPLICATION:
                    val1=val1*val2;
                    break;
                case DIVISION:
                    val1=val1/val2;
                    break;
                case EQU:
                    break;
            }



        }else {

            val1=Double.parseDouble(text.getText().toString());

        }
    }
}

*/


/////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////CALCULATOR PROGRAM 2/////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////


    private Button btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0, btnAdd, btnSub, btnMul, btnDiv, btnEqual, btnClr;
    private TextView text, result;
    float val1,val2;
    boolean Add,Sub,Mul,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpUiViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(text.getText().toString() + "9");
            }
        });




        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){               //(or text.getText()=="")  //to check if the first number entered is +
                    text.setText("");
                }
                else{                         //if the first number is a number

                    val1=Float.parseFloat(text.getText().toString());    //store the number in val1 when + is clicked
                    Add=true;     //set the value of variable add as true
                    text.setText(null);      //clear the textBox
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){               //(or text.getText()=="")  //to check if the first number entered is -
                    text.setText("");
                }
                else{                         //if the first number is a number

                    val1=Float.parseFloat(text.getText().toString());    //store the number in val1 when - is clicked
                    Sub=true;     //set the value of variable add as true
                    text.setText(null);      //clear the textBox
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){               //(or text.getText()=="")  //to check if the first number entered is *
                    text.setText("");
                }
                else{                         //if the first number is a number

                    val1=Float.parseFloat(text.getText().toString());    //store the number in val1 when * is clicked
                    Mul=true;     //set the value of variable add as true
                    text.setText(null);      //clear the textBox
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text==null){               //(or text.getText()=="")  //to check if the first number entered is /
                    text.setText("");
                }
                else{                         //if the first number is a number

                    val1=Float.parseFloat(text.getText().toString());    //store the number in val1 when / is clicked
                    Div=true;     //set the value of variable add as true
                    text.setText(null);      //clear the textBox
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2=Float.parseFloat(text.getText().toString());
                if (Add){                  //if Add is set
                    text.setText(val1+val2+"");
                }
                if (Sub){                  //if Sub is set
                    text.setText(val1-val2+"");
                }
                if (Mul){                  //if Mul is set
                    text.setText(val1*val2+"");
                }if (Div){                  //if Div is set
                    text.setText(val1/val2+"");
                }

            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                text.setText(null);
            }
        });




    }


    public void setUpUiViews() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnadd);
        btnSub = findViewById(R.id.btnsub);
        btnMul = findViewById(R.id.btnmul);
        btnDiv = findViewById(R.id.btndiv);
        btnEqual = findViewById(R.id.btnequal);
        btnClr = findViewById(R.id.btnclear);
        text = findViewById(R.id.text);
        result = findViewById(R.id.Result);
    }

}



////////////////////SIMPLE CALCULATOR SECOND PROGRAM CLOSED/////////////////////////////////////








