import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];
        int[][] result = new int[5][5];


        /*
        [[i1, j1], [i1, j2], [i1, j3], [i1, j4], [i1, j5]]
        [[i2, j1], [i2, j2], [i2, j3], [i2, j4], [i2, j5]]
        [[i3, j1], [i3, j2], [i3, j3], [i3, j4], [i3, j5]]
        [[i4, j1], [i4, j2], [i4, j3], [i4, j4], [i4, j5]]
        [[i5, j1], [i5, j2], [i5, j3], [i5, j4], [i5, j5]]
        */

        // 1 MATRIX
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix1[i][j] = rand.nextInt(50);
            }
        }

        // 2 MATRIX
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix2[i][j] = rand.nextInt(50);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n*\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplying
        System.out.println("\n\noutput matrix:-");
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                int sum = 0;
                for (int k = 0; k < 5; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
