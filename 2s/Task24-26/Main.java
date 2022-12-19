public class Main {
    public static void main(String[] args) {
        String[] arr = {"4", "5", "/", "2", "-", "3", "*", "2", "10", "5", "+", "*", "-"};

        LinkedQueue<String> queue = new LinkedQueue<>();

        for (int i = 0; i < arr.length; i++) {
            queue.push(arr[i]);
        }
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue);
    }
}

