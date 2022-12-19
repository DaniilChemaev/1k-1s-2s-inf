import java.util.Scanner;

public class Menu implements Cafe {
    Person person = new Person("Vasya", "Pupkin", 1000);
    Kid kid = new Kid("Mini Vasya", "Mini Pupkin");
    Dog dog = new Dog("Bobik");

    TicketOffice ticketOffice = new TicketOffice(0);
    Scanner scanner = new Scanner(System.in);

    public void Start() {
        int button = 1;
        int whoIs = 1;
        while (button != 0 || whoIs != 0) {
            System.out.print("""
                    ============================
                    Who r u?
                    1. I'm adult
                    2. I'm kid
                    3. IMA DOGGGGG
                    0. Exit
                    ============================
                    Enter number:\040""");

            whoIs = scanner.nextInt();
            while (whoIs >= 4 || whoIs < 0) {
                System.out.println("Number could be only from 0 to 2");
                System.out.print("Enter number: ");
                whoIs = scanner.nextInt();
                System.out.print("\n");
            }
//
//        if (button == 1) {
//            int ticketPrice = kid.buyTicket();  // Метод возвращает стоимость билета
//        } else if (button == 2) {
//            int snackPrice = kid.buySnack();
//        } else if (button == 3) {
//            for (int i = 0; i < snacks.length; i++) {
//                System.out.printf("%d) %s %d$\n", i + 1, snacks[i], snackPrice[i]);
//            }
            if (whoIs == 1) {
                System.out.println("\nYour balance: " + person.getMoney() + "$");
            } else if (whoIs == 2) {
                System.out.println("\nYour balance: " + kid.getMoney() + "$");
            }
            System.out.print("""
                    ============================
                    MENU:
                    1. Buy ticket
                    2. Buy snack
                    3. Check Cafe
                    0. Exit
                    ============================
                    Enter number:\040""");

            button = scanner.nextInt();
            while (button >= 4 || button < 0) {
                System.out.println("Number could be only from 0 to 3");
                System.out.print("Enter number: ");
                button = scanner.nextInt();
                System.out.print("\n");
            }
            if (whoIs == 1) {
                if (button == 1) {
                    int ticketPrice = person.buyTicket();  // Метод возвращает стоимость билета
                    ticketOffice.setMoney(ticketOffice.getMoney() + ticketPrice);
                    System.out.println(ticketOffice.getMoney() + "$ in Ticket Office\n");
                } else if (button == 2) {
                    int snackPrice = person.buySnack();
                    ticketOffice.setMoney(ticketOffice.getMoney() + snackPrice);
                    System.out.println(ticketOffice.getMoney() + "$ in Ticket Office\n");
                } else if (button == 3) {
                    for (int i = 0; i < snacks.length; i++) {
                        System.out.printf("%d) %s %d$\n", i + 1, snacks[i], snackPrice[i]);
                    }
                }
            } else if (whoIs == 2) {
                if (button == 1) {
                    int ticketPrice = kid.buyTicket();  // Метод возвращает стоимость билета
                } else if (button == 2) {
                    int snackPrice = kid.buySnack();
                } else if (button == 3) {
                    for (int i = 0; i < snacks.length; i++) {
                        System.out.printf("%d) %s %d$\n", i + 1, snacks[i], snackPrice[i]);
                    }
                }
            } else if (whoIs == 3) {
                if (button == 1) {
                    int ticketPrice = dog.buyTicket();  // Метод возвращает стоимость билета
                } else if (button == 2) {
                    int snackPrice = dog.buySnack();
                } else if (button == 3) {
                    System.out.println("Wof Wof\n");
                }
            }
        }
        System.out.println("Thanks for using our digital cinema");
    }
}
