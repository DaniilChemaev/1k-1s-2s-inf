package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private long ID;
    private String login;
    private String name;
    private String email;
    private String city;
    private List<Group> groups = new ArrayList<>();


    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public long getID() {
        return ID;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", groups=" + groups +
                '}';
    }
}
