package acmp;
//  Требуется сложить два целых числа А и В.
//Входные данные
//
//В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.
//Выходные данные
//
//В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.

import java.util.Scanner;

public class acmp_0001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] list = line.split(" ");
        int sum = 0;
        for (String s : list) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
