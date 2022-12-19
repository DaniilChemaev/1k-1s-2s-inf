package models;

public class Contract {
    private int clubID;
    private int playersID;
    private int duration;
    private int year;
    private int cost;

    public Contract(int clubID, int playersID, int duration, int year, int cost) {
        this.clubID = clubID;
        this.playersID = playersID;
        this.duration = duration;
        this.year = year;
        this.cost = cost;
    }

    public int getClubID() {
        return clubID;
    }

    public int getPlayersID() {
        return playersID;
    }

    public int getDuration() {
        return duration;
    }

    public int getYear() {
        return year;
    }

    public int getCost() {
        return cost;
    }
}
