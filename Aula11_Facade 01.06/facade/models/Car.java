
package facade.models;

public class Car {
    private String type;
    private double dailyPrice;

    public Car(String type, double dailyPrice) {
        this.type = type;
        this.dailyPrice = dailyPrice;
    }

    // Getters
    public String getType() {
        return type;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }
}