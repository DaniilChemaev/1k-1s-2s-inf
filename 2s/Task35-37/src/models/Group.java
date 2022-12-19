package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private long id;
    private String name;
    private String city;
    private List<User> members = new ArrayList<>();

    public Group() {
    }


    public void setID(long id) {
        this.id = id;
    }

    public long getID() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(User user) {
        this.members.add(user);
    }

    public String getName() {
        return name;
    }

    public List<User> getMembers() {
        return members;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", members=" + members +
                '}';
    }
}
