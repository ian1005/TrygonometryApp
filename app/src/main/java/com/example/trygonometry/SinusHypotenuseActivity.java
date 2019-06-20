package com.example.trygonometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SinusHypotenuseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinus_hypotenuse);

        Button ErgebnissButton = (Button) findViewById(R.id.Ergebnissbutton);
        ErgebnissButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText GegenkatheteEditText = (EditText) findViewById(R.id.GegenkatheteEditText);
                EditText WinkelEditText = (EditText) findViewById(R.id.WinkelEditText);
                TextView ErgebnisstextView = (TextView) findViewById(R.id.ErgebnisstextView);

                try {

                    double Gegenkathete = Double.parseDouble(GegenkatheteEditText.getText().toString());
                    double Winkel = Double.parseDouble(WinkelEditText.getText().toString());

                    double Hypotenuse = Gegenkathete / Math.cos(Math.toRadians(Winkel));

                    ErgebnisstextView.setText(Gegenkathete + "");
                }catch (Exception e) {
                    ErgebnisstextView.setText("error");
                }
            }
        });
    }
}
