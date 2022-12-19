import static java.lang.Math.abs;

/*
1. Метод выводит из символов равнобедренный треугольник с высотой n
n = 3
  1
 111
11111

2. Метод equals, который сравнивает 2 массива целых чисел (true/false)

3. Метод toString, который превращает массив чисел в строку

4. Метод count(s, c), считает количество упоминаний символа c в строке s

5. Метод, расчитывающий расстояние Левенштейна между 2мя строками одной длины:

aabca
aabad
0+0+0+2+3 = 5 (расстояние Левенштейна - сумма модулей разницы).
(берется модуль разницы)

6. Расстояние Евклида между 2мя массивами (векторы из n элементов)

1 3 5
1 2 7

расстояние = корень((1 - 1)^2 + (3 - 2)^2 + (5 - 7)^2)

7. Метод, рассчитывающий меру Жаккара между 2мя векторами

K = c / (a + b - c)

c - количество общих элементов в массивах
a - количество элементов в 1 массиве
b - количество элементов в 2 массиве

8. https://www.youtube.com/watch?v=w-d56xqA32c, мера Дайса (Сьёренсена) - написать метод, который ее считает.
 */

public class Main {
    public static void main(String[] args) {
        // 1
//        triangle(10);

        // 2
//        int[] a = {1, 2, 3};
//        int[] b = {1, 2, 3};
//        System.out.println(equals(a, b));

        // 3
//        int[] string = {1, 2, 3, 4, 5};
//        System.out.println(toString(string));

        // 4
//        String s = "aacc";
//        char c = 'a';
//        count(s, c);

        // 5
//        String a = "aabca";
//        String b = "aabad";
//        levenstein(a, b);

        // 6
//        int[] a = {1, 3, 5};
//        int[] b = {1, 2, 7};
//
//        euclid(a, b);

        // 7
//        int[] a = {1, 3, 2};
//        int[] b = {1, 2, 7};
//
//        jaccard(a, b);


    }

    public static void triangle(int n) {
        int a = 1;
        int spaces = n - 1;
        int lastL = n * 2 - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces -= 1;
            for (int j = 0; j < a; j++) {
                System.out.print(1);
            }
            System.out.print(" ");
            System.out.println();
            a += 2;
        }
    }

    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static String toString(int[] n) {
        String res = "";
        for (int j : n) {
            res += j;
        }
        return res;
    }

    public static int count(String s, char c) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                res += 1;
        }
        return res;
    }

    public static void levenstein(String a, String b) {
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            res += abs(a.charAt(i) - b.charAt(i));
        }
        System.out.println(res);
    }

    public static void euclid(int[] a, int[] b) {
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            res += (a[i] - b[i]) * ((a[i] - b[i]));
        }
        System.out.println(Math.sqrt(res));
    }

    public static void jaccard(int[] a, int[] b) {
        double c = 0;

        for (int j : a) {
            for (int k : b) {
                if (j == k) {
                    c += 1;
                }
            }
        }

        double res = c / (a.length + b.length - c);
        System.out.println(res);
    }
}




