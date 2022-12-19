import java.util.Scanner;

public class Person implements Movie, Cafe {

    private String name;
    private String surname;
    private int money;
//    private int countTickets;

    Scanner scanner = new Scanner(System.in);

    public int getMoney() {
        return money;
    }

    public Person(String name, String surname, int money) {
        this.name = name;
        this.surname = surname;
        this.money = money;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name) {
        this.name = name;
    }

    public int buyTicket() {
        System.out.println("\nYour balance: " + money + "$");
        System.out.println("Which film do u want to want to watch?");
        for (int i = 0; i < titles.length; i++) {
            System.out.printf("%d) %s %d$\n", i + 1, titles[i], ticketPrice[i]);
        }

        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        while (n > titles.length || n < 0) {
            System.out.println("Number could be only from 1 to " + titles.length);
            System.out.print("Enter number: ");
            n = scanner.nextInt();
            System.out.print("\n");
        }

        n -= 1; // to match list indexes


        if (ticketPrice[n] <= money) {  // if enough money for ticket
            for (int i = 0; i < freeSeats[n].length; i++) {  // Movie seats scheme
                System.out.println();
                System.out.print(i + 1 + " row: ");
                for (int j = 0; j < freeSeats[n][i].length; j++) {
                    System.out.print(freeSeats[n][i][j] + " ");
                }
            }
            System.out.println();

            int[] seat = chooseSeat(n);
            while (freeSeats[n][seat[0]][seat[1]] == 0) {  // 0 -- taken place
                System.out.println("This seat is taken, choose another one");
                seat = chooseSeat(n);
            }

            System.out.println(this.surname + " " + this.name + " bought a ticket for " + titles[n]);
            System.out.printf("Your seat is\nRow %d Seat %d\n", seat[0] + 1, seat[1] + 1);

            freeSeats[n][seat[0]][seat[1]] = 0;
            this.money -= ticketPrice[n];
            System.out.println("You have " + this.money + "$ left");
            return ticketPrice[n];

        } else if (ticketPrice[n] > money) {
            System.out.println("You r not rich enough to afford dis ticket!\n");
            return 0;
        } else {
            System.out.println("We don't have place to put your fat ass!\n");
            return 0;
        }
    }

    private int[] chooseSeat(int n) {
        System.out.print("Enter row number: ");
        int row = scanner.nextInt() - 1;
        while (row > freeSeats[n].length || row < 0) {
            System.out.println("Number could be only from 1 to " + freeSeats[n].length);
            System.out.print("Enter row number: ");
            n = scanner.nextInt();
            System.out.print("\n");
        }

        System.out.print("Now enter seat number: ");
        int seat = scanner.nextInt() - 1;
        while (seat > freeSeats[n][row].length || seat < 0) {
            System.out.println("Number could be only from 1 to " + freeSeats[n][row].length);
            System.out.print("Enter seat number: ");
            n = scanner.nextInt();
            System.out.print("\n");
        }
        return new int[]{row, seat};
    }


    public int buySnack() {
        System.out.println("\nYour balance: " + money + "$");
        System.out.println("Which snack do you want?");
        for (int i = 0; i < snacks.length; i++) {
            System.out.printf("%d) %s %d$\n", i + 1, snacks[i], snackPrice[i]);
        }

        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        while (n > snacks.length || n < 0) {
            System.out.println("Number could be only from 1 to " + snacks.length);
            System.out.print("Enter number: ");
            n = scanner.nextInt();
            System.out.print("\n");
        }

        n -= 1; // to match list indexes

        if (snackPrice[n] <= money && gotSnack) {
            System.out.println(this.surname + " " + this.name + " bought " + snacks[n]);
            this.money -= snackPrice[n];
            System.out.println("You have " + this.money + "$ left");
            return snackPrice[n];

        } else if (snackPrice[n] > money) {
            System.out.println("You r not rich enough to afford dis snack!\n");
            return 0;
        } else {
            System.out.println("This snack is not available\n");
            return 0;
        }
    }
}

