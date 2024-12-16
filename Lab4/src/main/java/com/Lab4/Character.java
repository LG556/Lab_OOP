package com.Lab4;

public class Character {
    private final String name;
    private final Race race;
    private final Profession profession;
    private final int strength;
    private final int agility;
    private final int intelligence;


    private Character(CharacterBuilder builder) {
        this.name = builder.name;
        this.race = builder.race;
        this.profession = builder.profession;
        this.strength = builder.strength;
        this.agility = builder.agility;
        this.intelligence = builder.intelligence;
    }

    public String getName() { return name; }
    public Race getRace() { return race; }
    public Profession getProfession() { return profession; }
    public int getStrength() { return strength; }
    public int getAgility() { return agility; }
    public int getIntelligence() { return intelligence; }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race=" + race.getName() +
                ", profession=" + profession.getName() +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                '}';
    }

    // Builder
    public static class CharacterBuilder {
        private String name;
        private Race race;
        private Profession profession;
        private int strength;
        private int agility;
        private int intelligence;

        public CharacterBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder setRace(Race race) {
            this.race = race;
            return this;
        }

        public CharacterBuilder setProfession(Profession profession) {
            this.profession = profession;
            return this;
        }

        public CharacterBuilder setStrength(int strength) {
            this.strength = strength;
            return this;
        }

        public CharacterBuilder setAgility(int agility) {
            this.agility = agility;
            return this;
        }

        public CharacterBuilder setIntelligence(int intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}

