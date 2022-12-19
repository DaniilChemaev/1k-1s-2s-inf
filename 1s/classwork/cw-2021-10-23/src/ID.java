import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ID {
    public static void main(String[] args) {
        second();
    }

    public static void first() {
        String a = "_asdasd";
        String regex = "[A-Za-z_][A-Za-z_0-9]*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }

    public static void second() {
        String a = "a%";

        boolean res = false;
        // Проверка 1 символа
        if (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z' ||
                a.charAt(0) == '_' ||
                a.charAt(0) >= 'a' && a.charAt(0) <= 'z') {
            res = true;
        }
//        System.out.println(a.length());

        // Проверка остальных символов, если они есть
        if (a.length() > 1) {
            res = false;
            for (int i = 1; i < a.length() - 1; i++) {
                if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' ||
                        a.charAt(i) >= 'a' && a.charAt(i) <= 'z' ||
                        a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                } else {
                    res = false;
                }
            }
        }
        System.out.println(res);
    }
}
