package com.example.trygonometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KosinusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosinus);

        Button AnkatheteBtn = (Button)findViewById(R.id.AnkatheteBtn);
        AnkatheteBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntentKosinusAnkathete = new Intent(getApplicationContext(),KosinusAnkatheteActivity.class);
                startActivity(startIntentKosinusAnkathete);
            }
        });
        Button WinkelBtn = (Button)findViewById(R.id.WinkelBtn);
        WinkelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentKosinusWinkel = new Intent(getApplicationContext(),KosinuswinkelActivity.class);
                startActivity(startIntentKosinusWinkel);
            }
        });
        Button HypotenuseBtn = (Button)findViewById(R.id.HypotenuseBtn);
        HypotenuseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentKosinusHypotenuse = new Intent(getApplicationContext(),KosinusHypotenuseActivity.class);
                startActivity(startIntentKosinusHypotenuse);
            }
        });
    }
}
