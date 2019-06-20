package com.example.trygonometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SinusGegenkatheteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinus);

        Button ErgebnissButton = (Button) findViewById(R.id.Ergebnissbutton);
        ErgebnissButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText HypotenuseEditText = (EditText) findViewById(R.id.HypotenuseEditText);
                EditText WinkelEditText = (EditText) findViewById(R.id.WinkelEditText);
                TextView ErgebnisstextView = (TextView) findViewById(R.id.ErgebnisstextView);

                try {

                    double Hypotenuse = Double.parseDouble(HypotenuseEditText.getText().toString());
                    double Winkel = Double.parseDouble(WinkelEditText.getText().toString());

                    double Gegenkathete = Hypotenuse * Math.sin(Math.toRadians(Winkel));

                    ErgebnisstextView.setText(Gegenkathete + "");
                }catch (Exception e) {
                    ErgebnisstextView.setText("error");
                }
            }
        });
    }
}
