package acmp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class acmp_0007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int max = 1000000000;
        int la = n[0].length();
        int lb = n[1].length();
        int lc = n[2].length();
        if ((la > max || lb > max || lc > max) && (la != lb && la != lc)) {
            if (n[0].length() > n[1].length() && n[0].length() > n[2].length()) {
                System.out.println(n[0]);
            } else if (n[1].length() > n[0].length() && n[1].length() > n[2].length()) {
                System.out.println(n[1]);
            } else {
                System.out.println(n[2]);
            }
        } else {
            Arrays.sort(n, Comparator.reverseOrder());
            System.out.println(n[0]);
        }

    }
}
