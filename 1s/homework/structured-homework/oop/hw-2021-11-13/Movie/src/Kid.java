public class Kid extends Person {
    final int money = 0;

    public Kid(String name, String surname) {
        super(name, surname);

    }

    public int buyTicket() {
        System.out.println("\nYour balance: " + money + "$");
        System.out.println("""
                You can't afford this ticket
                Ask your parents to buy it for you
                
                """);
        return 0;
    }

    public int buySnack() {
        System.out.println("\nYour balance: " + money + "$");
        System.out.println("""
                You can't afford this snack
                Ask your parents to buy it for you
                
                """);
        return 0;
    }
}
