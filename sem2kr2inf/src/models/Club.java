package models;

public class Club {
    private int ID;
    private String name;
    private int year;
    private String city;

    public Club(int ID, String name, int year, String city) {
        this.ID = ID;
        this.name = name;
        this.year = year;
        this.city = city;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }
}
