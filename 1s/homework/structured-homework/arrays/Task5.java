// 05 Вводятся два массива, представляющих собой набор цифр числа. Выполните сложение этих чисел.
// Использовать только массивы (без строк, специализированных объектов и др.).

class Task5 {
    
    public static void main(String[] args){
        int[] l1 = {1, 5, 7};
        int[] l2 = {2, 5, 7};

        printArray(arraySum(l1, l2));
    }

    public static int[] arraySum(int[] l1, int[] l2){
    	int[] res = new int[l1.length + 1];
    	for (int i = l1.length - 1; i >= 0; i--){
    		res[i + 1] += (l1[i] + l2[i]) % 10;
    		res[i] += (res[i + 1] + l1[i] + l2[i]) / 10;
    	}
    	return res;
	}


    public static void printArray(int[] array){
    	if (array[0] == 0){
    		for (int i = 1; i < array.length; i++){
            	System.out.print(array[i] + " ");
        	}
    	}
    	else{
    		for (int i = 0; i < array.length; i++){
         		System.out.print(array[i] + " ");
        	}
    	}
        
    }
}
