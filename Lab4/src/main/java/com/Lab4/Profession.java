package com.Lab4;

public interface Profession {
    String getName();
    String getSkill();
}

class Warrior implements Profession {
    @Override
    public String getName() {
        return "Warrior";
    }

    @Override
    public String getSkill() {
        return "Sword Mastery";
    }
}

class Mage implements Profession {
    @Override
    public String getName() {
        return "Mage";
    }

    @Override
    public String getSkill() {
        return "Spell Casting";
    }
}

