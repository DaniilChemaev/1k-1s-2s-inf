public class LinearSearch{
	public static boolean linearSearch(int[] array, int number){
		boolean res = false;

		for (int i = 0; i < array.length; i++){
			if (array[i] == number){
				res = true;
				break;
			}
		}
		return res;
	}
}