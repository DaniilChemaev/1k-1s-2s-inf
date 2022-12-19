public interface Movie extends Luntik, Simpsons, Futurama {
    // !TODO make hashMap instead of 2 lists

    String[] titles = {Luntik.title, Simpsons.title, Futurama.title};
    int[] ticketPrice = {Luntik.price, Simpsons.price, Futurama.price};
    int[][][] freeSeats = {Luntik.freeSeats, Simpsons.freeSeats, Futurama.freeSeats};
    static String chooseFilm(int n) {
        return titles[n];
    }

}
