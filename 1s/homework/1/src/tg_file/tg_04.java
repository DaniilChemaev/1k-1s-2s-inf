package tg_file;

import java.util.Scanner;

public class tg_04 {
    public static double getFactorial(int n) {
        double res = 1;
        for (double i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        double sum = 0;
        for (int m = 1; m < n; m++) {
            double m1_fac = getFactorial(m-1);
            double m2_fac = getFactorial(2*m);
            sum += (m1_fac * m1_fac)/(m2_fac);
        }
        System.out.println(sum);
    }
}
