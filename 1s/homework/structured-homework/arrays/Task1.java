// 01 Найти максимум одномерного целочисленного массива

class Task1 {

	public static void main(String[] args){
		int[] l = {1, 2, 5, 4, 3};
		System.out.println(arrayMax(l));
	}

	public static int arrayMax(int[] l) {
		int max = l[0];
		for (int i = 1; i < l.length; i++){  
			if (l[i] > max){
				max = l[i];
			}
		}
		return max;
	}
}