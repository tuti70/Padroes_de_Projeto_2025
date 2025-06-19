package warzone.model;

public class SniperRifle extends Weapon {
    private int zoomLevel; // ex: 8x, 12x

    public SniperRifle(String name, int damage, int fireRate, int ammoCapacity, int zoomLevel) {
        super(name, damage, fireRate, ammoCapacity);
        this.zoomLevel = zoomLevel;
    }

    @Override
    public void displayStats() {
        super.displayStats();
        System.out.println("Nível de Zoom: " + zoomLevel + "x");
        System.out.println("Tipo: Rifle de Precisão");
        System.out.println("------------------------");
    }
}