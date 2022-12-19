package ru.kpfu.itis.group108;


public class Elem<T> {

    T value;
    Elem<T> next;

    public Elem(T value, Elem<T> next) {
        this.value = value;
        this.next = next;
    }
}
