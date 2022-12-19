import java.util.Scanner;

public class ThirdTask {
    public static void third(int n) {
        int[][] l = new int[n][n];
        int[] res = new int[15];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {
                l[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < l.length; i++) {
            System.out.println();
            for (int j = 0; j < l[i].length; j++) {
                res[l[i][j] - 7] += 1;  // res[0] = Сколько людей было в 8:00, res[1] в 9:00 ...
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(i + 7 + ":00: " + res[i] + " workers");
        }
    }
}
