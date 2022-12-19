// 06. Проверить, что во введенном массиве целых чисел существует элемент, равный 0.

class Task6{
    
    public static void main(String[] args){
        int[] array = {1, 5, 7};

        System.out.println(checkZero(array));
    }

    public static boolean checkZero(int[] array){
        boolean res = false;
    	for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                res = true;
                break;
            }
    	}
    	return res;
	}
}
