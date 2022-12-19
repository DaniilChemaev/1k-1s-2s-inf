//package dao;
//
//import models.User;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class UsersGroupsDao {
//    public static Map<Long, User> get() throws FileNotFoundException {
//        File devFile = new File("src/database/users.txt");
//        Scanner devScanner = new Scanner(devFile);
//        Map<Long, User> users = new HashMap<>();
//
//        while (devScanner.hasNext()) {
//            User user = new User();
//            String[] devData = devScanner.nextLine().split(" ");
//            for (int i = 0; i < devData.length; i++) {
//                if (devData[i].isEmpty()) continue;
//                switch (i) {
//                    case 0 -> user.setID(Long.parseLong(devData[i]));
//                    case 1 -> user.setLogin(devData[i]);
//                    case 2 -> user.setEmail(devData[i]);
//                    case 3 -> user.setPassword(devData[i]);
//                    case 4 -> user.setCity(devData[i]);
//                }
//            }
//            users.put(user.getID(), user);
//        }
//        return users;
//    }
//}
