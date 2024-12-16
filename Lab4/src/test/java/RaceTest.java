package com.Lab4;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {

    @Test
    void testElfRace() {
        Race elf = new Elf();

        assertThat(elf.getName()).isEqualTo("Elf");
        assertThat(elf.getSpecialAbility()).isEqualTo("Night Vision");
    }

    @Test
    void testOrcRace() {
        Race orc = new Orc();

        assertThat(orc.getName()).isEqualTo("Orc");
        assertThat(orc.getSpecialAbility()).isEqualTo("Berserker Rage");
    }
}
