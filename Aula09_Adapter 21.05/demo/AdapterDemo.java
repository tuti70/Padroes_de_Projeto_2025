package demo;

import adapter.VehicleStorageAdapter;
import legacy.OldVehicleStorage;
import modern.Vehicle;

public class AdapterDemo {
    public static void main(String[] args) {
        // Criar instância do sistema legado
        OldVehicleStorage legacyStorage = new OldVehicleStorage();

        // Criar adapter que implementa a interface moderna
        VehicleStorageAdapter adapter = new VehicleStorageAdapter(legacyStorage);

        // Criar um veículo moderno
        Vehicle vehicle = new Vehicle("VH12345", "Scania R500", 2022);

        // Salvar usando a interface moderna (que internamente usa o sistema legado)
        adapter.saveVehicleData(vehicle);

        System.out.println("Dados do veículo foram armazenados com sucesso usando o padrão Adapter!");
    }
}