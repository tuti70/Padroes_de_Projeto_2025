package facade;

import facade.models.Room;

public class HotelReservation {
    public Room reserveRoom(String roomType, int guests) {
        double pricePerPerson;
        switch (roomType.toLowerCase()) {
            case "simples":
                pricePerPerson = 200;
                break;
            case "executivo":
                pricePerPerson = 200 * 1.5;
                break;
            case "suíte presidencial":
                pricePerPerson = 200 * 1.5 * 3;
                break;
            default:
                throw new IllegalArgumentException("Tipo de quarto inválido");
        }
        return new Room(roomType, pricePerPerson);
    }

    public double calculateHotelPrice(Room room, int guests, int nights) {
        return room.getPricePerPerson() * guests * nights;
    }
}