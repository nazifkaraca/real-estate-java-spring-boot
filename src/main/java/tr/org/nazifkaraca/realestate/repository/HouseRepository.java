package tr.org.nazifkaraca.realestate.repository;

import tr.org.nazifkaraca.realestate.model.House;
import tr.org.nazifkaraca.realestate.model.SummerHouse;
import tr.org.nazifkaraca.realestate.model.Villa;

import java.util.List;

public class HouseRepository {

    // Create house list and return
    public List<House> getHouseList() {
        return List.of(
                new House("House",100000, 120, 3, 1) {},
                new House("House",110000, 125, 3, 1) {},
                new House("House",120000, 130, 4, 1) {}
        );
    }

    // Create villa list and return
    public List<Villa> getVillaList() {
        return List.of(
                new Villa("Villa",200000, 200, 5, 2) {},
                new Villa("Villa",210000, 210, 6, 3) {},
                new Villa("Villa",220000, 220, 6, 4) {}
        );
    }

    // Create summer house list and return
    public List<SummerHouse> getSummerHouseList() {
        return List.of(
                new SummerHouse("SummerHouse",150000, 150, 4, 1) {},
                new SummerHouse("SummerHouse",160000, 160, 4, 2) {},
                new SummerHouse("SummerHouse",170000, 170, 5, 2) {}
        );
    }
}
