package com.example.xiiivs.dndspellcaster;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        handler = new Handler();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pool = (Button) findViewById(R.id.pool);
        Button list = (Button) findViewById(R.id.spelllist);
        Button add = (Button) findViewById(R.id.adding);

        list.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), SpellList.class);
                        startActivity(intent);
                    }
                }, 250);
            }
        });

        pool.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), MyPool.class);
                        startActivity(intent);
                    }
                }, 250);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), AddMoreSpells.class);
                        startActivity(intent);
                    }
                }, 250);
            }
        });
    }
}
