import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert URL-get request:");

        // https://getrequest.com/index.php?thing=Стул&section=Мебель
        String line = sc.nextLine();
        
        System.out.println(getParameters(line));
    }

    public static Map<String, String> getParameters(String l) {
        String[] line = l.split("\\?");

        String[] params = line[line.length - 1].split("&");

        Map<String, String> parameters = new HashMap<>();
        for (String param : params) {
            String[] currentParams = param.split("=");
            parameters.put(currentParams[0], currentParams[1]);
        }
        return parameters;
    }
}