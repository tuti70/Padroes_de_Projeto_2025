
package facade.models;

public class Passenger {
    private String name;
    private String cpf;

    public Passenger(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}