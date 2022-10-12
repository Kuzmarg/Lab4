package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.reflections.Reflections;

import java.util.Random;

@Getter @Setter @AllArgsConstructor
public class Character {
    private int hp;
    private int power;
    public static Random rn = new Random();
    public static Reflections reflections = new Reflections("lotr");

    public boolean isAlive(){
        return (this.hp > 0);
    }
    public void kick(Character c) {
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
