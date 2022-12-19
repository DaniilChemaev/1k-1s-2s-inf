// 07 Локальным максимумом в последовательности назовем элемент, который больше предыдущего и следующего (если они есть).
// Проверить, что во входной последовательности существует четный по значению локальный максимум.

class Task7 {

	public static void main(String[] args){
		int[] list = {1, 2, 4, 2, 1};
		System.out.print(localMax(list));

	}

	public static boolean localMax(int[] list) {
		boolean res = false;
        for (int i = 1; i < list.length - 1; i++) {
        	if (list[i] % 2 == 0){
        		if (list[i-1] < list[i] && list[i] > list[i+1]){
        			res = true;
        		}
        	}
        }
        return res;
	}
}