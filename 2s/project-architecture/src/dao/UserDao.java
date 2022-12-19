package dao;

import models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class UserDao {
    public static Map<Long, User> getUsers() throws FileNotFoundException {
        File devFile = new File("src/database/users.txt");
        Scanner devScanner = new Scanner(devFile);
        Map<Long, User> users = new HashMap<>();

        while (devScanner.hasNext()) {
            User user = new User();
            String[] devData = devScanner.nextLine().split(" ");
            for (int i = 0; i < devData.length; i++) {
                if (devData[i].isEmpty()) continue;
                switch (i) {
                    case 0 -> user.setID(Long.parseLong(devData[i]));
                    case 1 -> user.setLogin(devData[i]);
                    case 2 -> user.setEmail(devData[i]);
                    case 3 -> user.setPassword(devData[i]);
                    case 4 -> user.setCity(devData[i]);
                }
            }
            users.put(user.getID(), user);
        }
        return users;
    }

    public static int getNumberOfUsers() throws FileNotFoundException {
        Map<Long, User> users = getUsers();
        return users.size();
    }


    public static Map<Long, User> getUsersByCity(String city) throws FileNotFoundException {
        Map<Long, User> users = getUsers();
        List<Integer> keys = new ArrayList(users.keySet());
        Map<Long, User> res = new HashMap<>();

        for (int i = 0; i < keys.size(); i++) {
            if (users.get(keys.get(i)).getCity().equals(city)) {
                res.put(users.get(keys.get(i)).getID(), users.get(keys.get(i)));
            }
        }
        return res;
    }

    public static Map<Long, User> getUsersByLogin(String login) throws FileNotFoundException {
        Map<Long, User> users = getUsers();
        List<Integer> keys = new ArrayList(users.keySet());
        Map<Long, User> res = new HashMap<>();

        for (int i = 0; i < keys.size(); i++) {
            if (users.get(keys.get(i)).getCity().equals(login)) {
                res.put(users.get(keys.get(i)).getID(), users.get(keys.get(i)));
            }
        }
        return res;
    }
}
