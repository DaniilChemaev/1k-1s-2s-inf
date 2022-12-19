public class Main {
    public static int n = 1000000;

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            Game.startGame();
        }
        System.out.println("1 wins: " + GameStats.w1 +
                "\n2 wins: " + GameStats.w2 +
                "\nAverage steps: " + GameStats.steps / n);

        for (int i = 0; i < GameStats.kicks.length; i++) {
            System.out.println(i + 1 + " " + GameStats.succeedKicks[i] / GameStats.kicks[i]);
        }
    }
}
