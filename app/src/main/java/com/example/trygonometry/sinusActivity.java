package com.example.trygonometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sinusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosinus);

        Button GegenkatheteBtn = (Button)findViewById(R.id.GegenkatheteBtn);
        GegenkatheteBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntentKosinusAnkathete = new Intent(getApplicationContext(),SinusGegenkatheteActivity.class);
                startActivity(startIntentKosinusAnkathete);
            }
        });
        Button WinkelBtn = (Button)findViewById(R.id.WinkelBtn);
        WinkelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentKosinusWinkel = new Intent(getApplicationContext(),SinusWinkelActivity.class);
                startActivity(startIntentKosinusWinkel);
            }
        });
        Button HypotenuseBtn = (Button)findViewById(R.id.HypotenuseBtn);
        HypotenuseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentKosinusHypotenuse = new Intent(getApplicationContext(),SinusWinkelActivity.class);
                startActivity(startIntentKosinusHypotenuse);
            }
        });

    }
}