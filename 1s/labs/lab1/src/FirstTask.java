import java.util.Random;

public class FirstTask {
    public static void first(int n) {
//        int[] l = {131, 15, 1, 53};
        Random random = new Random();
        int[] l = new int[n];
        System.out.print("Массив: ");
        for (int i = 0; i < l.length; i++) {
            l[i] = random.nextInt(1000);
            System.out.print(l[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < l.length; i++) {
            int k = 10;
            boolean okNum = false;
            int num = l[i];
            while (l[i] / k != 0) {
                if ((num % 10 == 3) || (num % 10 == 5)) {
                    okNum = true;
                    break;
                } else {
                    num /= 10;
                    k *= 10;
                }
            }
            if (!okNum) {
                System.out.println(i + " element doesn't have 3 or 5 in it");
                break;
            } else {
                System.out.println("OK");
            }
        }
    }
}
