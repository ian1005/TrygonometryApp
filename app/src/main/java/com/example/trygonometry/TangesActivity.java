package com.example.trygonometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TangesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanges);

        Button GegenkatheteBtn = (Button)findViewById(R.id.GegenkatheteBtn);
        GegenkatheteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentGegenkathete = new Intent(getApplicationContext(),TangesGegenkatheteActivity.class);
                startActivity(startIntentGegenkathete);
            }
        });
    }
}
