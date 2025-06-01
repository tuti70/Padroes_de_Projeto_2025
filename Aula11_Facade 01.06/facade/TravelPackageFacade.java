
package facade;

import facade.models.*;

import java.util.List;
import java.util.ArrayList;

public class TravelPackageFacade {
    private FlightReservation flightReservation;
    private HotelReservation hotelReservation;
    private CarRental carRental;
    private PaymentSystem paymentSystem;

    public TravelPackageFacade() {
        this.flightReservation = new FlightReservation();
        this.hotelReservation = new HotelReservation();
        this.carRental = new CarRental();
        this.paymentSystem = new PaymentSystem();
    }

    public void bookTravelPackage(List<Passenger> passengers,
            int flightRow, char flightLetter,
            String roomType, int nights,
            String carType, int rentalDays,
            String paymentMethod, int installments) {

        // Reservar voo
        List<Seat> seats = new ArrayList<>();
        for (int i = 0; i < passengers.size(); i++) {
            Seat seat = flightReservation.reserveSeat(flightRow, (char) (flightLetter + i));
            seats.add(seat);
        }
        double flightPrice = flightReservation.calculateFlightPrice(seats);

        // Reservar hotel
        Room room = hotelReservation.reserveRoom(roomType, passengers.size());
        double hotelPrice = hotelReservation.calculateHotelPrice(room, passengers.size(), nights);

        // Alugar carro
        Car car = carRental.rentCar(carType);
        double carPrice = carRental.calculateCarPrice(car, rentalDays);

        // Calcular subtotal
        double subtotal = flightPrice + hotelPrice + carPrice;

        // Processar pagamento
        PaymentInfo paymentInfo = new PaymentInfo(paymentMethod, installments);
        double finalPrice = paymentSystem.calculateFinalPrice(subtotal, paymentInfo);

        // Imprimir recibo
        printInvoice(passengers, seats, room, nights, car, rentalDays,
                paymentInfo, subtotal, finalPrice);
    }

    private void printInvoice(List<Passenger> passengers, List<Seat> seats,
            Room room, int nights, Car car, int rentalDays,
            PaymentInfo paymentInfo, double subtotal, double finalPrice) {

        System.out.println("\n=== RECIBO DA VIAGEM ===");
        System.out.println("\nPassageiros:");
        for (Passenger passenger : passengers) {
            System.out.println("- " + passenger.getName() + " (CPF: " + passenger.getCpf() + ")");
        }

        System.out.println("\nDetalhes do Voo:");
        for (Seat seat : seats) {
            System.out.println("- Assento: " + seat + " - R$ " + seat.getPrice());
        }
        System.out.println("Total voo: R$ " + seats.stream().mapToDouble(Seat::getPrice).sum());

        System.out.println("\nDetalhes da Hospedagem:");
        System.out.println("- Quarto: " + room.getType() + " (" + nights + " noites)");
        System.out.println("- Preço por pessoa: R$ " + room.getPricePerPerson());
        System.out.println("Total hospedagem: R$ " + (room.getPricePerPerson() * passengers.size() * nights));

        System.out.println("\nDetalhes do Carro:");
        System.out.println("- Tipo: " + car.getType() + " (" + rentalDays + " dias)");
        System.out.println("- Diária: R$ " + car.getDailyPrice());
        System.out.println("Total carro: R$ " + (car.getDailyPrice() * rentalDays));

        System.out.println("\nPagamento:");
        System.out.println("- Método: " + paymentInfo.getMethod());
        if (paymentInfo.getMethod().equalsIgnoreCase("crédito")) {
            System.out.println("- Parcelas: " + paymentInfo.getInstallments());
        }
        System.out.println("\nSubtotal: R$ " + subtotal);
        System.out.println("Total com descontos/acréscimos: R$ " + finalPrice);
        System.out.println("\n=== BOA VIAGEM! ===\n");
    }
}