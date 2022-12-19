// 27.12.2021 ПЕРЕПИСЫВАЮ КР2
// ВАРИАНТ 1

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        int first = 0;
        int last = matrix.length;
        int maxN = matrix[0][0];


        for (int i = 0; i < matrix.length / 2 + 1; i++) {  // Проверка верхнего треугольника
            for (int j = first; j < last; j++) {
                System.out.println(matrix[i][j]);
                if (matrix[i][j] > maxN) {
                    maxN = matrix[i][j];
                }
            }
            first += 1;
            last -= 1;
            if (first == last) {
                break;
            }
        }

        for (int i = matrix.length / 2 - 1; i < matrix.length; i++) {  // Проверка нижнего треугольника
            for (int j = first; j < last; j++) {
                System.out.println(matrix[i][j]);

                if (matrix[i][j] > maxN) {
                    maxN = matrix[i][j];
                }
            }
            first -= 1;
            last += 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println(maxN);
    }
}
