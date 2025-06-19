package warzone.collection;

import warzone.model.Weapon;
import java.util.List;

public class WeaponIterator implements Iterator<Weapon> {
    private List<Weapon> weapons;
    private int position = 0;

    public WeaponIterator(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public boolean hasNext() {
        return position < weapons.size();
    }

    @Override
    public Weapon next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("Não há mais armas na coleção");
        }
        Weapon weapon = weapons.get(position);
        position++;
        return weapon;
    }
}