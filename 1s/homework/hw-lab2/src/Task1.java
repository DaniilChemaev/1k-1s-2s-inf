public class Task1 {
    public static void task1() {
        final int i = 5;
        final int j = 6;

        int[][] w = new int[i][j];

        int temp = 1;

        int k = i - 1;
        int l = 0;


        // Начиная с k-ой строки и l элемента заполняем матрицу
        // Первую строку каждый раз смещаем наверх, крайнюю точку столбца каждый раз смещаем направо

        // ЗАПОЛНЕНИЕ ДО ПЕРВОЙ ПОЛНОЙ ДИАГОНАЛИ
        while (k > 0) {
            int low = k;
            int up = 0;
            while (low < i) {  // Заполнение диагонали
                w[low][up] = temp;
                low++;
                up++;
                temp++;
            }
            k--; // Смещение указателя строки на один выше
            l++;
        }


        // Пока l (указатель столбца) не станет равным ширине матрицы -- заполняем, полную диагональ)

        // ЗАПОЛНЕНИЕ ВСЕХ ПОЛНЫХ ДИАГОНАЛЕЙ
        int ll = 0; // Элемент, с которого начинаем заполнять первую строку
        while (l < j) {
            int low = k;
            int up = ll;
            while (low <= i - 1) {
                w[low][up] = temp;
                low++;
                up++;
                temp++;
            }
            l++;
            ll++;
        }


        k = i - 1;  // По какую строку мы заполняем массив
        l = j;  // C какого элемента начинаем заполнять 0 строку


        // ЗАПОЛНЕНИЕ ПОСЛЕ ПОЛНЫЙ ДИАГОНАЛЕЙ
        while (k >= 0) {
            int low = 0;
            int up = ll;
            while (low < k) {  // Заполнение диагонали
                w[low][up] = temp;
                low++;
                up++;
                temp++;
            }
            k--;
            ll++;
        }


        for (int g = 0; g < w.length; g++) {
            for (int q = 0; q < w[g].length; q++) {
                System.out.print(w[g][q] + " ");
            }
            System.out.println("\n");
        }
    }
}

