// 03 Найти количество максимумов в двумерном целочисленном массиве

class Task3 {
	
	public static void main(String[] args){
		int[][] l = {{1, 5, 3}, {9, 5, 9}};
		System.out.println(twoDemensionalArrayMax(l));
	}

	public static int twoDemensionalArrayMax(int[][] l) {
		int max = l[0][0];
		int countMax = 0;
		for (int i = 0; i < l.length; i++){  
			for (int j = 0; j < l[i].length; j++){  
				if (l[i][j] > max){
				max = l[i][j];
				countMax = 0;
			}
				if (l[i][j] == max){
				countMax += 1;
			}
		}
	}
		return countMax;
	}
}