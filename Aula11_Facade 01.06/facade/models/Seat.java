
package facade.models;

public class Seat {
    private int row;
    private char letter;
    private String seatClass;
    private double price;

    public Seat(int row, char letter, String seatClass, double price) {
        this.row = row;
        this.letter = letter;
        this.seatClass = seatClass;
        this.price = price;
    }

    // Getters
    public int getRow() {
        return row;
    }

    public char getLetter() {
        return letter;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return row + "" + letter + " (" + seatClass + ")";
    }
}