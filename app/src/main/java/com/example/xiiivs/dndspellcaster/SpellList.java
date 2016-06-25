package com.example.xiiivs.dndspellcaster;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SpellList extends AppCompatActivity {
    private SpellAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("[LOG]STATUS: ", "Starting");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spell_list);
        initializeList();
 //       Intent i = new Intent(this, AddSpell.class);
 //       startActivity(i);
    }

    @Override
    public void onResume() {
        Log.d("[LOG]STATUS: ", "onResume()");
        super.onResume();
        adapter = new SpellAdapter(this);
        adapter.notifyDataSetChanged();
        initializeList();
    }

    private void initializeList() {
        Log.d("[LOG]STATUS: ", "initializeList()");

        ListView list = (ListView) findViewById(R.id.spell_list);

        final SpellAdapter adapter = new SpellAdapter(this);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Spell spell = adapter.getItem(position);
                showSpell(spell);
            }
        });
    }

    private void showSpell(Spell spell) {
        Log.d("[LOG]STATUS: ", "Starting ShowSpell");
        Intent i = new Intent(this, InfoSpell.class);

        i.putExtra(InfoSpell.RECIPE_EXTRA_KEY, spell);

        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d("[LOG]STATUS: ", "onCreateOptionsMenu");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("[LOG]STATUS: ", "onOptionsItemSelected");
        switch (item.getItemId()) {
            case R.id.add_spell: {
                startAddSpell();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(item);
            }
        }

    }

    private void startAddSpell() {
        Log.d("[LOG]STATUS: ", "Starting AddSpell");
        Intent i = new Intent(this, AddSpell.class);
        startActivity(i);
    }
}
