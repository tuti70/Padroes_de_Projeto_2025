package warzone.model;

public class AssaultRifle extends Weapon {
    private int effectiveRange; // em metros

    public AssaultRifle(String name, int damage, int fireRate, int ammoCapacity, int effectiveRange) {
        super(name, damage, fireRate, ammoCapacity);
        this.effectiveRange = effectiveRange;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Alcance Efetivo: " + effectiveRange + "m");
        System.out.println("Tipo: Rifle de Assalto");
        System.out.println("------------------------");
    }
}