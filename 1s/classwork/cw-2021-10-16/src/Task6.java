/*
	Task6:
	input: int(n)
	consist only 2 even digits
*/

import java.util.Scanner;

public class Task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0;

		while (n > 0 && even < 3){
			if (n % 2 == 0){
				even += 1;
			}
			n /= 10;
		} 

		if (even == 2){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
}