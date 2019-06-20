package com.example.trygonometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SinusBtn = (Button)findViewById(R.id.Sinusbtn);
        SinusBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent starIntentSinus = new Intent(getApplicationContext(),sinusActivity.class);
                startActivity(starIntentSinus);
            }
        });
        Button KosinusBtn = (Button)findViewById(R.id.KosinusBtn);
        KosinusBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntentKosinus = new Intent(getApplicationContext(),KosinusActivity.class);
                startActivity(startIntentKosinus);
            }
        });
    }
}
