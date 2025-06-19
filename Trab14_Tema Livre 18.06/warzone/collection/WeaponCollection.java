package warzone.collection;

import warzone.model.Weapon;
import java.util.ArrayList;
import java.util.List;

public class WeaponCollection {
    private List<Weapon> weapons = new ArrayList<>();

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon) {
        weapons.remove(weapon);
    }

    public Iterator<Weapon> createIterator() {
        return new WeaponIterator(weapons);
    }
}