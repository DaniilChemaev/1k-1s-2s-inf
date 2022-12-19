import java.util.Scanner;

public class Battle {
    private static final Scanner sc = new Scanner(System.in);

    public Battle(Player player, Enemy enemy) {
        startBattle(player, enemy);
    }

    public static void startBattle(Player player, Enemy enemy) {
        int hp = enemy.getHP();
        while (hp > 0) {
            hp = enemy.getHP();
            System.out.printf("%d \n", hp);
            System.out.println("Введите силу удара");
            int strength = sc.nextInt();

            while (1 > strength || strength > 30) {
                System.out.println("Введите силу удара в диапазоне от 1 до 30\n");
                strength = sc.nextInt();
            }

            boolean punchHasPassed = Player.thePunchHasPassed(strength);

            if (punchHasPassed) {
                System.out.println("Вы попали!\n");
                enemy.setHP(hp -= strength);
            } else {
                System.out.println("Вы промахнулись!\n");
            }

        }
        System.out.println("Вы победили!");
    }
}
