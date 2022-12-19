// 07 Проверить, что во введенном массиве все элементы четные и положительные.


class Task7{
    
    public static void main(String[] args){
        int[] array = {2, 4, 6};

        System.out.println(checkEvenAndPositive(array));
    }

    public static boolean checkEvenAndPositive(int[] array){
        boolean res = true;
    	for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0 || array[i] <= 0){
                res = false;
                break;
            }
    	}
    	return res;
	}
}
