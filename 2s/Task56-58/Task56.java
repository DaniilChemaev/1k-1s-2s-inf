// 56. Решить задачу поиска максимальной длины возрастающей подпоследовательности через динамическое программирование

public class Task56 {
    public static int run(int[] a) {
        int[] dp = new int[a.length];
        if (a.length == 0) {
            return 0;
        }
        dp[0] = 1;
        int res = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
                if (res < dp[j]) {
                    res = dp[j];
                }
            }
        }
        return res;
    }
}
