import java.util.Scanner;


class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int stars = 1;
        int space = (size * 2) + 1;
        for (int j = 1; j < (size - 1); j++) {
            for (int k = 0; k < space; k++)
                System.out.print(" ");

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            space -= 1;
        }
        for (int j = 1; j < (size / 2 - 1); j++) {
            for (int k = 0; k < space; k++)
                System.out.print(" ");

            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
            space -= 1;
        }
    }
}

//class Circle {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("   ");
//    }
//}