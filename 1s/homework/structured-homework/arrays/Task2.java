// 02 Найти максимум двумерного целочисленного массива

class Task2 {
	
	public static void main(String[] args){
		int[][] l = {{1, 5, 3}, {4, 5, 9}};
		System.out.println(twoDemensionalArrayMax(l));
	}

	public static int twoDemensionalArrayMax(int[][] l) {
		int max = l[0][0];
		for (int i = 0; i < l.length; i++){  
			for (int j = 0; j < l[i].length; j++){  
				if (l[i][j] > max){
				max = l[i][j];
			}
		}
	}
		return max;
	}
}