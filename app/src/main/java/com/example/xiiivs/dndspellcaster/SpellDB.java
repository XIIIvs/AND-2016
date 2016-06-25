package com.example.xiiivs.dndspellcaster;

import static com.example.xiiivs.dndspellcaster.DataBaseVal.COLUMN_NAME;
import static com.example.xiiivs.dndspellcaster.DataBaseVal.COLUMN_INFO;
import static com.example.xiiivs.dndspellcaster.DataBaseVal.COLUMN_LVL;
import static com.example.xiiivs.dndspellcaster.DataBaseVal.COLUMN_STAT;
import static com.example.xiiivs.dndspellcaster.DataBaseVal.COLUMN_CAST;
import static com.example.xiiivs.dndspellcaster.DataBaseVal.COLUMN_IMG;
import static com.example.xiiivs.dndspellcaster.DataBaseVal.TABLE_NAME;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class SpellDB implements SpellProvide {

    private SpellDBHelper spellDbHelper;

    public SpellDB(Context context) {
        this.spellDbHelper = new SpellDBHelper(context);
    }

    public void addSpell(Spell spell) {
        Log.d("[LOG]DB: ", "addSpell()");
        SQLiteDatabase db = spellDbHelper.getWritableDatabase();

        try {
            ContentValues values = new ContentValues();
            values.put(COLUMN_NAME, spell.getName());
            values.put(COLUMN_INFO, spell.getInfo());
            values.put(COLUMN_LVL, spell.getLvl());
            values.put(COLUMN_STAT, spell.getStat());
            values.put(COLUMN_CAST, spell.getCast());
            values.put(COLUMN_IMG, spell.getImg());

            db.insert(TABLE_NAME, null, values);
        } finally {
            db.close();
        }
    }

    public Spell getSpell(int position) {
        Log.d("[LOG]DB: ", "getSpell()");
        SQLiteDatabase db = spellDbHelper.getReadableDatabase();

//        try {
            String[] projection = { COLUMN_NAME, COLUMN_INFO, COLUMN_LVL, COLUMN_STAT, COLUMN_CAST, COLUMN_IMG };

            String sortOrder = COLUMN_NAME + " ASC"; //or DESC
            Log.d("[LOG]BUGHUNT: ", "create cursor");
            Cursor cursor = db.query(TABLE_NAME,  // The table to query
                    projection,                   // The columns to return
                    null,                         // The columns for the WHERE clause
                    null,                         // The values for the WHERE clause
                    null,                         // don't group the rows
                    null,                         // don't filter by row groups
                    sortOrder                     // The sort order
            );

            return getSpellFromCursor(position, cursor);
 //       } finally {
  //          db.close();
 //           return getSpellFromCursor(position, cursor);
  //      }
    }

    private Spell getSpellFromCursor(int position, Cursor cursor) {
        Log.d("[LOG]DB: ", "getSpellFromCursor()");
        try {
            cursor.moveToPosition(position);

            String name = cursor.getString(0);
            String info = cursor.getString(1);
            String lvl = cursor.getString(2);
            String stat = cursor.getString(3);
            String cast = cursor.getString(4);
            String img = cursor.getString(5);
            Log.d("[LOG]BUGHUNT: ", "get info");
            Log.d("[LOG]BUGHUNT: ", name);
            Log.d("[LOG]BUGHUNT: ", info);
            Log.d("[LOG]BUGHUNT: ", lvl);
            Log.d("[LOG]BUGHUNT: ", stat);
            Log.d("[LOG]BUGHUNT: ", cast);
            Log.d("[LOG]BUGHUNT: ", img);
            cursor.close();

            return new Spell(name, info, lvl, stat, cast, img);
        } finally {
            cursor.close();
        }
    }

    public int getSpellsNumber() {
        Log.d("[LOG]DB: ", "getSpellsNumber()");
        SQLiteDatabase db = spellDbHelper.getReadableDatabase();

        try {
            return (int) DatabaseUtils.queryNumEntries(db, TABLE_NAME, null, null);
        } finally {
            db.close();
        }
    }
}

