package warzone.model;

public abstract class Weapon {
    private String name;
    private int damage;
    private int fireRate; // disparos por minuto
    private int ammoCapacity;

    public Weapon(String name, int damage, int fireRate, int ammoCapacity) {
        this.name = name;
        this.damage = damage;
        this.fireRate = fireRate;
        this.ammoCapacity = ammoCapacity;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getFireRate() {
        return fireRate;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public void displayStats() {
        System.out.println("Arma: " + name);
        System.out.println("Dano: " + damage);
        System.out.println("Cadência de Tiro: " + fireRate + " DPM");
        System.out.println("Capacidade do Pente: " + ammoCapacity);
    }
}