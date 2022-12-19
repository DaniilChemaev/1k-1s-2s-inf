public class ArrayStack<T> implements IStack<T> {
    private T[] stackArray;
    private int capacity = 1000;
    private int size;
    private int top;


    public ArrayStack() {
        this.stackArray = (T[]) new Object[capacity];
        this.top = -1;
    }


    @Override
    public void push(T n) {
        stackArray[++top] = n;
        size++;
        this.checkForExtension();
    }


    @Override
    public T pop() {
        size--;
        return stackArray[top--];
    }


    @Override
    public boolean isEmpty() {
        return (top == -1);
    }


    private boolean checkForExtension() {
        if (this.size > this.capacity / 2) {
            this.capacity += this.capacity / 2;
            T[] array2 = (T[]) (new Object[this.capacity]);
            for (int i = 0; i < size; i++) {
                array2[i] = this.stackArray[i];
            }
            this.stackArray = array2;
            return true;
        } else {
            return false;
        }
    }


    public String toString() {
        if (this.size == 0) {
            return "MyArrayStack<>";
        }
        StringBuilder res = new StringBuilder("MyArrayStack<");
        for (int i = 0; i < size - 1; i++) {
            res.append(this.stackArray[i] + ", ");
        }
        res.append(this.stackArray[size - 1] + ">");
        return res.toString();
    }
}

