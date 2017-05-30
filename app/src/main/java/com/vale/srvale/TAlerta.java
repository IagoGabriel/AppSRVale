package com.vale.srvale;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by iago_ on 07/05/2017.
 */

public class TAlerta extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_alerta);

        overridePendingTransition(R.anim.filho_entrando, R.anim.pai_saindo);

        final MediaPlayer alertaFumaca = MediaPlayer.create(TAlerta.this, R.raw.alarme_incedio);
        final MediaPlayer alertaIncendio = MediaPlayer.create(TAlerta.this, R.raw.alarme_fabrica);
        final MediaPlayer alertaAbandono = MediaPlayer.create(TAlerta.this, R.raw.red_alert);
        final Button bttnFumaca = (Button) findViewById(R.id.button6);
        final Button bttnIncendio = (Button) findViewById(R.id.button8);
        final Button bttnAbandono = (Button) findViewById(R.id.button7);

        bttnFumaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alertaFumaca.isPlaying()){
                    alertaFumaca.pause();
                    bttnFumaca.setText("Ouvir alerta de fumaça");
                }else{
                    alertaFumaca.start();
                    bttnFumaca.setText("Parar de ouvir alerta de fumaça");
                }
            }
        });
        bttnIncendio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alertaIncendio.isPlaying()){
                    alertaIncendio.pause();
                    bttnIncendio.setText("Ouvir alerta de incêndio");
                }else{
                    alertaIncendio.start();
                    bttnIncendio.setText("Parar de ouvir alerta de incêndio");
                }
            }
        });
        bttnAbandono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alertaAbandono.isPlaying()){
                    alertaAbandono.pause();
                    bttnAbandono.setText("Ouvir alarme de abandono");
                }else{
                    alertaAbandono.start();
                    bttnAbandono.setText("Parar de ouvir alarme de abandono");
                }
            }
        });

        Button bttn = (Button) findViewById(R.id.button10);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(TAlerta.this, Configuracao.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}
