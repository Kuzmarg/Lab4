package lotr;

import lombok.Getter;
import lombok.Setter;
import org.reflections.Reflections;

@Getter @Setter
public class Character {
    private int hp;
    private int power;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }
    public static Reflections reflections = new Reflections("lotr");

    public boolean isAlive(){
        return (this.hp > 0);
    }
    public void kick(Character c) {
    }

    @Override
    public String toString() {
        return "lotr."+ this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
