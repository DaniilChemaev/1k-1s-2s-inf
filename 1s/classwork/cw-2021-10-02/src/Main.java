import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("#1");
        multiplyingTable();
        System.out.println("\n#2");
        degreesOfTwo();
    }

    public static void multiplyingTable() {
        int n = sc.nextInt();
        int[][] arr = new int[n][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = i * j;
            }
        }

        int count = 0;

        int lenLast = lenInt(arr[n - 1][9]);

//        System.out.println("len = " + len_lastI);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int lenCurrent = lenInt(arr[i][j]);
                System.out.print(arr[i][j]);
                count += 1;
                if (count == 9) {
                    System.out.println();
                    count = 0;
                } else {
                    for (int k = 0; k < lenLast - lenCurrent + 1; k++) {
                        System.out.print(" ");
                    }
                }

            }
        }
    }

    public static void degreesOfTwo() {
        int n = sc.nextInt();
        long[][] arr = new long[n][4];

        long num = 1;
        long nd;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                nd = num * 2;
                arr[i][j] = nd;
                num = nd;
            }
        }


        int lenLast = lenLong(arr[n - 1][3]);

        int count = 1;
        System.out.print(1);
        for (int k = 0; k < lenLast; k++) {
            System.out.print(" ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                int lenCurrent = lenLong(arr[i][j]);
                System.out.print(arr[i][j]);
                count += 1;
                if (count == 4) {
                    System.out.println();
                    count = 0;
                } else {
                    for (int k = 0; k < lenLast - lenCurrent + 1; k++) {
                        System.out.print(" ");
                    }
                }
            }
        }
    }

    public static int lenInt(int n) {
        int len = 1;
        while (n / 10 != 0) {
            len += 1;
            n /= 10;
        }
        return len;
    }

    public static int lenLong(long n) {
        int len = 1;
        while (n / 10 != 0) {
            len += 1;
            n /= 10;
        }
        return len;
    }

}

