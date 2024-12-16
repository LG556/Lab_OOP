package com.Lab4;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProfessionTest {

    @Test
    void testMageProfession() {
        Profession mage = new Mage();

        assertThat(mage.getName()).isEqualTo("Mage");
        assertThat(mage.getSkill()).isEqualTo("Spell Casting");
    }

    @Test
    void testWarriorProfession() {
        Profession warrior = new Warrior();

        assertThat(warrior.getName()).isEqualTo("Warrior");
        assertThat(warrior.getSkill()).isEqualTo("Sword Mastery");
    }
}
