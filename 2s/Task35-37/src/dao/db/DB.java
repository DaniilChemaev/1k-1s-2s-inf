package dao.db;

import dao.GroupDAO;
import dao.UserDAO;
import models.Group;
import models.Subscription;
import models.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DB {
    private static List<User> users;
    private static List<Group> groups;
    private static List<Subscription> subscriptions;

    private static UserDAO userDAO = new UserDAO();
    private static GroupDAO groupDAO = new GroupDAO();

    private static void loadUsers() {
        users = new LinkedList<>();
        try {
            Scanner sc = new Scanner(new File("src/files/users.txt"));
            while (sc.hasNext()) {
                User user = new User();
                String[] devData = sc.nextLine().split(" ");
                for (int i = 0; i < devData.length; i++) {
                    if (devData[i].isEmpty()) continue;
                    switch (i) {
                        case 0 -> user.setID(Long.parseLong(devData[i]));
                        case 1 -> user.setLogin(devData[i]);
                        case 2 -> user.setName(devData[i]);
                        case 3 -> user.setEmail(devData[i]);
                        case 4 -> user.setCity(devData[i]);
                    }
                }
//                /**
//                 * !TODO Слишком большая сложность, из-за того, что мы каждый раз проходим весь файл со связью Группа-Человек
//                 */
//                Scanner sc2 = new Scanner(new File("src/files/users.groups.txt"));
//                while (sc2.hasNext()) {
//                    String[] membersData = sc2.nextLine().split(" ");
////                    System.out.println(Arrays.toString(membersData));
//                    if (Long.parseLong(membersData[1]) == user.getID()) {
//                        user.addGroup(groupDAO.getGroupById(Long.parseLong(membersData[0])));
//                    }
//                }
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void loadGroups() {
        groups = new LinkedList<>();
        try {
            Scanner sc = new Scanner(new File("src/files/groups.txt"));
            while (sc.hasNext()) {
                Group group = new Group();
                String[] devData = sc.nextLine().split(" ");
                for (int i = 0; i < devData.length; i++) {
                    if (devData[i].isEmpty()) continue;
                    switch (i) {
                        case 0 -> group.setID(Long.parseLong(devData[i]));
                        case 1 -> group.setName(devData[i]);
                        case 2 -> group.setCity(devData[i]);
                    }
                }
                /**
                 * !TODO Слишком большая сложность, из-за того, что мы каждый раз проходим весь файл со связью Группа-Человек
                 */
                Scanner sc2 = new Scanner(new File("src/files/users.groups.txt"));
                while (sc2.hasNext()) {
                    String[] membersData = sc2.nextLine().split(" ");
//                    System.out.println(Arrays.toString(membersData));
                    if (Long.parseLong(membersData[1]) == group.getID()) {
                        group.addMember(userDAO.getUserById(Long.parseLong(membersData[0])));
                    }
                }
                groups.add(group);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Подписки людей друг на друга
     */
    private static void loadSubscriptions() {
        subscriptions = new LinkedList<>();
        try {
            Scanner sc = new Scanner(new File("subcriptions.txt"));
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] ids = s.split(" ");
                long id1 = Long.parseLong(ids[0]);
                long id2 = Long.parseLong(ids[2]);

                User user1 = userDAO.getUserById(id1);
                User user2 = userDAO.getUserById(id2);

                subscriptions.add(new Subscription(user1, user2));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static List<User> getUsers() {
        if (users == null) {
            loadUsers();
        }
        return users;
    }

    public static List<Group> getGroups() {
        if (groups == null) {
            loadGroups();
        }
        return groups;
    }

    public static List<Subscription> getSubscriptions() {
        if (subscriptions == null) {
            loadSubscriptions();
        }

        return subscriptions;
    }
}
