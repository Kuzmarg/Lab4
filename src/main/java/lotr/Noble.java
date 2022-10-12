package lotr;

import java.util.Random;

public class Noble extends Character{
    public static Random rn = new Random();

    public Noble(int bound1){
        super(Noble.rn.nextInt(11) + bound1, Noble.rn.nextInt(11) + bound1);
    }
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - Noble.rn.nextInt(getPower() + 1));
    }
}
