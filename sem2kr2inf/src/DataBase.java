import models.Club;
import models.Player;
import models.Contract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static List<Player> players = new ArrayList<>();
    static List<Club> clubs = new ArrayList<>();
    static List<Contract> contracts = new ArrayList<>();

    public void setPlayers() throws IOException {
        FileReader fileReader = new FileReader("files/players.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String x = bufferedReader.readLine();
        while (x != null) {
            String[] line = x.split(" ");
            Player player = new Player(Integer.parseInt(line[0]), line[1], line[2], line[3], line[4], line[5], Integer.parseInt(line[6]));
            players.add(player);
            x = bufferedReader.readLine();
        }

        fileReader.close();
        bufferedReader.close();
    }

    public void setClubs() throws IOException {
        FileReader fileReader = new FileReader("files/clubs.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String x = bufferedReader.readLine();
        while (x != null) {
            String[] line = x.split(" ");
            Club club = new Club(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]), line[3]);
            clubs.add(club);
            x = bufferedReader.readLine();
        }

        fileReader.close();
        bufferedReader.close();
    }

    public void setContracts() throws IOException {
        FileReader fileReader = new FileReader("files/contracts.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String x = bufferedReader.readLine();
        while (x != null) {
            String[] line = x.split(" ");
            Contract contract = new Contract(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]));
            for (Player player : players) {
                if (player.getID() == contract.getPlayersID()) {
                    player.setCurrentClubID(contract.getClubID());
                    break;

//                    for (Club club : clubs) {
//                        if (club.getID() == contract.getClubID()) {
//                            player.addClub(club);
//                            break;
//                        }
                }
            }
            contracts.add(contract);
            x = bufferedReader.readLine();
        }

        fileReader.close();
        bufferedReader.close();
    }

//    public static void main() throws IOException {
//        setPlayers();
//        setClubs();
//        setPlayersInClubs();
//    }


}
