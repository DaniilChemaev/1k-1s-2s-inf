import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Node n1 = new Node("-");
        n1.setLeft(new Node("+"));
        n1.setRight(new Node("-"));

        Node n2 = n1.getLeft();
        Node n3 = n1.getRight();

        n2.setLeft(new Node("2"));
        n2.setRight(new Node("3"));

        n3.setLeft(new Node("7"));
        n3.setRight(new Node("*"));

        Node n4 = n3.getRight();

        n4.setLeft(new Node("8"));
        n4.setRight(new Node("5"));

        System.out.println(eval(n1));
    }

    public static boolean isLeaf(Node n) {
        return (n.getLeft() == null && n.getRight() == null);
    }

    // 46. Создать класс, где хранится дерево выражений (требуется постфиксная запись).
    // Реализовать метод eval - посчитать дерево
    public static int eval(Node root) {
        if (isLeaf(root)) {
            return (Integer.parseInt(root.getInfo()));
        } else {
            return process(root.getInfo(), eval(root.getLeft()), eval(root.getRight()));
        }
    }

    public static int process(String oper, int a, int b) {
        return switch (oper) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}