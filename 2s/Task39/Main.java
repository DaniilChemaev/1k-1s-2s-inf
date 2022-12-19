public class Main {
    public static boolean isBST(int[] a) {
        boolean res = true;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] > a[2 * i + 1] || a[i] < a[2 * i + 2]) {
            } else {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {4, 2, 6, 1, 3, 5, 7};
        System.out.println(isBST(b));
    }
}
