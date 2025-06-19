package warzone.service;

import warzone.collection.Iterator;
import warzone.collection.WeaponCollection;
import warzone.model.*;

public class ArmoryService {
    private WeaponCollection weaponCollection = new WeaponCollection();

    public ArmoryService() {
        initializeArmory();
    }

    private void initializeArmory() {
        // Armas iniciais
        addWeapon(new AssaultRifle("M4A1", 42, 800, 30, 600));
        addWeapon(new AssaultRifle("Kilo 141", 45, 750, 30, 550));
        addWeapon(new SniperRifle("AX-50", 120, 40, 10, 12));
        addWeapon(new SniperRifle("HDR", 130, 35, 5, 10));
        addWeapon(new SMG("MP5", 35, 900, 30, 90));
        addWeapon(new SMG("MAC-10", 30, 1000, 32, 95));

    }

    public void addWeapon(Weapon weapon) {
        weaponCollection.addWeapon(weapon);
    }

    public void displayAllWeapons() {
        Iterator<Weapon> iterator = weaponCollection.createIterator();

        if (!iterator.hasNext()) {
            System.out.println("Nenhuma arma cadastrada no arsenal!");
            return;
        }

        while (iterator.hasNext()) {
            Weapon weapon = iterator.next();
            weapon.displayStats();
        }
    }

    public Weapon findWeaponByName(String name) {
        Iterator<Weapon> iterator = weaponCollection.createIterator();

        while (iterator.hasNext()) {
            Weapon weapon = iterator.next();
            if (weapon.getName().equalsIgnoreCase(name)) {
                return weapon;
            }
        }
        return null;
    }
}