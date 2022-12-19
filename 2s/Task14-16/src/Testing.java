import ru.kpfu.itis.group108.MyArrayList;
import ru.kpfu.itis.group108.MyLinkedList;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {

        MyArrayList<String> list1 = new MyArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();

        list1.add("str1");
        list1.add("strToRemove1");
        list1.add("strToRemove1");
        list1.add("strToRemove2");
        list1.add("strToRemove2");
        System.out.println(list1);
        list1.add("str2", 1);
        System.out.println("size= " + list1.size());
        System.out.println("isEmpty= " + list1.isEmpty());
        list1.remove("strToRemove1");
        list1.removeAll("strToRemove2");
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println("contains: " + list1.contains("strToRemove2"));
        list1.clear();
        System.out.println(list1);

        System.out.println();

        list2.add(0);
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(2);
        System.out.println(list2);
        list2.add(2, 1);
        System.out.println("size= " + list2.size());
        System.out.println("isEmpty= " + list2.isEmpty());
        list2.remove(1);
        list2.removeAll(2);
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println("contains: " + list2.contains(2));
        list2.clear();
        System.out.println(list2);

        System.out.println("\nMerging:");
        list1.add("str1");
        list1.add("strToRemove1");
        list1.add("strToRemove1");
        list1.add("strToRemove2");
        list1.add("strToRemove2");
        list2.add(0);
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.merge(list1);
        System.out.println(list1);

        // #######################################################################################

        MyLinkedList<String> list3 = new MyLinkedList<>();
        MyLinkedList<Integer> list4 = new MyLinkedList<>();

        list3.add("str1");
        list3.add("strToRemove1");
        list3.add("strToRemove1");
        list3.add("strToRemove2");
        list3.add("strToRemove2");
        System.out.println(list3);
        list3.add("str2", 1);
        System.out.println("size= " + list3.size());
        System.out.println("isEmpty= " + list3.isEmpty());
        list3.remove("strToRemove1");
        list3.removeAll("strToRemove2");
        System.out.println(Arrays.toString(list3.toArray()));
        System.out.println("contains: " + list3.contains("strToRemove2"));
        list3.clear();
        System.out.println(list3);

        System.out.println();

        list4.add(0);
        list4.add(1);
        list4.add(1);
        list4.add(2);
        list4.add(2);
        System.out.println(list4);
        list4.add(2, 1);
        System.out.println("size= " + list4.size());
        System.out.println("isEmpty= " + list4.isEmpty());
        list4.remove(1);
        list4.removeAll(2);
        System.out.println(Arrays.toString(list4.toArray()));
        System.out.println("contains: " + list4.contains(2));
        list4.clear();
        System.out.println(list4);

        System.out.println("\nMerging:");
        list3.add("str1");
        list3.add("strToRemove1");
        list3.add("strToRemove1");
        list3.add("strToRemove2");
        list3.add("strToRemove2");
        list4.add(0);
        list4.add(1);
        list4.add(1);
        list4.add(2);
        list4.add(2);
        list3.merge(list4);
        System.out.println(list4);


        // #######################################################################################

        System.out.println("\nMerging LinkedList and ArrayList:");
        list1.merge(list4);
        System.out.println(list4);
    }
}
