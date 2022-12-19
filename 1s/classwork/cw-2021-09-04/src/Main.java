import java.util.Scanner;

public class Main {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += sc.nextInt();
//        }
//        System.out.println(sum);

        // 3
        System.out.print("Введите x: ");
        int x = sc.nextInt();
        System.out.print("Введите y: ");
        int y = sc.nextInt();

        boolean first = (square(x)) + (square(y - 2)) <= 4;
        boolean second = (square(x)) + (square(y)) <= 16 && x > 0 && y > 0;
        boolean third = y < 0 && x > 0 && (square(x)) + (square(y)) <= 16 && (square(x)) + (square(y + 2)) >= 4;

        if (first || second || third) {
            System.out.println("Входит");
        } else {
            System.out.println("Не входит");
        }
    }
}
