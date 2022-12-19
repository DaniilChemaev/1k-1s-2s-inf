import java.util.Random;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int n = 10000;
		int[] list1 = new int[n];
		int[] list2 = new int[n];

		Random random = new Random();

		for (int i = 0; i < list1.length; i++){
			list1[i] = random.nextInt(10000);
			list2[i] = list1[i];
		}

		int number = random.nextInt(10000);

		long nanoTimeLinearSearch1 = System.nanoTime();
		System.out.println(LinearSearch.linearSearch(list1, number));
		long nanoTimeLinearSearch2 = System.nanoTime();
		System.out.println(nanoTimeLinearSearch2 - nanoTimeLinearSearch1 + " nanoseconds took 1 algorithm");

		long nanoTimeSecondAlgorithm1 = System.nanoTime();
		Arrays.sort(list1);
		System.out.println(BinarySearch.binarySearch(list1, number));
		long nanoTimeSecondAlgorithm2 = System.nanoTime();
		System.out.println(nanoTimeSecondAlgorithm2 - nanoTimeSecondAlgorithm1 + " nanoseconds took 2 algorithm");


		long nanoTimeThirdAlgorithm1 = System.nanoTime();
		list2 = BubbleSort.bubbleSort(list2);
		System.out.println(BinarySearch.binarySearch(list2, number));
		long nanoTimeThirdAlgorithm2 = System.nanoTime();
		System.out.println(nanoTimeThirdAlgorithm2 - nanoTimeThirdAlgorithm1 + " nanoseconds took 3 algorithm");

		// for (int i = 0; i < list.length; i++){
		// 	System.out.println(list[i]);
		// }
		

	}
}