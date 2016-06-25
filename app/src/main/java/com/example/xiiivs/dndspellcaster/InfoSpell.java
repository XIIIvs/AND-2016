package com.example.xiiivs.dndspellcaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class InfoSpell extends ActionBarActivity {

    public static final String RECIPE_EXTRA_KEY = "spell";

    private Spell spell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("[LOG]InfoSpell: ", "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_spell);

        Intent i = getIntent();
        spell = (Spell) i.getExtras().getSerializable(RECIPE_EXTRA_KEY);

        showSpell(spell);
    }

    private void showSpell(Spell spell) {
        Log.d("[LOG]InfoSpell: ", "showSpell()");
        TextView name = (TextView) findViewById(R.id.spell_name);
        TextView lvl = (TextView) findViewById(R.id.spell_lvl);
        TextView info = (TextView) findViewById(R.id.spell_info);
        TextView cast = (TextView) findViewById(R.id.spell_cast);
        TextView stat = (TextView) findViewById(R.id.spell_stat);
        ImageView img = (ImageView) findViewById(R.id.spell_image);

        name.setText(spell.getName());
        String lvlstring = "Level: " + spell.getLvl();
        lvl.setText(lvlstring);
        info.setText(spell.getInfo());
        cast.setText(spell.getCast());
        stat.setText(spell.getStat());
        img.setImageResource(getImage(spell.getImg()));
    }

    private int getImage(String imgID) {
        Log.d("[LOG]SpellAdapter: ", "getImage()");
        Log.d("[LOG]SpellAdapter: ", imgID);
        int tmp = Integer.parseInt(imgID);
        int newID = tmp % 10;
        int id;
        if (imgID == "1") { id = 1; }
        if (imgID == "2") { id = 2; }
        if (imgID == "3") { id = 3; }
        if (imgID == "4") { id = 4; }
        if (imgID == "5") { id = 5; }
        if (imgID == "6") { id = 6; }
        if (imgID == "7") { id = 7; }
        if (imgID == "8") { id = 8; }
        if (imgID == "9") { id = 9; }
        else { id = 0; }
        id = newID;

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

        return imageRes[id];
    }
}
