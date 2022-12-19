import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeFormat {
    public static void main(String[] args) {
        String a = "00:00";
        String regex = "((0?[0-9])|(1[0-9])|(2[0-3])):[0-5][0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }
}
