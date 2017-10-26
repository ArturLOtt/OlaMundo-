package com.example.web.olamundo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Web on 19/10/2017.
 */

public class CalculaMedia extends AppCompatActivity {



    private EditText txtVisor;
    private Button buttonC, buttonMaisMenos, buttonPorc, button9, button8, button7, button6, button5, button4, button3, button2, button1, buttonZero, buttonIgual, buttonVirgula,
                   buttonMais, buttonMenos, buttonSubtra, buttonX, buttonBarra;
    double txtresultado = ;
    double formA = ;
    double formB = ;
    double formC = ;
    private String cadeia = "0";
    private double Num1=0, Num2=0, resultado=0;
    private char Operacao_atual = 'n', Operacao_anterior = 'n';
    private int Achou=0, zerar=1;



        @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.CalculaMedia);


        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();

            }

            private void salvar() {





                r = (EditText) findViewById(R.id.visor);
                btn0 = (Button) findViewById(R.id.btn0);
                btn1 = (Button) findViewById(R.id.btn1);
                btn2 = (Button) findViewById(R.id.btn2);
                btn3 = (Button) findViewById(R.id.btn3);
                btn4 = (Button) findViewById(R.id.btn4);
                btn5 = (Button) findViewById(R.id.btn5);
                btn6 = (Button) findViewById(R.id.btn6);
                btn7 = (Button) findViewById(R.id.btn7);
                btn8 = (Button) findViewById(R.id.btn8);
                btn9 = (Button) findViewById(R.id.btn9);
                btnSoma = (Button) findViewById(R.id.btnSoma);
                btnDiminui = (Button) findViewById(R.id.btnDiminui);
                btnDivide = (Button) findViewById(R.id.btnDivide);
                btnMultiplica = (Button) findViewById(R.id.btnMultiplica);
                btnZera = (Button) findViewById(R.id.btnZera);
                btnIgual = (Button) findViewById(R.id.btnIgual);











//        pega os campos do layout
                txtVisor = (TextView) findViewById(R.id.txtNwVisor);


//        pega o botao
                button9 = (Button) findViewById(R.id.button9);
                button8 = (Button) findViewById(R.id.button8);
                button7 = (Button) findViewById(R.id.button7);
                button6 = (Button) findViewById(R.id.button6);
                button5 = (Button) findViewById(R.id.button5);
                button4 = (Button) findViewById(R.id.button4);
                button3 = (Button) findViewById(R.id.button3);
                button2 = (Button) findViewById(R.id.button2);
                button1 = (Button) findViewById(R.id.button1);
                buttonZero = (Button) findViewById(R.id.buttonZero);
                buttonIgual = (Button) findViewById(R.id.buttonIgual);
                buttonMais = (Button) findViewById(R.id.buttonMais);
                buttonBarra = (Button) findViewById(R.id.buttonBarra);
                buttonMenos = (Button) findViewById(R.id.buttonSubtra);


            }

            @Override
                    public void onClick(View view) {



                double abut9 = Double.parseDouble(button9);
        double abut8 = Double.parseDouble(button8);
        double abut7 = Double.parseDouble(button7);
        double abut6 = Double.parseDouble(button6);
        double abut5 = Double.parseDouble(button5);
        double abut4 = Double.parseDouble(button4);
        double abut3 = Double.parseDouble(button3);
        double abut2 = Double.parseDouble(button2);
        double abut1 = Double.parseDouble(button1);
        double abut0 = Double.parseDouble(buttonZero);
        double abutMais = Double.parseDouble(buttonMais);
        double abutMenos = Double.parseDouble(buttonSubtra);
        double abutX = Double.parseDouble(buttonX);
        double abutBarra = Double.parseDouble(buttonBarra);
        double abutIgual = Double.parseDouble(buttonIgual);

        formA =


        double resultado = (formA) + (formB) + (formC);








       String txtResultado = resultado;

        Toast.makeText(getBaseContext(), txtResultado, Toast.LENGTH_LONG).show();






                Toast.makeText(getBaseContext(), resultado, Toast.LENGTH_LONG).show();


            }
        });

    }

}

}






//    fazer botao clicar nos campos segundo a formula (A) + (B) + (C), sendo B a conta
//    fazer botao clicar e gerar C, (*0 - 1) e = (executar fórmula)
//    cada botao gera uma String, transformar em double antes de fazer a conta
//








