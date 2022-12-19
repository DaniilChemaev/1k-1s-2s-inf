// 68. Подсчитать для чисел от 1 до m, сколько времени идет подсчет суммы, который разбит на m потоков. Вывести: "1 поток : ... нсек, 2 потока: ... нсек, ... "

public class Task68 extends Thread {
    int arr[];
    int left;
    int right;
    int sum;

    public Task68(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    public void run() {
        for (int i = left; i < right; i++) {
            sum += arr[i];
        }
    }

    public static int[] generateArray(int m) {
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = m + 1;
        }

        return arr;
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 100000000;  // количество элементов в массиве
        int m = 1000;  // количество потоков и элементов в массиве
        int[] arr = generateArray(n);
        int sum = 0;
        int left = 0;
        int right = arr.length / m;

        for (int i = 0; i < m; i++) {

            Task68 thread = new Task68(arr, left, right);

            long lStartTime = System.nanoTime();

            thread.start();
            thread.join();

            long lEndTime = System.nanoTime();
            long output = lEndTime - lStartTime;
            System.out.println(i + 1 + " поток: " + output + " нсек");

            sum += thread.sum;
            left = right;
            if (i + 2 == m) {  // Последний поток будет обрабатывать больше данных, если не делится нацело
                right = arr.length;
            } else {
                right += arr.length / m;
            }
        }

        System.out.println("sum: " + sum);
    }
}