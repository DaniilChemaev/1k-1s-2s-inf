/*
04 Для введенного целого n подсчитать
  */

class Task4 {

	public static void main(String[] args){
		int n = 3;
        double sum = 0;

        for (int m = 1; m < n; m++) {
            double m1_fac = getFactorial(m-1);
            double m2_fac = getFactorial(2*m);
            sum += (m1_fac * m1_fac)/(m2_fac);
        }
        System.out.println(sum);
	}

	public static double getFactorial(int n) {
		double res = 1;
        for (double i = 1; i <= n; i++) {
            res = res * i;
        }

        return res;
	}
}