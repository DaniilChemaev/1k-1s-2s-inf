// 02 Подчитать квадратный корень числа x с точностью до 6 знака после запятой. Не использовать Math.

class Task2{

	public static void main(String[] args){
		System.out.println(calcRoot(3));
	}

	public static double calcRoot(int n) {
	    double l = 0;  // левая граница
		double r = n;  // правая граница
		double m;

		while (r - l > 1e-6){ // бинарный поиск (сужаем диапазон до 6 знака после запятой)
		    m = l + (r - l) / 2;
		    if (m * m < n){
		    	l = m;
		 }
			else {
				r = m;
			}
		}
	    return l;
	}
}