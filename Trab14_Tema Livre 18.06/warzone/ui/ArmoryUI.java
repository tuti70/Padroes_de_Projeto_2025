package warzone.ui;

import warzone.model.AssaultRifle;
import warzone.model.SMG;
import warzone.model.SniperRifle;
import warzone.model.Weapon;
import warzone.service.ArmoryService;
import java.util.Scanner;

public class ArmoryUI {
    private ArmoryService armoryService;
    private Scanner scanner;

    public ArmoryUI(ArmoryService armoryService) {
        this.armoryService = armoryService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== SISTEMA DE ARSENAL - WARZONE ===");

        while (true) {
            displayMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (option) {
                case 1:
                    listAllWeapons();
                    break;
                case 2:
                    searchWeapon();
                    break;
                case 3:
                    addNewWeapon();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void displayMenu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("1. Listar todas as armas");
        System.out.println("2. Buscar arma por nome");
        System.out.println("3. Adicionar nova arma");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void listAllWeapons() {
        System.out.println("\n=== LISTA DE ARMAS ===");
        armoryService.displayAllWeapons();
    }

    private void searchWeapon() {
        System.out.print("\nDigite o nome da arma que deseja buscar: ");
        String name = scanner.nextLine();

        Weapon weapon = armoryService.findWeaponByName(name);

        if (weapon != null) {
            System.out.println("\nArma encontrada:");
            weapon.displayStats();
        } else {
            System.out.println("Arma não encontrada!");
        }
    }

    private void addNewWeapon() {
        System.out.println("\n=== ADICIONAR NOVA ARMA ===");
        System.out.println("Tipos disponíveis:");
        System.out.println("1. Rifle de Assalto");
        System.out.println("2. Rifle de Precisão");
        System.out.println("3. Submetralhadora");
        System.out.print("Escolha o tipo: ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.print("Nome da arma: ");
        String name = scanner.nextLine();

        System.out.print("Dano: ");
        int damage = scanner.nextInt();

        System.out.print("Cadência de tiro (DPM): ");
        int fireRate = scanner.nextInt();

        System.out.print("Capacidade do pente: ");
        int ammoCapacity = scanner.nextInt();

        switch (type) {
            case 1:
                System.out.print("Alcance efetivo (metros): ");
                int range = scanner.nextInt();
                armoryService.addWeapon(new AssaultRifle(name, damage, fireRate, ammoCapacity, range));
                break;
            case 2:
                System.out.print("Nível de zoom (ex: 8): ");
                int zoom = scanner.nextInt();
                armoryService.addWeapon(new SniperRifle(name, damage, fireRate, ammoCapacity, zoom));
                break;
            case 3:
                System.out.print("Mobilidade (%): ");
                int mobility = scanner.nextInt();
                armoryService.addWeapon(new SMG(name, damage, fireRate, ammoCapacity, mobility));
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }

        System.out.println("Arma adicionada com sucesso!");
    }
}