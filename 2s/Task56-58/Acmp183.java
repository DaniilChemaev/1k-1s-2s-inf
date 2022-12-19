import java.util.Scanner;


// !TODO Не проходит 8 тест. Runtime error
public class Acmp183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int P = sc.nextInt();

        int[] gp = new int[K + 1];
        if (K > 2 || P != 1) {
            gp[2] = 1;
            for (int i = 3; i < gp.length; i++) {
                if (i % 2 != 0) {
                    gp[i] += gp[i - 1] % P;
                } else {
                    gp[i] += (gp[i - 1] + gp[i / 2]) % P;
                }
            }
            System.out.println(gp[K]);
        } else {
            System.out.println(0);
        }
    }
}
