public class TicketOffice {

    private int money;

    public TicketOffice(int money) {
        this.money = 0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money += money;
    }

}
