
package facade;

import facade.models.Seat;
import java.util.ArrayList;
import java.util.List;

public class FlightReservation {
    private List<Seat> seats;

    public FlightReservation() {
        initializeSeats();
    }

    private void initializeSeats() {
        seats = new ArrayList<>();
        // Primeira classe (fileiras 1-3)
        for (int row = 1; row <= 3; row++) {
            for (char letter : new char[] { 'A', 'B', 'C', 'D', 'E', 'F' }) {
                double price = 500 * 2.5 * 1.5; // 250% + 150%
                seats.add(new Seat(row, letter, "Primeira Classe", price));
            }
        }
        // Classe executiva (fileiras 4-8)
        for (int row = 4; row <= 8; row++) {
            for (char letter : new char[] { 'A', 'B', 'C', 'D', 'E', 'F' }) {
                double price = 500 * 2.5; // 250%
                seats.add(new Seat(row, letter, "Executiva", price));
            }
        }
        // Classe econômica (fileiras 9-32)
        for (int row = 9; row <= 32; row++) {
            for (char letter : new char[] { 'A', 'B', 'C', 'D', 'E', 'F' }) {
                seats.add(new Seat(row, letter, "Econômica", 500));
            }
        }
    }

    public Seat reserveSeat(int row, char letter) {
        for (Seat seat : seats) {
            if (seat.getRow() == row && seat.getLetter() == letter) {
                return seat;
            }
        }
        throw new IllegalArgumentException("Assento não encontrado");
    }

    public double calculateFlightPrice(List<Seat> selectedSeats) {
        return selectedSeats.stream().mapToDouble(Seat::getPrice).sum();
    }
}