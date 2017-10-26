package com.example.web.olamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText idNome, idEmail, idAddress, idPhone;
    private Button btnSalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);


//        pega os campos do layout
        idNome = (EditText) findViewById(R.id.idNome);
        idEmail = (EditText) findViewById(R.id.idEmail);
        idAddress = (EditText) findViewById(R.id.idAddress);
        idPhone = (EditText) findViewById(R.id.idPhone);

//        pega o botao
        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvar();
            }
        });

    }



    private void salvar() {

        String sNome = idNome.getEditableText().toString();
        String sEmail = idEmail.getEditableText().toString();
        String sAddress = idAddress.getEditableText().toString();
        String sPhone = idPhone.getEditableText().toString();

        String txt   = "Nome: " + sNome + "\n";
               txt += "E-mail: " + sEmail + "\n";
               txt += "Endereço: " + sAddress + "\n";
               txt += "Telefone: " + sPhone + "\n";


        Toast.makeText(getBaseContext(), txt, Toast.LENGTH_LONG).show();
//
//    private void salvar() {
//
//
//
//        private EditText iddNota1, iddNota2, iddNota3, iddNota4;
//        private Button iddBotao;
//
//        iddNota1 = (EditText) findViewById(R.id.iddNota1);
//        iddNota2 = (EditText) findViewById(R.id.iddNota2);
//        iddNota3 = (EditText) findViewById(R.id.iddNota3);
//        iddNota4 = (EditText) findViewById(R.id.iddNota4);
//
//        double nota1 = Double.parseDouble(iddNota1);
//        double nota2 = Double.parseDouble(iddNota2);
//        double nota3 = Double.parseDouble(iddNota3);
//        double nota4 = Double.parseDouble(iddNota4);
//
//        double resultado = nota1 + nota2 + nota3 + nota4;
//
//       String txtResultado = resultado;
//
//        Toast.makeText(getBaseContext(), txtResultado, Toast.LENGTH_LONG).show();
//












    }

}

