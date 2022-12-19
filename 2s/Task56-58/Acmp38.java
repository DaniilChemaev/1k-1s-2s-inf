import java.util.Scanner;

//!TODO переделать см. ссылку https://plusplusmustlive.blogspot.com/2019/12/38-2.html

public class Acmp38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstI = 0;
        int lastI = n - 1;

        // flag = true -> first player turn
        // flag = false -> second player turn
        boolean flag = true;
        while (firstI <= lastI) {
            if (flag) {
                if (arr[firstI] > arr[lastI]) {
                    p1 += arr[firstI];
                    firstI += 1;
                } else {
                    p1 += arr[lastI];
                    lastI -= 1;
                }
                flag = false;
            } else {
                if (arr[firstI] > arr[lastI]) {
                    p2 += arr[firstI];
                    firstI += 1;
                } else {
                    p2 += arr[lastI];
                    lastI -= 1;
                }
                flag = true;
            }

        }
        if (p1 > p2) {
            System.out.println(1);
        } else if (p2 > p1) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
