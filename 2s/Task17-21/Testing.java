public class Testing {
    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        System.out.println(linkedStack);
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack);

        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        System.out.println(arrayStack);
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack);

    }
}
