import java.util.Scanner;

import static java.lang.Math.max;

public class Acmp39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = max(max, arr[i]);
            sum += max;
        }
        System.out.println(sum);
    }
}
