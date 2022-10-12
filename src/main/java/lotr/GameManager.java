package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2){
        int start_hp;
        int end_hp;
        if (c1 instanceof Elf && c2 instanceof Elf){
            System.out.println("Elfs don't fight with each other");
        }
        else if (c1 instanceof Hobbit && c2 instanceof Hobbit){
            System.out.println("Hobbits are friends to each other");
        }
        else {
            while (c1.getHp() > 0 && c2.getHp() > 0) {
                start_hp = c2.getHp();
                c1.kick(c2);
                System.out.println(c1.getClass().getSimpleName() + " deals " + (start_hp - c2.getHp()) +
                        " damage to " + c2.getClass().getSimpleName());
                if (!c2.isAlive()) {
                    System.out.println(c2.getClass().getSimpleName() + " died");
                    break;
                }

                start_hp = c1.getHp();
                c2.kick(c1);
                System.out.println(c2.getClass().getSimpleName() + " deals " + (start_hp - c1.getHp()) +
                        " damage to " + c1.getClass().getSimpleName());
                if (!c1.isAlive()) {
                    System.out.println(c1.getClass().getSimpleName() + " died ");
                    break;
                }
            }
        }
    }
}
