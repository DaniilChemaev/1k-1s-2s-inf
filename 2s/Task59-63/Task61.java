/*
61. Вводится массив из расстояний от АЗС до точĸи А. Между точĸами точно < 400 ĸм.
    Вывести минимальное ĸоличество остановоĸ на АЗС, ĸоторое требуется для того,
    чтобы от точĸи А добраться до финальной точĸи Б (последний элемент массива).
 */

public class Task61 {
    public static int task(int[] a) {
        int res = 0;
        int kilomertres = 0;

        for (int i = 1; i < a.length; i++) {
            if (kilomertres + (a[i] - a[i - 1]) < 400) {
                kilomertres += a[i] - a[i - 1];
            } else {
                kilomertres = a[i] - a[i - 1];
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {0, 200, 350, 500, 700, 800, 1050, 1200};
        System.out.println(task(a));
    }
}
