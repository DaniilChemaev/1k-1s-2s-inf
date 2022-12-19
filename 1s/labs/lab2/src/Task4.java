// 28.12.2021 ПЕРЕПИСЫВАЮ КР2
// ВАРИАНТ 1

public class Task4 {
    public static void main(String[] args) {
        String[] list = {"ma", "son", "sonata", "mama", "sona"};

        for (String pref : list) {
            for (String word : list) {
                boolean res = true;
                if (word.length() > pref.length()) {  // Проверяем то, что pref именно префикс, а не само слово word
                    for (int k = 0; k < pref.length(); k++) {  // Проходимся по началу слова и проверяем
                        if (word.charAt(k) != pref.charAt(k)) {
                            res = false;
                            break;
                        }
                    }
                    if (res) {
                        System.out.println(pref + " -- префикс слова " + word);
                    }
                }
            }
        }
    }
}

