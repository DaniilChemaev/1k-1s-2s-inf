import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Actors {
    List<String> id;

    public void main() throws FileNotFoundException {
        String path = "data/actors.txt";
        FileReader file = new FileReader(path);
        Scanner scanner = new Scanner(file);
        int i = 0;
        while (scanner.hasNextLine()) {
            id.add(scanner.nextLine());
            i++;
        }
        System.out.println(id);
    }


}
