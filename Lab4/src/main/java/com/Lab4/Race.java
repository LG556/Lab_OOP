package com.Lab4;

public interface Race {
    String getName();
    String getSpecialAbility();
}

class Elf implements Race {
    @Override
    public String getName() {
        return "Elf";
    }

    @Override
    public String getSpecialAbility() {
        return "Night Vision";
    }
}

class Orc implements Race {
    @Override
    public String getName() {
        return "Orc";
    }

    @Override
    public String getSpecialAbility() {
        return "Berserker Rage";
    }
}

