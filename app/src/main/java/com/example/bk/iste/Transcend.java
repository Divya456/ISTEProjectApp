package com.example.bk.iste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Transcend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transcend);
        Click();
    }

    private void Click() {
        Button messageButton = (Button) findViewById(R.id.crysis);
        assert messageButton != null;
        messageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transcend.this, Crysis.class));
            }
        });

        Button messageButton1 = (Button) findViewById(R.id.botstaclerace);
        assert messageButton1 != null;
        messageButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transcend.this, Botstacle.class));
            }
        });

        Button messageButton2 = (Button) findViewById(R.id.civil);
        assert messageButton2 != null;
        messageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transcend.this, CivilEvents.class));
            }
        });

        Button messageButton3 = (Button) findViewById(R.id.git);
        assert messageButton3 != null;
        messageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transcend.this, Git.class));
            }
        });

        Button messageButton4 = (Button) findViewById(R.id.serialcoder);
        assert messageButton4 != null;
        messageButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transcend.this, SerialCoder.class));
            }
        });

        Button messageButton5 = (Button) findViewById(R.id.spectacle);
        assert messageButton5 != null;
        messageButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Transcend.this, Spectacle.class));
            }
        });
    }
}
