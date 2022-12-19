import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntegerNumber {
    public static void main(String[] args) {
        String a = "100";
        String regex = "-?[1-9][0-9]*|0";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(a);
        System.out.println(m.matches());
    }
}
