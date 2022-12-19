public class Task20 {
    public static void main(String[] args) {
        String a = ")(";
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {res += 1;}
            if (a.charAt(i) == ')') {res -= 1;}
        }
        if (res == 0){
            System.out.println("OK");
        }
        else{
            System.out.println("Not OK");
        }
    }
}
