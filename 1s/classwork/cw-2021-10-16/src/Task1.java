// input k, x long(целое, +) --> k-сс (k<=9)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        long n = 0L;
        long b = 1L;

        while (x > 0) {
            // getting last number
            long d = x % 10;
            //adding to n
            n = n + b * d;
            //increasing the place
            b = b * k;
            // drop last number
            x = x / 10;
        }
        System.out.println(n);

    }
}
