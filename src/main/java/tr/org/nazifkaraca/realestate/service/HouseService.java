package tr.org.nazifkaraca.realestate.service;

import tr.org.nazifkaraca.realestate.model.House;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {

    // Total price for houses
    public int getTotalPrice(List<? extends House> houseList) {
        return houseList.stream()
                .mapToInt(House::getPrice)
                .sum();
    }

    // Average square meter calculation
    public double getAverageSquareMeters(List<? extends House> houseList) {
        return houseList.stream()
                .mapToInt(House::getSquareMeters)
                .average()
                .orElse(0);
    }

    // Filter by room and living room
    public List<? extends House> filterByRoomAndLivingRoom(List<? extends House> houseList, int roomCount, int livingRoomCount) {
        return houseList.stream()
                .filter(house -> house.getRoomCount() == roomCount && house.getLivingRoomCount() == livingRoomCount)
                .collect(Collectors.toList());
    }
}
