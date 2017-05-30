package com.vale.srvale;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by iago_ on 06/05/2017.
 */

public class TPontoEncontro extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_pontoencontro);

        overridePendingTransition(R.anim.filho_entrando, R.anim.pai_saindo);

        Button bttn = (Button) findViewById(R.id.button5);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(TPontoEncontro.this, TAlerta.class);
                startActivity(intentLoadNewActivity);
            }
        });

    }
}
