package com.example.bk.iste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Charge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charge);
        setUpMessage1();
    }
    public void setUpMessage1(){
        Button messageButton = (Button) findViewById(R.id.chargeevents);
        messageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Charge.this, ChargeSecondActivity.class));
            }

        });
        Button messageButton1 = (Button) findViewById(R.id.chargeproject);
        messageButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Charge.this, ChargeThirdActivity.class));
            }

        });
    }
}
