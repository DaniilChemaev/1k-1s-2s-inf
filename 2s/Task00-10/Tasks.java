public class Tasks {
    public static Elem inputList(int n) { // Task01 Ввод с конца
        Elem head = null;
        // if (n > 0) {  // Альтернативный ввод для тестирования
        //     for (int i = 0; i < n; i++) {
        //         Elem p = new Elem(i, head);
        //         head = p;
        //     }
        //     return head;

        if (n > 0) {
            head = new Elem(3, null);
            head = new Elem(3, head);

            for (int i = 0; i < n; i++) {
                Elem p = new Elem(i, head);
                head = p;
            }
            return head;
        } else {
            for (int i = 0; i > n; i--) {
                Elem p = new Elem(i, head);
                head = p;
            }
            return head;
        }
    }


    public static Elem inputListDirect(int n) { // Task01 Ввод с начала 

        Elem head = null;
        Elem end = null;


        head = new Elem(0, null);
        end = head;

        if (n > 0) {
            for (int i = 1; i < n; i++) {
                Elem p = new Elem(i, null);
                end.next = p;
                end = p;
            }
        } else {
            for (int i = -1; i > n; i--) {
                Elem p = new Elem(i, null);
                end.next = p;
                end = p;
            }
        }

        return head;
    }


    public static void outputList(Elem head) {

        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }

        System.out.print("null");
    }


    public static void findMax(Elem head) {  // 02 Найти максимум

        int res = head.value;

        while (head != null) {
            if (head.value > res) {
                res = head.value;
            }

            head = head.next;
        }

        System.out.println(res);
    }


    public static void sumList(Elem head) {  // 02 Найти сумму элементов

        int res = 0;

        while (head != null) {
            res += head.value;
            head = head.next;
        }

        System.out.println(res);
    }


    public static void checkNegativeElements(Elem head) {  // 02 Проверить наличие отрицательных чисел

        boolean res = false;

        while (head != null) {
            if (head.value < 0) {
                res = true;
                break;
            }

            head = head.next;
        }

        if (res) {
            System.out.println("Отрицательные есть");
        } else {
            System.out.println("Отрицательных нет");
        }

    }


    public static Elem removeHead(Elem head) {  // 03 Удалить голову списка

        return head.next;
    }


    public static Elem removeLast(Elem head) {  // 04 Удалить последний элемент списка
        if (head == null || head.next == null) {
            return null;
        }

        Elem p = head;

        while (p.next.next != null) {
            p = p.next;
        }
        p.next = null;

        return head;
    }


    public static Elem removePreLast(Elem head) {  // 05 Удалить предпоследний элемент списка
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }

        Elem p = head;

        // [] [] [] [] null

        while (p.next.next.next != null) {
            p = p.next;
        }
        p.next = p.next.next;
        p.next.next = null;

        return head;
    }

    public static Elem removeK(Elem head, int k) {  // 06 Удалить первый встретившийся элемент равный k

        if (head == null) {
            return null;
        }

        Elem p = head;
        while (p.next != null) {
            if (p.next.value == k) {
                p.next = p.next.next;
                break;
            } else {
                p = p.next;
            }
        }

        return head;
    }

    public static Elem removeAllK(Elem head, int k) {  // 07 Удалить все элементы равные k

        if (head == null) {
            return null;
        }

        // while (head.next != null && head.value == k) { 
        //     System.out.println(head.value);
        //     head = head.next;

        // }

        Elem p = head;
        while (p.next != null) {
            if (p.next.value == k) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        // if (head.value == k) {
        //     return null;

        // } else {
        //     Elem p = head;
        //     while (p.next != null) {
        //         if (p.next.value == k) {
        //             p.next = p.next.next;
        //         } else {
        //             p = p.next;
        //         }
        //     }
        // }

        return head;
    }


    public static Elem addNumBeforeAndAfterFirst(Elem head, int k, int m) {  // 08 Вставить число m до и после первого элемента, равного k

        if (head == null) {
            return null;
        }

        Elem newNode1 = new Elem(m, null);
        Elem newNode2 = new Elem(m, null);


        Elem p = head;
        while (p.next != null) {
            if (p.next.value == k) {
                Elem current = p.next;  // Элемент, на который должен будет указывать новый
                p.next = newNode1;  // Элемент, который указывает на новый
                newNode1.next = current;  // На что указывает новый элемент
                p = p.next;
            }
            if (p.value == k) {
                Elem current = p.next;  // Элемент, на который должен будет указывать новый
                p.next = newNode2;  // Элемент, который указывает на новый
                newNode2.next = current;  // На что указывает новый элемент
                break;
            } else {
                p = p.next;
            }
        }

        return head;
    }

    public static Elem addNumBeforeAndAfterAll(Elem head, int k, int m) {  // 09 Вставить число m до и после каждого элемента, равного k

        if (head == null) {
            return null;
        }

        Elem p = head;
        while (p.next != null) {
            if (p.next.value == k) {
                Elem newNode = new Elem(m, null);
                Elem current = p.next;  // Элемент, на который должен будет указывать новый
                p.next = newNode;  // Элемент, который указывает на новый
                newNode.next = current;  // На что указывает новый элемент
                p = p.next;
            }
            if (p.value == k && p.next != null) {
                Elem newNode = new Elem(m, null);
                Elem current = p.next;  // Элемент, на который должен будет указывать новый
                p.next = newNode;  // Элемент, который указывает на новый
                newNode.next = current;  // На что указывает новый элемент
                p = p.next;
            } else {
                p = p.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {
        int n = 5;

        Elem head = inputList(n);
        outputList(head);

        // head = inputListDirect(n);
        // outputList(head);

        // findMax(head);

        // sumList(head);

        // checkNegativeElements(head);

        // head = inputList(n);
        // head = removeHead(head);
        // outputList(head);

        // head = inputList(n);
        // head = removeLast(head);
        // outputList(head);

        // head = inputList(n);         
        // head = removePreLast(head);
        // outputList(head);

        // head = inputList(n);
        // head = removeK(head, 3);
        // outputList(head);

        // head = inputList(n);
        // head = removeAllK(head, 3);
        // outputList(head);

        head = inputList(n);
        outputList(head);
        addNumBeforeAndAfterFirst(head, 3, 10);
        outputList(head);

        head = inputList(n);
        outputList(head);
        addNumBeforeAndAfterAll(head, 3, 10);
        outputList(head);

    }
}
