public interface IQueue<T> {
    void push(T x);
    T pop();
    boolean isEmpty();
}
