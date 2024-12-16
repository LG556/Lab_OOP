package com.Lab4;

public class Main {
    public static void main(String[] args) {
        // Створення персонажа за допомогою Builder
        Character elfMage = new Character.CharacterBuilder()
                .setName("Elandor")
                .setRace(new Elf())
                .setProfession(new Mage())
                .setStrength(10)
                .setAgility(15)
                .setIntelligence(20)
                .build();

        Character orcWarrior = new Character.CharacterBuilder()
                .setName("Gorash")
                .setRace(new Orc())
                .setProfession(new Warrior())
                .setStrength(20)
                .setAgility(10)
                .setIntelligence(5)
                .build();

        System.out.println(elfMage);
        System.out.println(orcWarrior);
    }
}
