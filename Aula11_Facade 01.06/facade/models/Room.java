
package facade.models;

public class Room {
    private String type;
    private double pricePerPerson;

    public Room(String type, double pricePerPerson) {
        this.type = type;
        this.pricePerPerson = pricePerPerson;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getPricePerPerson() {
        return pricePerPerson;
    }
}