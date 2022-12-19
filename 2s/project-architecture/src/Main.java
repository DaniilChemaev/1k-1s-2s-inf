import dao.GroupDao;
import dao.UserDao;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(UserDao.getUsers());
        System.out.println(UserDao.getUsersByCity("Ulyanovsk"));
        System.out.println(UserDao.getUsersByLogin("asdf"));
        System.out.println(UserDao.getNumberOfUsers());
        System.out.println(GroupDao.getGroups());
    }
}
