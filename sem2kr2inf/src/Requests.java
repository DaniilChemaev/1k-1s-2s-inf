import models.Club;
import models.Player;

import java.util.List;
import java.util.stream.Collectors;

public class Requests {


    // task 1
    public List<Player> findPlayerByCountryAndClub(String country, int clubID) {
        return DataBase.players.stream()
                .filter(x -> x.getCountry().equals(country))
                .filter(x -> x.getCurrentClubID() == clubID)
                .collect(Collectors.toList());
    }

    // task 2
    public int countContractsCost(int clubID, int year) {
        int totalCost = 0;
        for (int i = 0; i < DataBase.contracts.size(); i++) {
            if (DataBase.contracts.get(i).getClubID() == clubID && DataBase.contracts.get(i).getYear() == year) {
                totalCost += DataBase.contracts.get(i).getCost();
            }
        }
        return totalCost;
    }

    // task 3
    public void task3(String city) {

    }

}
