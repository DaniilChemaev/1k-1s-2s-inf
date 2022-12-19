package acmp;

import java.util.Scanner;

public class acmp_0003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n / 10 > 0) {
            n = n / 10;
            System.out.print(n * (n + 1));
            System.out.print(25);
        }
        else{
            System.out.println(n * n);
        }
    }
}
