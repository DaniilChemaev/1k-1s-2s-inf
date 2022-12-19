// 60. Вводится массив цифр. Вывести маĸсимальное число, ĸоторое можно из них составить.
public class Task60 {
    public static void task(int[] a) {
        int max = a[0];
        int max_i = 0;
        int step = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - step; j++) {
                if (a[j] > max) {
                    max = a[j];
                    max_i = j;
                }
            }
            for (int k = max_i + 1; k < a.length; k++) {
                a[k - 1] = a[k];
            }
            step += 1;
            System.out.print(max);
            max = a[0];
            max_i = 0;

        }
    }

    public static void main(String[] args) {
        int[] a = {1, 9, 5, 2, 9, 1, 0};
        task(a);
    }
}
