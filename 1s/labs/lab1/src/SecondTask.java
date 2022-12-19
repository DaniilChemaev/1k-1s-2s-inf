public class SecondTask {
    public static void second(int n, int x) {
        double res = 0;
        for (int k = 1; k <= n; k++) {
            res += ((degree(n, k) + factorial(k)) / (degree(x + n, 2 * k)));
        }
        System.out.println(res);
    }

    private static double factorial(int n) {
        double res = 1;
        for (int i = 1; i < n + 1; i++) {
            res *= i;
        }
        return res;
    }

    private static double degree(int n, int k) {
        double res = 1;
        for (int i = 0; i < k; i++) {
            res *= n;
        }
        return res;
    }

}
