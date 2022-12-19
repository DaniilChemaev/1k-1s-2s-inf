// 01 Проверить, что входная строка является записью целого числа. Решить с помощью регулярных выражений и без них.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerNumber {
    public static void main(String[] args){
        first();
        second();
    }

    public static void first() {
        String a = "100";
        String regex = "-?[1-9][0-9]*|0";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }

    public static void second() {
        String a = "100";
        boolean res = true;

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9'){
            } else {
                res = false;
            }
        
        }
        System.out.println(res);
    }
}
