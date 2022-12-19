// 10 Найдите сумму 1+11+111+1111+...1111...1, если последнее слагаемое состоит из n цифр

class Task10 {

	public static void main(String[] args){
		int n = 2;
		System.out.print(algorithm(n));
	}

	public static int algorithm(int n) {
		int res = 1;
		int currentNumber = 1;
		for (int i = 1; i < n; i++){
			currentNumber += 1*(10*i);
			res += currentNumber;
		}
		return res;
	}
}