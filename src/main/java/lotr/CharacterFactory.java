package lotr;

import lombok.SneakyThrows;

import java.util.Random;
import java.util.Set;

import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    public static Random rn = new Random();
    @SneakyThrows
    public static Character createCharacter(){
        int index = CharacterFactory.rn.nextInt(4);
        Set<Class<?>> classes = Character.reflections.get(SubTypes.of(Character.class).asClass());
        classes.remove(Noble.class);
        Class cl = (Class) classes.toArray()[index];
        return (Character) cl.getConstructor().newInstance();
    }
}
