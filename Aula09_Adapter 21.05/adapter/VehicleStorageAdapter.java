package adapter;

import legacy.OldVehicleStorage;
import modern.IVehicleStorage;
import modern.Vehicle;

public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldVehicleStorage;

    public VehicleStorageAdapter(OldVehicleStorage oldVehicleStorage) {
        this.oldVehicleStorage = oldVehicleStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        // Converter o objeto Vehicle para o formato de string esperado pelo sistema
        // legado
        String legacyData = convertVehicleToLegacyFormat(vehicle);
        oldVehicleStorage.storeVehicleData(legacyData);
    }

    private String convertVehicleToLegacyFormat(Vehicle vehicle) {
        // Formato: ID|MODELO|ANO
        return vehicle.getId() + "|" + vehicle.getModel() + "|" + vehicle.getYear();
    }
}