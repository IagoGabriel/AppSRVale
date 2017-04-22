package com.vale.srvale;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by iago_ on 25/04/2017.
 */

public class LiderFuga extends AppCompatActivity {
    ListView listView;
    int[] imgResource = {R.drawable.fredericauser, R.drawable.alexandrauser, R.drawable.renatauser, R.drawable.lucasuser, R.drawable.andersonuser, R.drawable.tathyannauser, R.drawable.elteruser, R.drawable.tiagouser, R.drawable.gustavouser, R.drawable.mayarauser};
    String[] name = {"Frederica Bastos", "Alexandra Schmitt", "Renata Castão", "Lucas Pontes", "Anderson Biss", "Tathyanna Dutra", "Elter Matheus", "Tiago Dantas", "Gustavo Santiago", "Mayara Marino"};
    String[] ramal = {"Ramal: 7118  Sala 34", "Ramal: 2372  Sala 41A", "Ramal: 5128  Sala 42", "Ramal: 5041  Sala 34", "Ramal: 2117  Sala 39", "Ramal: 1732  Sala 35", "Ramal: 5632  Sala 32", "Ramal: 5152  Sala 36", "Ramal: 7250  Sala 43", "Ramal: 3114  Sala 40"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meulider);

        listView = (ListView) findViewById(R.id.listalider);
        LiderAdapter liderAdapter = new LiderAdapter(getApplicationContext(), R.layout.raw_layout);
        listView.setAdapter(liderAdapter);
        int i = 0;
        for(String Name : name) {
            LiderClass obj = new LiderClass(imgResource[i], Name, ramal[i]);
            liderAdapter.add(obj);
            i++;
        }
    }
}
