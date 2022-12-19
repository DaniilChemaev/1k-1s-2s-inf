package tg_file;

import java.util.Scanner;

public class tg_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt() + 1;
        int m = sc.nextInt();

        while (m > k) {
            if (k % 3 == 0) {
                System.out.print(k + " ");
            }
            k++;
        }

    }
}
