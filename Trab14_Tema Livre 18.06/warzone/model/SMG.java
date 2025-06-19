package warzone.model;

public class SMG extends Weapon {
    private int mobility; // porcentagem

    public SMG(String name, int damage, int fireRate, int ammoCapacity, int mobility) {
        super(name, damage, fireRate, ammoCapacity);
        this.mobility = mobility;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Mobilidade: " + mobility + "%");
        System.out.println("Tipo: Submetralhadora");
        System.out.println("------------------------");
    }
}