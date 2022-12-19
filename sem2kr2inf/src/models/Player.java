package models;

import java.util.List;

public class Player {

    private int ID;
    private String surname;
    private String name;
    private String subname;
    private String amplua;
    private String country;
    private int year;
    //    private List<Club> club;
    private int currentClubID;

    public Player(int ID, String surname, String name, String subname, String amplua, String country, int year) {
        this.ID = ID;
        this.surname = surname;
        this.name = name;
        this.subname = subname;
        this.amplua = amplua;
        this.country = country;
        this.year = year;
    }

    public int getID() {
        return ID;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSubname() {
        return subname;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getAmplua() {
        return amplua;
    }

//    public List<Club> getClubs() {
//        return clubs;
//    }

    public int getCurrentClubID() {
        return currentClubID;
    }

//    public void addClub(Club club) {
//        this.clubs.add(club);
//        setCurrentClub(club);
//    }

    public void setCurrentClubID(int currentClubID) {
        this.currentClubID = currentClubID;
    }

    @Override
    public String toString() {
        return "Player{" +
                "ID=" + ID +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", subname='" + subname + '\'' +
                ", amplua='" + amplua + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", currentClubID=" + currentClubID +
                '}';
    }
}

