import java.util.*;

public class Player extends GameStats {

    private int hp;
    private String name;
    private static Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public Player(String name) {
        this.name = name;
        this.hp = 50;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void kick(Player p) {
        int f = random.nextInt(10) + 1;
        GameStats.kicks[f - 1] += 1;
        double pr = 1.0 / f;
        if (f >= 2) {
            pr += 0.3;
        }
        if (Math.random() < pr) {
            p.setHP(p.getHP() - f);
            GameStats.succeedKicks[f - 1] += 1;
//            System.out.println(this + " kicked " + p + " with force " + f + ". Now " + p + " HP is " + p.getHP());
        } else {
//            System.out.println(this + " missed.");
        }
    }
}