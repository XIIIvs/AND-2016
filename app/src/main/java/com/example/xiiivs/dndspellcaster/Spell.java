package com.example.xiiivs.dndspellcaster;

import java.io.Serializable;

public class Spell implements Serializable {

    private String spellName;
    private String spellInfo;
    private String spellLvl;
    private String spellStat;
    private String spellCast;
    private String imageID;

    public Spell(String name, String info, String lvl, String stat, String cast, String img) {
        this.spellName = name;
        this.spellInfo = info;
        this.spellLvl = lvl;
        this.spellStat = stat;
        this.spellCast = cast;
        this.imageID = img;
    }

    public String getName() {
        return spellName;
    }

    public String getInfo() {
        return spellInfo;
    }

    public String getLvl() {
        return spellLvl;
    }

    public String getStat() {
        return spellStat;
    }

    public String getCast() {
        return spellCast;
    }

    public String getImg() {
        return imageID;
    }

}
