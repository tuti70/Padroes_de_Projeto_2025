
package facade;

import facade.models.Passenger;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TravelPackageFacade travelFacade = new TravelPackageFacade();

        // Criar passageiros
        List<Passenger> passengers = Arrays.asList(
                new Passenger("Arthur Renato", "123.456.789-00"),
                new Passenger("Beatriz Marques", "987.654.321-00"));

        // Reservar pacote de viagem
        travelFacade.bookTravelPackage(
                passengers, // Passageiros
                5, 'B', // Fileira 5, assento B (e C para Beatriz)
                "Executivo", 7, // Quarto executivo por 7 noites
                "Econômica", 5, // Carro econômico por 5 dias
                "crédito", 3 // Pagamento em 3x no crédito
        );
    }
}