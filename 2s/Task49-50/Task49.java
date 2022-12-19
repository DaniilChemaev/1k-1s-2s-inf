import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the line:");
        String line = sc.nextLine().toUpperCase();

        Map<Character, Integer> statistics = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (statistics.containsKey(line.charAt(i))) {
                statistics.put(currentChar, statistics.get(currentChar) + 1);
            } else {
                statistics.put(currentChar, 1);
            }
        }
        System.out.println(statistics);
    }
}
