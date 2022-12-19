public class LinkedQueue<T> implements IQueue<T> {
    private int size;
    private Elem head, end;


    public LinkedQueue() {
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
        T res = (T) this.head.value;
        head = head.next;
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
            return "MyLinkedQueue<>";
        }
        StringBuilder res = new StringBuilder("MyLinkedQueue<");
        for (Elem<Object> p = this.head; p.next != null; p = p.next) {
            res.append(p.value).append(", ");
        }
        res.append(this.end.value).append(">");
        return res.toString();
    }
}
