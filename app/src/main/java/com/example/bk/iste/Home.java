package com.example.bk.iste;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpMessage1();
    }
    /*public void buttonListen(View v)
    {
        if(v.getId()==R.id.sig_but)
        {
            Intent intent=new Intent("com.example.bk.iste.MainActivity");
            startActivity(intent);
        }
        if(v.getId()==R.id.blog_but)
        {
            Intent intent=new Intent("com.example.bk.iste.Blog");
            startActivity(intent);
        }
        if(v.getId()==R.id.event_but)
        {
            Intent intent=new Intent("com.example.bk.iste.Events");
            startActivity(intent);
        }
    }*/
    public void setUpMessage1(){
        Button messageButton = (Button) findViewById(R.id.sig_but);
        messageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, MainActivity.class));
            }

        });
        Button messageButton1 = (Button) findViewById(R.id.blog_but);
        messageButton1.setOnClickListener(new View.OnClickListener() {

                                              @Override
                                              public void onClick(View v) {startActivity(new Intent(Home.this, Blog.class));
                                              }
                                          });
        Button messageButton2 = (Button) findViewById(R.id.event_but);
        messageButton2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    startActivity(new Intent(Home.this, Events.class));
                }

        });
        Button messageButton3 = (Button) findViewById(R.id.transcend);
        messageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, Transcend.class));
            }

        });

    }
}
