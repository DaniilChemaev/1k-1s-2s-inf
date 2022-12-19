
// 04 Реализуйте любую сортировку

class Task4 {
    
    public static void main(String[] args){
        int[] l = {1, 5, 3, 9, 5, 9};
        printArray(bubbleSort(l));
    }

    public static int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
