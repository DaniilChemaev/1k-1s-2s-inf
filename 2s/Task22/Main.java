import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"4", "5", "/", "2", "-", "3", "*", "2", "10", "5", "+", "*", "-"};

        // (2 - (5 / 4)) * 3 + 2) * 10) - 5
        ArrayStack<Double> stack = new ArrayStack<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].matches("[0-9]+")) {
                double x1 = stack.pop();
                double x2 = stack.pop();

                double res = 0;
                switch (arr[i]) {
                    case "+":
                        res = x1 + x2;
                        System.out.println(x1 + " + " + x2);
                        break;
                    case "-":
                        res = x1 - x2;
                        System.out.println(x1 + " - " + x2);
                        break;
                    case "*":
                        res = x1 * x2;
                        System.out.println(x1 + " * " + x2);
                        break;
                    case "/":
                        res = x1 / x2;
                        System.out.println(x1 + " / " + x2);
                        break;
                }
                stack.push(res);
            } else {
                stack.push(Double.parseDouble(arr[i]));
            }
        }
        System.out.println("res= " + stack.pop());
    }
}


