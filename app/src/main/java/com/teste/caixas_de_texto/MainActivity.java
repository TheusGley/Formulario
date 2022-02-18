package com.teste.caixas_de_texto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText CampoNome;
    private EditText CampoEmail;
    private TextView Texto1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CampoNome = findViewById(R.id.Cnome);
        Texto1 = findViewById(R.id.Texto1);
        CampoEmail = findViewById(R.id.Cemail);


    }

    public void Enviar (View view){



        String nome = CampoNome.getText().toString();
        String email = CampoEmail.getText().toString();
        Texto1.setText("Nome: " + nome + "            email: "+ email);


    }
    public void limpar (View view){
        CampoNome.setText("");
        CampoEmail.setText("");
    }
}