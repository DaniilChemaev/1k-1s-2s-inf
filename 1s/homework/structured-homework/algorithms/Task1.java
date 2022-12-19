// 01 Вводятся целые k, m. Вывести целые числа между k и m, которые делятся на 3.

import java.util.Scanner;

class Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int m = sc.nextInt();

		for (int i = k; i < m; i++){
			if (i % 3 == 0){
				System.out.print(i + " ");
			}
		}
	}
}