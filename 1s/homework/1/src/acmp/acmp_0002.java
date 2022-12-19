package acmp;

//  Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно.
//Входные данные
//
//В единственной строке входного файла INPUT.TXT записано единственное целое число N, не превышающее по абсолютной величине 104.
//Выходные данные
//
//В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел, расположенных между 1 и N включительно.

import java.util.Scanner;

public class acmp_0002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            n = -n;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println(-(sum - 1));
        }
    }
}
