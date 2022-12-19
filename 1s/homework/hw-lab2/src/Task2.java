public class Task2 {
    public static void task2() {
        int n = 3;
        int m = 3;
        char[][] l = new char[n][m];

        l = new char[][]{
                {'a', 'b', 'c', 'd'},
                {'b', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'}
        };

        String word = "ab";

        boolean resAcross = false;
        boolean resDown = false;

        // Горизонтальная проверка
        mainLoop:
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[i].length - word.length() + 1; j++) {
                if (l[i][j] == word.charAt(0)) {
                    for (int k = 1; k < word.length(); k++) {
                        if (l[i][j + k] == word.charAt(k)) {
                            resAcross = true;
                        } else {
                            resAcross = false;
                            break;
                        }
                    }
                }
                if (resAcross) {
                    break mainLoop;
                }
            }
        }

        // Вертикальная проверка
        mainLoop:
        for (int i = 0; i < l.length - word.length() + 1; i++) {
            for (int j = 0; j < l[i].length; j++) {
                if (l[i][j] == word.charAt(0)) {
                    for (int k = 1; k < word.length(); k++) {
                        if (l[i + k][j] == word.charAt(k)) {
                            resDown = true;
                        } else {
                            resDown = false;
                            break;
                        }
                    }
                }
                if (resDown) {
                    break mainLoop;
                }
            }
        }

        System.out.println(resAcross);
        System.out.println(resDown);
    }
}
