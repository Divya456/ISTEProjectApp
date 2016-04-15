package com.example.bk.iste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clutch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypt);
        setUpMessage1();
    }
    public void setUpMessage1(){
        Button messageButton = (Button) findViewById(R.id.chronicleevents);
        messageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Clutch.this, CrutchSecondActivity.class));
            }

        });
        Button messageButton1 = (Button) findViewById(R.id.cryptproject);
        messageButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Clutch.this, CrutchThirdActivity.class));
            }

        });
    }
}
