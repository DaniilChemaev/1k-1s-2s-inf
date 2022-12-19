public class Task2 {
    public static void task2() {
        int n = 3;
        int m = 3;
        char[][] l = new char[n][m];

        l = new char[][]{
                {'a', 'd', 'w', 'w'},
                {'e', 'd', 'd', 'd'},
                {'i', 'j', 'k', 'l'}
        };

        String word = "dw";

        boolean resAcross = false;

        // Горизонтальная проверка
        for (int i = 0; i < l.length; i++) {
            int len = 0;
            System.out.println("i");
            for (int j = 0; j < l[i].length; j++) {
//                System.out.println(len);
                if (l[i][j] == word.charAt(len)) {
                    len += 1;
                    if (len == word.length()) {
                        resAcross = true;
                        break;
                    }
                } else {
                    len = 0;
                }
            }
        }
        System.out.println(resAcross);
    }
}

//        // Вертикальная проверка
//        for (int i = 0; i < l.length - word.length(); i++) {
//            System.out.println(l.length - word.length());
//            int len = 0;
//            for (int j = 0; j < l[i].length; j++) {
//                if (len == word.length()) {
//                    resAcross = true;
//                }
//                if (l[i][j] == word.charAt(len)) {
//                    len++;
//                } else {
//                    len = 0;
//                    break;
//                }
//            }
//        }

