package com.vale.srvale;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by iago_ on 25/04/2017.
 */

public class Configuracao extends AppCompatActivity{
    //Button btnCadastrar = (Button)findViewById(R.id.button);
    //DatabaseHelper myDB;
    EditText etNome, etEmail, etCpf, etSenha;
    DatabaseHelper myDB;
    Spinner spSala;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracao);

        overridePendingTransition(R.anim.filho_entrando, R.anim.pai_saindo);

        myDB = new DatabaseHelper(this);

        etNome = (EditText)findViewById(R.id.editText);
        etEmail = (EditText)findViewById(R.id.editText2);
        etCpf = (EditText)findViewById(R.id.editText3);
        etSenha = (EditText)findViewById(R.id.editText4);
        spSala = (Spinner)findViewById(R.id.spinner);
        Button bttnCadastrar = (Button) findViewById(R.id.button);

        bttnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Configuracao.this, "Usuário cadastrado!", Toast.LENGTH_LONG).show();
                boolean isInserted = myDB.InsertData(etNome.getText().toString(), etEmail.getText().toString(), etCpf.getText().toString(), etSenha.getText().toString());
                if(isInserted){
                    Intent intentLoadNewActivity = new Intent(Configuracao.this, Home.class);
                    startActivity(intentLoadNewActivity);
                }
            }
        });
    }



}
