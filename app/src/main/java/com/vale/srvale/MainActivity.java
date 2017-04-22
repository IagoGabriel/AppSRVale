package com.vale.srvale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Configuracao.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ib2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, LiderFuga.class);
                startActivity(intentLoadNewActivity);
            }
        });

        ib3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, Alerta.class);
                startActivity(intentLoadNewActivity);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, RotaFuga.class);
                startActivity(intentLoadNewActivity);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, PontoEncontro.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}
