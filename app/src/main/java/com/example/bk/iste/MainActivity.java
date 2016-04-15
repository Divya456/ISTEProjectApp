package com.example.bk.iste;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpMessage1();
    }
    public void setUpMessage1() {
        Button messageButton = (Button) findViewById(R.id.crypt);
        messageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Crypt.class));
            }

        });
        Button messageButton1 = (Button) findViewById(R.id.charge);
        messageButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Charge.class));
            }

        });
        Button messageButton2 = (Button) findViewById(R.id.clutch);
        messageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Clutch.class));
            }

        });
        Button messageButton3 = (Button) findViewById(R.id.civil);
        messageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Civil.class));
            }

        });
        Button messageButton4 = (Button) findViewById(R.id.credit);
        messageButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Credit.class));
            }

        });
        Button messageButton5 = (Button) findViewById(R.id.chronicle);
        messageButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Chronicle.class));
            }

        });
        Button messageButton6 = (Button) findViewById(R.id.create);
        messageButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Create.class));
            }

        });
    }
}
