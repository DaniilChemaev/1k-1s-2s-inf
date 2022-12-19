package ru.kpfu.itis.group108;

//public interface Mylist1<T> {
//
//    void add(T x);
//
//
//}



public interface MyList<T> {

    void add(T x);  // Добавление элемента в список

    void add(T x, int i); // Добавление на позицию (если позиции нет, то исключение)

    int size(); // размер списка

    boolean isEmpty(); // проверка списка на пустоту

    void clear();  // очистить список

    boolean remove(T x); // удалить первое упоминание элемента x в списке (true - если удалилось, false - если не нашлось такого элемента),

    int removeAll(T x); // удалить все элементы списка, равные x (возвращает число, равное количеству произведенных удалений),

    Object[] toArray();  // вернуть массив, хранящий элементы списка,

    void merge(MyList lst);  // выполнить слияние этого списка со списком lst

    boolean contains(T x);  // проверить наличие

//    T get(int i) throws MyArrrayIndexOutOfBoundException;
}