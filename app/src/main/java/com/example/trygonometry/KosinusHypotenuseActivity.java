package com.example.trygonometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KosinusHypotenuseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosinus_hypotenuse);

        Button ErgebnissButton = (Button) findViewById(R.id.Ergebnissbutton);
        ErgebnissButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText WinkelEditText = (EditText) findViewById(R.id.WinkelEditText);
                EditText AnkatheteEditText = (EditText) findViewById(R.id.AnkatheteEditText);
                TextView ErgebnisstextView = (TextView) findViewById(R.id.ErgebnisstextView);

                try {

                    double Winkel = Double.parseDouble(WinkelEditText.getText().toString());
                    double Ankathete = Double.parseDouble(AnkatheteEditText.getText().toString());

                    double Hypotenuse = Ankathete / Math.cos(Math.toRadians(Winkel));
                    ErgebnisstextView.setText(Hypotenuse + "");
                }catch (Exception e) {
                    ErgebnisstextView.setText("error");
                }
            }
        });
    }
}
