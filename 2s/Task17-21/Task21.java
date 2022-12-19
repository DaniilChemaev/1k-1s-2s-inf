public class Task21 {
    public static boolean checkingParenthesesPlacement(String a) {
        ArrayStack<String> stack = new ArrayStack<>();

        boolean res = true;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(' || a.charAt(i) == '{' || a.charAt(i) == '[') {
                stack.push(String.valueOf(a.charAt(i)));
            } else {
                if (!stack.isEmpty()) {  // Если сразу идет закрывающая скобка
                    switch (a.charAt(i)) {
                        case ')' -> res = stack.pop().equals("(");
                        case '}' -> res = stack.pop().equals("{");
                        case ']' -> res = stack.pop().equals("[");
                    }
                } else {
                    res = false;
                    break;
                }
            }
            if (!res) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String a = "([)[]]{}";
        System.out.println(checkingParenthesesPlacement(a));
    }
}
