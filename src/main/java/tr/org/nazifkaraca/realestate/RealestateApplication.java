package tr.org.nazifkaraca.realestate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.org.nazifkaraca.realestate.model.House;
import tr.org.nazifkaraca.realestate.model.SummerHouse;
import tr.org.nazifkaraca.realestate.model.Villa;
import tr.org.nazifkaraca.realestate.repository.HouseRepository;
import tr.org.nazifkaraca.realestate.service.HouseService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RealestateApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RealestateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create instances from repository and service
        HouseRepository repository = new HouseRepository();
        HouseService service = new HouseService();

        // Get and assign all houses from repository
        List<House> houses = repository.getHouseList();
        List<Villa> villas = repository.getVillaList();
        List<SummerHouse> summerHouses = repository.getSummerHouseList();

        // Create a list containing all house types
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(houses);
        allHouses.addAll(villas);
        allHouses.addAll(summerHouses);

        // Print prices of each house type
        System.out.println("##################### Prices #####################");
        System.out.println("Total price of houses: " + service.getTotalPrice(houses));
        System.out.println("Total price of villas: " + service.getTotalPrice(villas));
        System.out.println("Total price of summer houses: " + service.getTotalPrice(summerHouses));
        System.out.println("The price of all properties: " + service.getTotalPrice(allHouses));

        // Print average square meters of each house type
        System.out.println("##################### Square Meters #####################");
        System.out.println("Average square meters of houses: " + service.getAverageSquareMeters(houses));
        System.out.println("Average square meters of villas: " + service.getAverageSquareMeters(villas));
        System.out.println("Average square meters of summer houses: " + service.getAverageSquareMeters(summerHouses));
        System.out.println("The average square meters of all properties: " + service.getAverageSquareMeters(allHouses));

        // Print filter service
        System.out.println("##################### Filter #####################");
        int roomCount = 4;
        int livingRoomCount = 1;
        List<? extends House> filtered = service.filterByRoomAndLivingRoom(allHouses, roomCount, livingRoomCount);

        System.out.println("Filtered houses with " + roomCount + " rooms and " + livingRoomCount + " living rooms:");
        for (House house : filtered) {
            System.out.println("- " + house.getName() + " | Price: " + house.getPrice() + ", Area: " + house.getSquareMeters());
        }

    }

}
