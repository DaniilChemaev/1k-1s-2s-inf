public class Game extends GameStats{
    public static void startGame() {
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");


        while (p1.getHP() > 0 && p2.getHP() > 0) {
            p1.kick(p2);
            if (p2.getHP() > 0) {
                p2.kick(p1);
            }
            steps++;
        }

        if (p1.getHP() <= 0) {
            w2++;
        } else {
            w1++;
        }
    }

}