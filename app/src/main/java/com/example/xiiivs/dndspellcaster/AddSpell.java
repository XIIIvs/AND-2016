package com.example.xiiivs.dndspellcaster;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddSpell extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("[LOG]Add Spell: ", "onCreate()");
        super.onCreate(savedInstanceState);

        setContentView(R.layout.add_spell);

        setupViews();
    }

    private void setupViews() {
        Log.d("[LOG]InfoSpell: ", "setupViews()");
        final EditText spellNameInput = (EditText) findViewById(R.id.spell_name_edit);
        final EditText spellInfoInput = (EditText) findViewById(R.id.spell_info_edit);
        final EditText spellLvlInput = (EditText) findViewById(R.id.spell_lvl_edit);
        final EditText spellStatInput = (EditText) findViewById(R.id.spell_stat_edit);
        final EditText spellCastInput = (EditText) findViewById(R.id.spell_cast_edit);
        final EditText spellImgInput = (EditText) findViewById(R.id.spell_img_edit);

        Button saveButton = (Button) findViewById(R.id.save_spell);

        saveButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String spellName = spellNameInput.getText().toString();
                String spellInfo = spellInfoInput.getText().toString();
                String spellLvl = spellLvlInput.getText().toString();
                String spellStat = spellStatInput.getText().toString();
                String spellCast = spellCastInput.getText().toString();
                String spellImg = spellImgInput.getText().toString();

                saveSpell(new Spell(spellName, spellInfo, spellLvl, spellStat, spellCast, spellImg));
            }
        });
    }

    private void saveSpell(Spell spell) {
        Log.d("[LOG]InfoSpell: ", "saveSpell()");
        SpellDB spellDB = new SpellDB(this);
        spellDB.addSpell(spell);

        Toast.makeText(this, spell.getName() + " saved", Toast.LENGTH_SHORT).show();

        finish();
    }
}