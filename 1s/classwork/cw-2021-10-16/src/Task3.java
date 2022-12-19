/*
	Task3: convert LONG n in 10-counting system to x in k-counting system
*/

public class Task3{
	public static void main(String[] args){
		int k = 5;
		long[] n = {3, 0, 0};
		long x = 0;

		// поиск-максимальной степени
		long b = 1L;
		int maxDeg = 0;
		long place = 1;

		while (b <= n){
			b = b * k;
			maxDeg += 1;
			place *= 10;
		}
		b /= k;
		maxDeg -= 1;
		place /= 10;
		System.out.println(maxDeg);
		System.out.println(b);


		for (int i = maxDeg; i >= 0 && n > 0; i--) {
			System.out.println("Counting digit for position: " + i);
			// поиск максимальной цифры при текущей степени
			int d = 1;
			while (d * b <= n){
				d += 1;
			}
			d -= 1;
			System.out.println("Digit found: " + d);
			// накопить/сохранить получившуюся часть
			x = x + place * d;
			System.out.println("Current number: " + x);
			// перейти к числу n - накопленное
			n = n - b * d;
			// уменьшая разрядность 
			b /= k;
			place /= 10;

		}
	}
}