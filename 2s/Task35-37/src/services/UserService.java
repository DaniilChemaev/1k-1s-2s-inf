package services;

import dao.UserDAO;
import models.User;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        userDAO = new UserDAO();
    }

//    public static boolean areFriends(User user1, User user2) {
//        return true;
//    }

    public UserDAO getUserDAO() {
        return userDAO;
    }
}
