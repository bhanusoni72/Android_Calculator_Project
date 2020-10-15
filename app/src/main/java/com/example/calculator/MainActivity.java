package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static String a="0";
    static String operand="0";
    static Calculation ob=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView second_text=(TextView) findViewById(R.id.second_input);
        final EditText first_text=(EditText) findViewById(R.id.first_input);

        ob=new Calculation();

        Button d0=(Button) findViewById(R.id.D0);
        Button d1=(Button) findViewById(R.id.D1);
        Button d2=(Button) findViewById(R.id.D2);
        Button d3=(Button) findViewById(R.id.D3);
        Button d4=(Button) findViewById(R.id.D4);
        Button d5=(Button) findViewById(R.id.D5);
        Button d6=(Button) findViewById(R.id.D6);
        Button d7=(Button) findViewById(R.id.D7);
        Button d8=(Button) findViewById(R.id.D8);
        Button d9=(Button) findViewById(R.id.D9);

        d0.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(0,second_text,first_text);
            }
        });
        d1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(1,second_text,first_text);
            }
        });
        d2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(2,second_text,first_text);
            }
        });
        d3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(3,second_text,first_text);
            }
        });
        d4.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(4,second_text,first_text);
            }
        });
        d5.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(5,second_text,first_text);
            }
        });
        d6.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(6,second_text,first_text);
            }
        });
        d7.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(7,second_text,first_text);
            }
        });
        d8.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(8,second_text,first_text);
            }
        });
        d9.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.input(9,second_text,first_text);
            }
        });

        Button s_negative=(Button) findViewById(R.id.S_negative);
        Button s_dot=(Button) findViewById(R.id.S_dot);
        Button s_equal=(Button) findViewById(R.id.S_equal);
        Button s_add=(Button) findViewById(R.id.S_add);
        Button s_subtract=(Button) findViewById(R.id.S_substract);
        Button s_multi=(Button) findViewById(R.id.S_multi);
        Button s_divide=(Button) findViewById(R.id.S_divide);
        Button s_square=(Button) findViewById(R.id.S_square);
        Button s_root=(Button) findViewById(R.id.S_root);
        Button s_mod=(Button) findViewById(R.id.S_mod);
        Button s_clear=(Button) findViewById(R.id.S_clear);
        Button s_back=(Button) findViewById(R.id.S_back);

        s_negative.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(String.valueOf(first_text.getText()));
                String out=String.valueOf(a*-1d);
                first_text.setText(out);
            }
        });

        s_clear.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String first="0";
                String second="0.0";
                a="0";
                operand="0";
                first_text.setText(first);
                second_text.setText(second);
            }
        });

        s_dot.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.dotInput(second_text,first_text);
            }
        });
        s_square.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.operandInput('s',second_text,first_text);
            }
        });
        s_root.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.operandInput('r',second_text,first_text);
            }
        });
        s_add.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.operandInput('+',second_text,first_text);
            }
        });
        s_subtract.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.operandInput('-',second_text,first_text);
            }
        });
        s_multi.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.operandInput('*',second_text,first_text);
            }
        });
        s_divide.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.operandInput('/',second_text,first_text);
            }
        });
        s_mod.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.operandInput('%',second_text,first_text);
            }
        });
        s_equal.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.equals(second_text,first_text);
            }
        });
        s_back.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                ob.back(second_text,first_text);
            }
        });
    }
}