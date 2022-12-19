/*
4 7 9
2 5 8
1 3 6

1 3 6
2 5 8
4 7 9

00
10
01
20
11
02
21
12
22
 */

import java.util.Arrays;

public class Task1 {
    public static void task1() {
        int n = 4;
        int m = 3;


//        for (int i = 0; i < m; i++) {
//
//        }
        int[][] l = new int[m][n];

        int temp = m* n;



        System.out.println(Arrays.deepToString(l));


        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length; j++) {
                System.out.print(l[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}

