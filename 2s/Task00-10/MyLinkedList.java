/* Task10. Реализовать ввод и вывод двунаправленного линейного списка, а также поиск максимума в нем.
//У его Elem (назвать надо будет по-другому) есть еще одна ссылка - prev, на предыдущий элемент. */

public class MyLinkedList {
    public static Node inputList(int n) {
        Node head = null;
        Node tail = null;


        if (n > 0) {
            for (int i = 0; i < n; i++) {
                Node temp = tail;
                Node newNode = new Node(i, temp, null);
                tail = newNode;
                if (head == null) {
                    head = newNode;
                } else {
                    temp.next = newNode;
                }
            }
        }
        return head;
    }

    public static void outputList(Node head) {

        System.out.print("null <-> ");
        while (head != null) {
            System.out.print(head.value + " <-> ");
            head = head.next;
        }

        System.out.print("null\n");
    }

    public static void findMax(Node head) {
        int res = head.value;
        head = head.next;

        while (head != null) {
            if (head.value > res) {
                res = head.value;
            }
            head = head.next;
        }

        System.out.println("max = " + res);
    }

    public static void main(String[] args) {
        int n = 5;

        Node head = inputList(n);
        outputList(head);

        findMax(head);

    }
}
