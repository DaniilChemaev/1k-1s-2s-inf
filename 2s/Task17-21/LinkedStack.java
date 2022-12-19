public class LinkedStack<T> implements IStack<T> {
    private int size;
    private Elem head, end;


    public LinkedStack() {
        this.head = null;
        this.end = null;
        this.size = 0;
    }


    @Override
    public void push(T x) {
        if (this.size == 0) {
            this.head = new Elem(x, null);
            this.end = this.head;
            size++;
        } else {
            this.end.next = new Elem(x, null);
            this.end = this.end.next;
            size++;
        }
    }


    @Override
    public T pop() {
        T res = (T) this.end.value;
        Elem p = this.head;

        while (p.next.next != null) {
            p = p.next;
        }

        p.next = null;
        this.end = p;

        this.size--;
        return res;
    }


    @Override
    public boolean isEmpty() {
        return (this.size == 0);
    }


    @Override
    public String toString() {
        if (this.size == 0) {
            return "MyLinkedStack<>";
        }
        StringBuilder res = new StringBuilder("MyLinkedStack<");
        for (Elem<Object> p = this.head; p.next != null; p = p.next) {
            res.append(p.value).append(", ");
        }
        res.append(this.end.value).append(">");
        return res.toString();
    }
}
