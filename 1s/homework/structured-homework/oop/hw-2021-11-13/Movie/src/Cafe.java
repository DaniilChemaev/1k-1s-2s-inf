public interface Cafe {
    //!TODO make hashMap instead of 2 lists
    String[] snacks = {"Salty popcorn", "Sweet popcorn", "Caramel popcorn"};
    int[] snackPrice = {50, 50, 100};
    //!TODO do for each item
    boolean gotSnack = true;

    static String chooseSnack(int n) {
        return snacks[n];
    }
}
