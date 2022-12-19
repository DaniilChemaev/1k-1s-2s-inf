package tg_file;

import java.util.Scanner;

public class tg_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int i = 2;
        while (x != 1) {
            if (x % i == 0) {
                System.out.print(i + " ");
                x /= i;
                i = 2;
            } else i++;
        }

    }
}
