// 09 Вводится число n. Построить число m, которое будет содержать только нечетные цифры числа n (в сохраненном порядке).
// Например, для n = 123456, m = 135.

class Task9 {

	public static void main(String[] args){
		int n = 123456;
		int m = onlyOdd(n);
		System.out.print(m);
	}

	public static int onlyOdd(int n) {
		int m = 0;
		int pos = 1;

		int digit;

		while (n > 0){
			digit = n % 10;
			if (digit % 2 != 0){
				m += digit * pos;
				pos *= 10;
			}
			n /= 10;
		}
		return m;
	}
}