import java.util.Random;

public class Player {
    private int hp = 100;

    public static boolean thePunchHasPassed(int strength) {
        Random random = new Random();
        boolean res = false;

        if (1 <= strength && 14 >= strength) {
            res = (random.nextInt(2) == 0);  // for 50% chance of true
        }
        else if (15 <= strength && 30 >= strength) {
            res = (random.nextInt(4) == 0);  // for 25% chance of true
        }
        return res;
    }
}
