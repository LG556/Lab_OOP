package com.Lab4;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CharacterTest {

    @Test
    void testCharacterBuilderCreatesValidCharacter() {
        Character character = new Character.CharacterBuilder()
                .setName("Elandor")
                .setRace(new Elf())
                .setProfession(new Mage())
                .setStrength(12)
                .setAgility(14)
                .setIntelligence(18)
                .build();

        assertThat(character.getName()).isEqualTo("Elandor");
        assertThat(character.getRace().getName()).isEqualTo("Elf");
        assertThat(character.getProfession().getName()).isEqualTo("Mage");
        assertThat(character.getStrength()).isEqualTo(12);
        assertThat(character.getAgility()).isEqualTo(14);
        assertThat(character.getIntelligence()).isEqualTo(18);
    }

    @Test
    void testCharacterWithMinimalAttributes() {
        Character character = new Character.CharacterBuilder()
                .setName("Minimalist")
                .build();

        assertThat(character.getName()).isEqualTo("Minimalist");
        assertThat(character.getRace()).isNull();
        assertThat(character.getProfession()).isNull();
        assertThat(character.getStrength()).isZero();
        assertThat(character.getAgility()).isZero();
        assertThat(character.getIntelligence()).isZero();
    }
}
