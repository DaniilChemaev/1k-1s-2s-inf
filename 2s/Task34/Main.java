import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("HASHSET: ");
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("Method add() " + hashSet.add("a"));
        System.out.println("Method add() " + hashSet.add("b"));
        System.out.println("Method add() " + hashSet.add("c"));
        System.out.println("Method remove() " + hashSet.remove("b"));
        System.out.println("Method contains() " + hashSet.contains("b"));
        System.out.println("Method size() " + hashSet.size());
        System.out.println("Method isEmpty() " + hashSet.isEmpty());
        System.out.println("Method clone() " + hashSet.clone());
        hashSet.clear();
        System.out.println("Method clear() " + true);

        System.out.println();

        System.out.println("HASHMAP: ");
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println("Method put() " + hashMap.put("a", "a"));
        System.out.println("Method put() " + hashMap.put("b", "b"));
        System.out.println("Method put() " + hashMap.put("c", "c"));
        System.out.println("Method get() " + hashMap.get("c"));
        System.out.println("Method remove() " + hashMap.remove("b"));
        System.out.println("Method containsKey() " + hashMap.containsKey("b"));
        System.out.println("Method containsValue() " + hashMap.containsValue("b"));
        System.out.println("Method keySet() " + hashMap.keySet());
        System.out.println("Method values() " + hashMap.values());
        System.out.println("Method replace() " + hashMap.replace("a", "a", "b"));
        System.out.println("Method size() " + hashMap.size());
        System.out.println("Method isEmpty() " + hashMap.isEmpty());
        System.out.println("Method clone() " + hashMap.clone());
        System.out.println("Method merge() " + hashMap.merge("a", "a", String::concat));
        hashMap.clear();
        System.out.println("Method clear() " + true);

        System.out.println();

        System.out.println("TREESET: ");
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("Method add() " + treeSet.add("a"));
        System.out.println("Method add() " + treeSet.add("b"));
        System.out.println("Method add() " + treeSet.add("c"));
        System.out.println("Method headSet() " + treeSet.headSet("cc"));
        System.out.println("Method subSet() " + treeSet.subSet("a", "aa"));
        System.out.println();
        System.out.println("Method remove() " + treeSet.remove("b"));
        System.out.println("Method contains() " + treeSet.contains("b"));
        System.out.println("Method size() " + treeSet.size());
        System.out.println("Method isEmpty() " + treeSet.isEmpty());
        System.out.println("Method clone() " + treeSet.clone());
        treeSet.clear();
        System.out.println("Method clear() " + true);

        System.out.println();

        System.out.println("ARRAYLIST: ");
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Method add() " + arrayList.add("a"));
        System.out.println("Method add() " + arrayList.add("b"));
        System.out.println("Method add() " + arrayList.add("c"));
        System.out.println("Method remove() " + arrayList.remove("b"));
        System.out.println("Method contains() " + arrayList.contains("b"));
        System.out.println("Method size() " + arrayList.size());
        System.out.println("Method isEmpty() " + arrayList.isEmpty());
        System.out.println("Method clone() " + arrayList.clone());
        arrayList.clear();
        System.out.println("Method clear() " + true);

        System.out.println();

        System.out.println("LINKEDLIST: ");
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Method add() " + linkedList.add("a"));
        System.out.println("Method add() " + linkedList.add("b"));
        System.out.println("Method add() " + linkedList.add("c"));
        System.out.println("Method getFirst() " + linkedList.getFirst());
        System.out.println("Method getLast() " + linkedList.getLast());
        System.out.println("Method indexOf() " + linkedList.indexOf("a"));
        System.out.println("Method remove() " + linkedList.remove("b"));
        System.out.println("Method contains() " + linkedList.contains("b"));
        System.out.println("Method size() " + linkedList.size());
        System.out.println("Method isEmpty() " + linkedList.isEmpty());
        System.out.println("Method clone() " + linkedList.clone());
        linkedList.clear();
        System.out.println("Method clear() " + true);

    }

}
