// 67. Подсчитать сумму массива, разбив подсчет на m потоков (m вводится)

public class Task67 extends Thread {
    int arr[];
    int left;
    int right;
    int sum;

    public Task67(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    public void run() {
        for (int i = left; i < right; i++) {
            sum += arr[i];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m = 10;  // количество потоков
        int sum = 0;
        int left = 0;
        int right = arr.length / m;

        for (int i = 0; i < m; i++) {
            Task67 thread = new Task67(arr, left, right);
            thread.start();
            thread.join();
            sum += thread.sum;
            left = right;
            if (i + 2 == m) {  // Последний поток будет обрабатывать больше данных, если не делится нацело
                right = arr.length;
            } else {
                right += arr.length / m;
            }

        }
        System.out.println(sum);
    }
}