public class BinarySearch{
	public static boolean binarySearch(int[] array, int number) {
		
    boolean res = false;
    int low = 0;
    int high = array.length;

    while (low <= high) {
        int mid = (low + high) / 2;
        // System.out.println(low + " low");
        // System.out.println(high + " high");
        // System.out.println(array[mid] + " array[mid]");


        if (array[mid] < number) {
            low = mid + 1;
        } else if (array[mid] > number) {
            high = mid - 1;
        } else if (array[mid] == number) {
            res = true;
            break;
        }
    }
    return res;
}

}	