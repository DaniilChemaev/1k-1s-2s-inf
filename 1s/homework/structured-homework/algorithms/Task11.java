// 11 Вводится целое 2 < k < 9, затем вводится целое число n, которое можно интерпретировать как число в k-ичной системе счисления.
// Сконвертировать n в десятичную систему счисления.

class Task11 {

	public static void main(String[] args){
		int k = 2;  // система счисления
		int n = 101;  // число в этой системе счисления
		System.out.println(numSystemCalc(k, n));
	}

	public static int numSystemCalc(int k, int n) {
		int res = 0;
		int digits = countDigits(n);
		int kInDegree = 1;
		for (int i = 0; i < digits; i++){  
			if (i == 0){
				res += (n % 10);
				n /= 10;
			}
			else{
				res += (n % 10) * (k * kInDegree);
				kInDegree *= k;
				n /= 10;
			}
		}
		return res;
	}

	public static int countDigits(int n){  // Сколько цифр в числе
		int res = 0;

		while (n > 0){
			n /= 10;
			res += 1;
		}

		return res;
	}
}