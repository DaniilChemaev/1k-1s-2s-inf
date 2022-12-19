import java.util.Arrays;

public class MyIntArrayList implements MyIntList {

    private int[] array;
    private int capacity = 1000;
    private int size;


    public MyIntArrayList() {
        this.array = new int[this.capacity];
        this.size = 0;
    }


    private boolean checkForExtension() {
        if (this.size > this.capacity / 2) {
            this.capacity += this.capacity / 2;
            int[] array2 = new int[this.capacity];
            for (int i = 0; i < size; i++) {
                array2[i] = this.array[i];
            }
            this.array = array2;
            return true;
        } else {
            return false;
        }
    }


    public void add(int x) {
        this.array[this.size] = x;
        this.size += 1;
        this.checkForExtension();
    }


    /* TODO add Exception */
    public void add(int x, int i) throws IndexOutOfBoundsException {
//		try {
//			this.array[i] = x;
//		} catch (Exception e){
//			System.out.println(1);
//			e.printStackTrace();
//		}
//		this.checkForExtension();
        this.array[i] = x;
    }


    public int size() {
        return this.size;
    }


    public boolean isEmpty() {
        return this.size == 0;
    }


    public void clear() {
        this.size = 0;
    }


    public boolean remove(int x) {
        boolean res = false;
        for (int i = 0; i <= this.size; i++) {
            if (this.array[i] == x) {
                size -= 1;
                for (int j = i; j <= this.size; j++) {
                    this.array[j] = this.array[j + 1];
                }
                res = true;
                break;
            }
        }
        return res;
    }


    public int removeAll(int x) {
        int res = 0;
        for (int i = 0; i <= this.size; i++) {
            if (this.array[i] == x) {
                size -= 1;
                for (int j = i; j <= this.size; j++) {
                    this.array[j] = this.array[j + 1];
                }
                res += 1;
            }
        }
        return res;
    }


    public int[] toArray() {
        int[] res = new int[this.size];

        for (int i = 0; i < res.length; i++) {
            res[i] = this.array[i];
        }

        return res;
    }


    public void merge(MyIntList lst) {
        for (int i = 0; i < this.size; i++) {
            lst.add(this.array[i]);
        }
    }


    public boolean contains(int x) {
        boolean res = false;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == x) {
                res = true;
                break;
            }
        }
        return res;
    }


    public String toString() {
        if (this.size == 0) {
            return "MyIntArrayList<>";
        }
        StringBuilder res = new StringBuilder("MyIntArrayList<");
        for (int i = 0; i < size - 1; i++) {
            res.append(this.array[i] + ", ");
        }
        res.append(this.array[size - 1] + ">");
        return res.toString();
    }


    public static void main(String[] args) {

        MyIntList lst = new MyIntArrayList();
        MyIntList lst2 = new MyIntArrayList();

        lst.add(1);
        lst.add(2);
        lst.add(3);

        lst2.add(4);
        lst2.add(5);
        lst2.add(6);

        lst.merge(lst2);
        System.out.println(lst);

        lst.removeAll(2);
        System.out.println(lst);

        lst2.clear();

        System.out.println(lst2.contains(5));

    }

}