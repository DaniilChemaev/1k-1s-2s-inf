// 08 Проверить, что во входной последовательности целых чисел существует ровно два четных по значению локальных максимума.

class Task8 {

	public static void main(String[] args){
		int[] list = {1, 2, 4, 2, 1, 4, 1};
		System.out.print(localMax(list));

	}

	public static boolean localMax(int[] list) {
		int n = 0;

        for (int i = 1; i < list.length - 1; i++) {
        	if (n < 3){
	        	if (list[i] % 2 == 0){
	        		if (list[i-1] < list[i] && list[i] > list[i+1]){
	        			n += 1;
	        			System.out.print(list[i]);
	        		}
	        	}
	        }
	        else {
	        	break;
	    	}
        }
        
        if (n == 2){
        	return true;
        }
        else {
        	return false;
        }
	}
}