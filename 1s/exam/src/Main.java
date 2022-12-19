public class Main {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        String[][] array = {
                {"аааа", "бевн", "впр"},
                {"ииии", "баб", "впр"},
                {"уууу", "баб", "впр"},
                {"уууу", "баб", "впр"}
        };


        int j = 0;
        while (j < m) {
            for (int i = 0; i < n; i++) {
                System.out.println(array[i][j]);
            }
            j++;
        }
    }
}
