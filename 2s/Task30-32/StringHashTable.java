import java.util.ArrayList;
import java.util.Arrays;

public class StringHashTable {
    // Сумма первых трех букв слова, не превышает 1000, не придумал ничего лучше, как создать массив, где индексом будет hash
    private final ArrayList<String>[] arrayOfStringList = new ArrayList[1000];

    public void put(String a) {
        int hash = countHash(a);
        ArrayList<String> list = new ArrayList<>();
        if (arrayOfStringList[hash] != null) {
            list = arrayOfStringList[hash];
        }

        list.add(a);
        arrayOfStringList[hash] = list;
    }

    public void remove(String a) {
        int hash = countHash(a);
        ArrayList<String> list = arrayOfStringList[hash];
        list.remove(a);
        arrayOfStringList[hash] = list;
    }

    public boolean find(String a) {
        int hash = countHash(a);
        ArrayList<String> list = arrayOfStringList[hash];
        return list.contains(a);
    }

    private int countHash(String word){
        return word.charAt(0) + word.charAt(1) + word.charAt(2);
    }
}
