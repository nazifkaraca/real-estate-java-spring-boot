package tr.org.nazifkaraca.realestate.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public abstract class House {

    // Getters
    private final String name;
    private final int price;
    private final int squareMeters;
    private final int roomCount;
    private final int livingRoomCount;

    public House(String name, int price, int squareMeters, int roomCount, int livingRoomCount) {
        this.name = name;
        this.price = price;
        this.squareMeters = squareMeters;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

}
