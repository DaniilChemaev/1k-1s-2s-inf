/* 10. Реализовать ввод и вывод двунаправленного линейного списка, а также поиск максимума в нем.
У его Elem (назвать надо будет по-другому) есть еще одна ссылка - prev, на предыдущий элемент. */

public class Node {
    int value;
    Node previous;
    Node next;

    public Node(int value, Node previous, Node next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }
}
