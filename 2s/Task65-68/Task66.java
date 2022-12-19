// 66. Подсчитать сумму массива, разбив подсчет на 2 потока

public class Task66 extends Thread {
    int arr[];
    int left;
    int right;
    int sum;

    public Task66(int[] arr, int left, int right) {
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
        Task66 thread1 = new Task66(arr, 0, arr.length / 2);
        Task66 thread2 = new Task66(arr, arr.length / 2, arr.length);

        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();

        System.out.println(thread1.sum + thread2.sum);
    }
}