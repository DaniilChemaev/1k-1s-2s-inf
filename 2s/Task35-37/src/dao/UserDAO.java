package dao;

import dao.db.DB;
import models.User;

import java.util.*;

public class UserDAO {

    private List<User> users;

    public UserDAO() {
        users = DB.getUsers();
    }

    public List<User> getUsers(){
        return users;
    }

    public List<User> getUsersByCity(String city) {
        List<User> result = new ArrayList<>();
        for (User u : users) {
            if (u.getCity().equals(city)) {
                result.add(u);
            }
        }
        return result;
    }

    public List<User> getUsersByName(String name) {
        List<User> result = new ArrayList<>();
        for (User u : users) {
            if (u.getName().equals(name)) {
                result.add(u);
            }
        }
        return result;
    }

    public User getUserById(long id) {
        for (User u : DB.getUsers()) {
            if (u.getID() == id) {
                return u;
            }
        }
        return null;
    }
}
