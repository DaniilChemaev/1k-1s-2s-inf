public class MyIntLinkedList implements MyIntList {

    private int size;
    private Elem head, end;


    public MyIntLinkedList() {
        this.head = null;
        this.end = null;
        this.size = 0;
    }


    public void add(int x) {
        if (this.size == 0) {
            this.head = new Elem(x, null);
            this.end = this.head;
        } else {
            this.end.next = new Elem(x, null);
            this.end = this.end.next;
        }
        this.size += 1;
    }


    /* TODO add Exception */
    public void add(int x, int i) {
        Elem newNode = new Elem(x, null);

        Elem p = this.head;

        for (int j = 0; j < this.size; j++) {
            if (j + 1 == i) {
                Elem next = p.next;  // Элемент, на который должен будет указывать новый
                p.next = newNode;  // Элемент, который указывает на новый
                newNode.next = next;  // На что указывает новый элемент
                p = p.next;
                this.size += 1;
                break;
            } else {
                p = p.next;
            }
        }
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

        Elem p = this.head;
        boolean res = false;

        if (this.size == 0) {
            return false;
        }

        while (p.next != null) {
            if (p.next.value == x) {
                if (p.next.next == null) {
                    p.next = null;
                    this.size -= 1;
                    break;
                } else {
                    p.next = p.next.next;
                    res = true;
                    p = p.next;
                    this.size -= 1;
                    break;
                }

            } else {
                p = p.next;
            }
        }
        return res;
    }

    public int removeAll(int x) {

        Elem p = this.head;
        int res = 0;

        if (this.size == 0) {
            return 0;
        }

        while (p.next != null) {
            if (p.next.value == x) {
                if (p.next.next == null) {
                    p.next = null;
                    this.size -= 1;
                    res += 1;
                    break;
                } else {
                    p.next = p.next.next;
                    res += 1;
                    p = p.next;
                    this.size -= 1;
                }

            } else {
                p = p.next;
            }
        }
        return res;
    }

    public int[] toArray() {
        Elem p = this.head;

        int[] res = new int[this.size];
        int i = 0;

        while (p.next != null) {
            res[i] = p.value;
            i += 1;
            p = p.next;
        }

        return res;
    }

    public void merge(MyIntList lst) {
        Elem p = head;
        while (p.next != null) {
            lst.add(p.value);
            p = p.next;
        }
    }

    public boolean contains(int x) {
        boolean res = false;
        Elem p = head;
        while (p.next != null) {
            if (p.value == x) {
                res = true;
                break;
            } else {
                p = p.next;
            }
        }
        return res;
    }


    @Override
    public String toString() {
        if (this.size == 0) {
            return "MyIntLinkedList<>";
        }
        StringBuilder res = new StringBuilder("MyIntLinkedList<");
        for (Elem p = this.head; p.next != null; p = p.next) {
            res.append(p.value + ", ");
        }
        res.append(this.end.value + ">");
        return res.toString();
    }


    public static void main(String[] args) {

        MyIntList lst = new MyIntLinkedList();
        System.out.println(lst);
        lst.add(1);
        System.out.println(lst);
        lst.add(2);
        lst.add(4);
        lst.add(3);
        lst.add(3);
        lst.add(3);
        lst.add(5, 1);
        System.out.println(lst);

        lst.removeAll(3);
        System.out.println(lst);

        System.out.println(lst.toArray());
    }
}