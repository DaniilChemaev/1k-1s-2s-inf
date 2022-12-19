import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("n");
        list.add("nnn");
        list.add("nn");
        list.add("nnnnnnn");
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());

        System.out.println(list);
    }
}
