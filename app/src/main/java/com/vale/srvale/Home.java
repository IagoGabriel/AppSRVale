package com.vale.srvale;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by iago_ on 30/05/2017.
 */

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        ImageButton ib1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton ib2 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton ib3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton ib4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton ib5 = (ImageButton) findViewById(R.id.imageButton6);

        ib1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Home.this, Configuracao.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Home.this, LiderFuga.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Home.this, Alerta.class);
                startActivity(intentLoadNewActivity);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Home.this, RotaFuga.class);
                startActivity(intentLoadNewActivity);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(Home.this, PontoEncontro.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}
