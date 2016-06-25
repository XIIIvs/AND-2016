package com.example.xiiivs.dndspellcaster;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SpellAdapter extends BaseAdapter {

    private SpellProvide spellProvide;
    private Context context;

    public SpellAdapter(Context context) {
        Log.d("[LOG]Constructor", "SpellAdapter");
        this.context = context;
        this.spellProvide = new SpellDB(context);
    }

    @Override
    public int getCount() {
        Log.d("[LOG]SpellAdapter: ", "getCount()");
        return spellProvide.getSpellsNumber();
    }

    @Override
    public Spell getItem(int position) {
        Log.d("[LOG]SpellAdapter: ", "getItem()");
        return spellProvide.getSpell(position);
    }

    @Override
    public long getItemId(int position) {
        Log.d("[LOG]SpellAdapter: ", "getItemID()");
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("[LOG]SpellAdapter: ", "getView()");
        View spellView;

        if (convertView == null) {
            spellView = LayoutInflater.from(context).inflate(R.layout.spell_row, parent, false);
        } else {
            spellView = convertView;
        }

        bindView(getItem(position), spellView);

        return spellView;
    }

    private void bindView(Spell spell, View spellView) {
        Log.d("[LOG]SpellAdapter: ", "bindView()");
        ImageView spellImage = (ImageView) spellView.findViewById(R.id.spell_image);
        spellImage.setImageResource(getImage(spell.getImg()));

        TextView spellName = (TextView) spellView.findViewById(R.id.spell_name);
        spellName.setText(spell.getName());

        TextView spellLvl = (TextView) spellView.findViewById(R.id.spell_lvl);
        String spellLvlText = "Level: " + spell.getLvl();
        spellLvl.setText(spellLvlText);

        TextView spellStat = (TextView) spellView.findViewById(R.id.spell_stat);
        spellStat.setText(spell.getStat());
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