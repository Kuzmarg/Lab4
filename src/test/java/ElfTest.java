import lotr.Character;
import lotr.Elf;
import lotr.Hobbit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Character character;
    @Test
    public void testToString(){
        character = new Elf();
        assertEquals("lotr.Elf{hp=10, power=10}", character.toString());
    }

    @Test
    public void testKick() {
        character = new Elf();
        Hobbit hobbit = new Hobbit();
        character.kick(hobbit);
        assertEquals(0, hobbit.getHp());
    }
}

