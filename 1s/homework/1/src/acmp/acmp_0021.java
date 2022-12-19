package acmp;

import java.util.Scanner;

public class acmp_0021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int max = Integer.max(third, Integer.max(first, second));
        int min = Integer.min(third, Integer.min(first, second));

        System.out.println(max - min);

    }
}
