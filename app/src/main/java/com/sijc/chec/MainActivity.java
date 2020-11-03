package com.sijc.chec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox ch1,ch2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        ch1 = (CheckBox)findViewById(R.id.chk_suma);
        ch2 = (CheckBox)findViewById(R.id.chk_resta);
        tv1 = (TextView)findViewById(R.id.txt_vista);

    }
    //mretodo calcular
    public void Calcular (View view){
        String valor1 = et1.getText().toString();
        String valor2 =et2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        String resultado = "";
        if (ch1.isChecked() == true){
            int suma = num1 + num2;
            //resultado = String.valueOf(suma);
            resultado = "La suma es: " + suma + " / ";
        }

        if (ch2.isChecked() == true){
            int resta = num1 - num2;
            //resultado = String.valueOf(resta);
            resultado = resultado + " La resta es: " + resta;
        }
        tv1.setText(resultado);
    }
}