
package facade;

import facade.models.Car;

public class CarRental {
    public Car rentCar(String carType) {
        double dailyPrice;
        switch (carType.toLowerCase()) {
            case "econômica":
                dailyPrice = 150;
                break;
            case "executiva":
                dailyPrice = 150 * 2;
                break;
            case "luxo":
                dailyPrice = 150 * 2 * 2;
                break;
            default:
                throw new IllegalArgumentException("Tipo de carro inválido");
        }
        return new Car(carType, dailyPrice);
    }

    public double calculateCarPrice(Car car, int days) {
        return car.getDailyPrice() * days;
    }
}