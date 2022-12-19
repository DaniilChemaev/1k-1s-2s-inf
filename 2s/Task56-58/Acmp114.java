import java.util.Scanner;

public class Acmp114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] d = new int[n + 1];
        int[] d0 = new int[n + 1];

        d[1] = k - 1;
        d0[1] = 0;
        for (int i = 2; i <= n; i++) {
            d[i] = (d[i - 1] + d0[i - 1]) * (k - 1);
            d0[i] = d[i - 1];
        }
        System.out.println(d[n] + d0[n]);
    }
}
