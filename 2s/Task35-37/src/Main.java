import models.User;
import services.GroupService;
import services.UserService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupService groupService = new GroupService();
        UserService userService = new UserService();

        List<User> list = userService.getUserDAO().getUsers();
        System.out.println(list);
        System.out.println();

        List<User> list1 = userService.getUserDAO().getUsersByCity("Ulyanovsk");
        System.out.println(list1);

        System.out.println();
        List<User> list2 = userService.getUserDAO().getUsersByName("Danil");
        System.out.println(list2);

        System.out.println(groupService.getGroupDAO().getGroups());
        System.out.println();
        System.out.println(userService.getUserDAO().getUsers());

        System.out.println(groupService.getGroupDAO().getUsers(1));
        System.out.println(groupService.getGroupDAO().getUsersOfSameCity(1));
    }
}
