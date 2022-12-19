// 63. Решить задачу поисĸа минимального ĸоличества монет, ĸоторое требуется для того, чтобы набрать сумму N.
// Решить через жадный алгоритм, гарантируется, что монетная система позволяет использовать жадный алгоритм.

public class Task63 {
    public static void task(int value) {
        int[] coins = {20, 10, 5, 2, 1};
        int[] timesGrabbed = new int[coins.length];
        while (value > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (value - coins[i] >= 0) {
                    value -= coins[i];
                    timesGrabbed[i] += 1;
                    break;
                }
            }
        }
        for (int i = 0; i < timesGrabbed.length; i++) {
            System.out.println(coins[i] + ": " + timesGrabbed[i] + " раз");
        }
    }

    public static void main(String[] args) {
        int value = 15784 ;
        task(value);
    }
}
