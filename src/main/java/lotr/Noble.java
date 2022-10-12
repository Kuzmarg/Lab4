package lotr;

public class Noble extends Character{

    public Noble(int bound){
        super(Character.rn.nextInt(bound, bound + 11), Character.rn.nextInt(bound, bound + 11));
    }
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - Character.rn.nextInt(getPower() + 1));
    }
}
