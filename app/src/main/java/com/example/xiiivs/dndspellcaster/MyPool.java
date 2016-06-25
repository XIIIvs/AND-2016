package com.example.xiiivs.dndspellcaster;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MyPool extends AppCompatActivity {

    private List<Spell> spellsPool = new ArrayList<Spell>();
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("[LOG]POOL: ", "create");
        super.onCreate(savedInstanceState);
        initializePool();
 //       setContentView(R.layout.activity_my_pool);
    }

    private void initializePool() {
        Log.d("[LOG]POOL: ", "initializePool()");
        setContentView(R.layout.activity_spell_list);
        showList();
    }

    private void showList() {
        Log.d("[LOG]POOL: ", "showList()");

        ListView list = (ListView) findViewById(R.id.spell_list);

        final SpellAdapter adapter = new SpellAdapter(this);

        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Spell spell = adapter.getItem(position);
                addSpell(spell, spellsPool);
            }
        });
    }

    private void addSpell(Spell spell, List<Spell> pool){
        pool.add(spell);
        if(pool.size() >= 9){
            Log.d("[LOG]POOL: ", "max in pool");
            setContentView(R.layout.activity_my_pool);
            bindView();
        }
    }

    private void bindView() {
        handler = new Handler();
        Spell s1 = spellsPool.get(0);
        Spell s2 = spellsPool.get(1);
        Spell s3 = spellsPool.get(2);
        Spell s4 = spellsPool.get(3);
        Spell s5 = spellsPool.get(4);
        Spell s6 = spellsPool.get(5);
        Spell s7 = spellsPool.get(6);
        Spell s8 = spellsPool.get(7);
        Spell s9 = spellsPool.get(8);
        ImageView i1 = (ImageView) findViewById(R.id.poolI1);
        ImageView i2 = (ImageView) findViewById(R.id.poolI2);
        ImageView i3 = (ImageView) findViewById(R.id.poolI3);
        ImageView i4 = (ImageView) findViewById(R.id.poolI4);
        ImageView i5 = (ImageView) findViewById(R.id.poolI5);
        ImageView i6 = (ImageView) findViewById(R.id.poolI6);
        ImageView i7 = (ImageView) findViewById(R.id.poolI7);
        ImageView i8 = (ImageView) findViewById(R.id.poolI8);
        ImageView i9 = (ImageView) findViewById(R.id.poolI9);
        i1.setImageResource(getImage(s1.getImg()));
        i2.setImageResource(getImage(s2.getImg()));
        i3.setImageResource(getImage(s3.getImg()));
        i4.setImageResource(getImage(s4.getImg()));
        i5.setImageResource(getImage(s5.getImg()));
        i6.setImageResource(getImage(s6.getImg()));
        i7.setImageResource(getImage(s7.getImg()));
        i8.setImageResource(getImage(s8.getImg()));
        i9.setImageResource(getImage(s9.getImg()));
        Button b1 = (Button) findViewById(R.id.butt1);
        Button b2 = (Button) findViewById(R.id.butt2);
        Button b3 = (Button) findViewById(R.id.butt3);
        Button b4 = (Button) findViewById(R.id.butt4);
        Button b5 = (Button) findViewById(R.id.butt5);
        Button b6 = (Button) findViewById(R.id.butt6);
        Button b7 = (Button) findViewById(R.id.butt7);
        Button b8 = (Button) findViewById(R.id.butt8);
        Button b9 = (Button) findViewById(R.id.butt9);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(0));
                    }
                }, 250);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(1));
                    }
                }, 250);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(2));
                    }
                }, 250);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(3));
                    }
                }, 250);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(4));
                    }
                }, 250);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(5));
                    }
                }, 250);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(6));
                    }
                }, 250);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(7));
                    }
                }, 250);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        showSpell(spellsPool.get(8));
                    }
                }, 250);
            }
        });
    }

    private void showSpell(Spell spell) {
        Log.d("[LOG]STATUS: ", "Starting ShowSpell");
        Intent i = new Intent(this, InfoSpell.class);
        i.putExtra(InfoSpell.RECIPE_EXTRA_KEY, spell);
        startActivity(i);
    }

    private int getImage(String imgID) {
        Log.d("[LOG]SpellAdapter: ", "getImage()");
        Log.d("[LOG]SpellAdapter: ", imgID);
        int tmp = Integer.parseInt(imgID);
        int id = tmp % 10;
        Integer[] imageRes = {
                R.drawable.obr10,
                R.drawable.obr01,
                R.drawable.obr02,
                R.drawable.obr03,
                R.drawable.obr04,
                R.drawable.obr05,
                R.drawable.obr06,
                R.drawable.obr07,
                R.drawable.obr08,
                R.drawable.obr09
        };
        if(imgID == "del"){
            return imageRes[10];
        }
        return imageRes[id];
    }
}
