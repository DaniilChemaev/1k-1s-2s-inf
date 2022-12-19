package dao;

import models.Group;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupDao {
    public static Map<Long, Group> getGroups() throws FileNotFoundException {
        File devFile = new File("src/database/groups.txt");
        Scanner devScanner = new Scanner(devFile);
        Map<Long, Group> groups = new HashMap<>();

        while (devScanner.hasNext()) {
            Group group = new Group();
            String[] devData = devScanner.nextLine().split(" ");
            for (int i = 0; i < devData.length; i++) {
                if (devData[i].isEmpty()) continue;
                switch (i) {
                    case 0 -> group.setID(Long.parseLong(devData[i]));
                    case 1 -> group.setName(devData[i]);
                    case 2 -> group.setSubscribers(Integer.parseInt(devData[i]));
                }
            }
            groups.put(group.getID(), group);
        }
        return groups;
    }
}
