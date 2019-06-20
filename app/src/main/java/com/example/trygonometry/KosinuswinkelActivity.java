package com.example.trygonometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KosinuswinkelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosinuswinkel);

        Button ErgebnissButton = (Button) findViewById(R.id.Ergebnissbutton);
        ErgebnissButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText HypotenuseEditText = (EditText) findViewById(R.id.HypotenuseEditText);
                EditText AnkatheteEditText = (EditText) findViewById(R.id.AnkatheteEditText);
                TextView ErgebnisstextView = (TextView) findViewById(R.id.ErgebnisstextView);

                try {

                    double Hypotenuse = Double.parseDouble(HypotenuseEditText.getText().toString());
                    double Ankathete = Double.parseDouble(AnkatheteEditText.getText().toString());

                    double Winkel = Math.toDegrees(Math.acos(Ankathete / Hypotenuse));

                    ErgebnisstextView.setText(Winkel + "");
                }catch (Exception e) {
                    ErgebnisstextView.setText("error");
                }
            }
        });
    }
}
