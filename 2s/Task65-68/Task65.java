// 65. Запустить 3 потока, которые выводят числа от 1 до n

public class Task65 extends Thread {
    int n;

    public Task65(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        Task65 thread1 = new Task65(100000000);
        Task65 thread2 = new Task65(100000000);
        Task65 thread3 = new Task65(100000000);

        thread1.start();
//        Thread.sleep(2000);
        thread2.start();
//        Thread.sleep(2000);
        thread3.start();
    }
}
