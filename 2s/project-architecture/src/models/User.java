package models;

public class User {
    private long ID;
    private String login;
    private String email;
    private String password;
    private String city;


    public User() {
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getID() {
        return ID;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
