import java.util.Scanner;

public class Menu {
    public void Start() {
        Scanner sc = new Scanner(System.in);
        int ans;
        do {
            System.out.print("""
                    ============================
                    Choose the level
                    1. Easy
                    2. Normal
                    3. Hard
                    0. Exit
                    ============================
                    Enter number:\040""");
            ans = sc.nextInt();

            while (ans >= 4 || ans < 0) {
                System.out.println("Number could be only from 0 to 3");
                System.out.print("Enter number: ");
                ans = sc.nextInt();
                System.out.print("\n");
            }
            if (ans != 0) {
                boolean res = false;
                while (res != true) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    Miner miner = new Miner(x, y);
                    boolean res = miner.start();
                }

            }
        } while (ans != 0);
    }
}
