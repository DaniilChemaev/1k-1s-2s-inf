import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataBase dataBase = new DataBase();
        Requests requests = new Requests();

        dataBase.setPlayers();
        dataBase.setClubs();
        dataBase.setContracts();

        // task 1
        System.out.println(requests.findPlayerByCountryAndClub("Россия", 001));

        System.out.println("===================");

        // task 2
        int year = 2020;
        for (int i = 0; i < DataBase.clubs.size(); i++) {
            System.out.println("Для клуба " + DataBase.clubs.get(i).getName() +
                    " общая стоимость контрактов за " + year + " год составила " +
                    requests.countContractsCost(DataBase.clubs.get(i).getID(), year) + "$");
        }

        // task 3 !TODO  Добавить атрибут "все клубы" для каждого игрока -- List<Club>
    }
}
