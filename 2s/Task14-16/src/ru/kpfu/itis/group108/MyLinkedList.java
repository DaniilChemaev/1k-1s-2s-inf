package ru.kpfu.itis.group108;


public class MyLinkedList<T> implements MyList<T> {

    private int size;
    private Elem<Object> head;
    private Elem<Object> end;


    public MyLinkedList() {
        this.head = null;
        this.end = null;
        this.size = 0;
    }


    public void add(T x) {
        if (this.size == 0) {
            this.head = new Elem<>(x, null);
            this.end = this.head;
        } else {
            this.end.next = new Elem<>(x, null);
            this.end = this.end.next;
        }
        this.size += 1;
    }


    /* TODO add Exception */
    public void add(T x, int i) {
        Elem<Object> newNode = new Elem<>(x, null);

        Elem<Object> p = this.head;

        for (int j = 0; j < this.size; j++) {
            if (j + 1 == i) {
                Elem<Object> next = p.next;  // Элемент, на который должен будет указывать новый
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


    public boolean remove(T x) {

        Elem<Object> p = this.head;
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


    public int removeAll(T x) {

        Elem<Object> p = this.head;
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


    public Object[] toArray() {
        Elem<Object> p = this.head;

        Object[] res = new Object[this.size];
        int i = 0;

        while (p.next != null) {
            res[i] = p.value;
            i += 1;
            p = p.next;
        }

        return res;
    }


    public void merge(MyList lst) {
        Elem<Object> p = head;
        while (p.next != null) {
            lst.add(p.value);
            p = p.next;
        }
    }


    public boolean contains(T x) {
        boolean res = false;
        Elem<Object> p = head;
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
            return "MyLinkedList<>";
        }
        StringBuilder res = new StringBuilder("MyLinkedList<");
        for (Elem<Object> p = this.head; p.next != null; p = p.next) {
            res.append(p.value).append(", ");
        }
        res.append(this.end.value).append(">");
        return res.toString();
    }


    public static void main(String[] args) {

        MyList lst = new MyLinkedList();
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