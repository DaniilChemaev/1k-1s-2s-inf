package dao;

import dao.db.DB;
import models.Group;
import models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupDAO {

    private List<Group> groups;

    public GroupDAO() {
        groups = DB.getGroups();
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<User> getUsers(int id) {
        return groups.get(id).getMembers();
    }

    public List<User> getUsersOfSameCity(int id) {
        List<User> users = new ArrayList<>();
        for (User u : groups.get(id).getMembers()) {
            if (Objects.equals(u.getCity(), groups.get(id).getCity())){
                users.add(u);
            }
        }
        return users;
    }

    public Group getGroupById(long id) {
        for (Group g : DB.getGroups()) {
            if (g.getID() == id) {
                return g;
            }
        }
        return null;
    }
}
