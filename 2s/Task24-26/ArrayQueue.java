public class ArrayQueue<T> implements IQueue<T> {
    private T[] queueArray;
    private int capacity = 1000;
    private int size;
    private int head;
    private int tail;


    public ArrayQueue() {
        this.queueArray = (T[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
    }


    @Override
    public void push(T n) {
        queueArray[tail++] = n;
        size++;
        this.checkForExtension();
    }


    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T x = queueArray[head];
        for (int i = 1; i < size + 1; i++) {  // TODO Можно ли сделать константную сложость?
            queueArray[i - 1] = queueArray[i];
        }
        size--;
        return x;
    }


    @Override
    public boolean isEmpty() {
        return (size == 0);
    }


    private boolean checkForExtension() {
        if (this.size > this.capacity / 2) {
            this.capacity += this.capacity / 2;
            T[] array2 = (T[]) (new Object[this.capacity]);
            for (int i = 0; i < size; i++) {
                array2[i] = this.queueArray[i];
            }
            this.queueArray = array2;
            return true;
        } else {
            return false;
        }
    }


    public String toString() {
        if (this.size == 0) {
            return "MyArrayQueue<>";
        }
        StringBuilder res = new StringBuilder("MyArrayQueue<");
        for (int i = 0; i < size - 1; i++) {
            res.append(this.queueArray[i] + ", ");
        }
        res.append(this.queueArray[size - 1] + ">");
        return res.toString();
    }
}

