package warzone;

import warzone.service.ArmoryService;
import warzone.ui.ArmoryUI;

public class App {
    public static void main(String[] args) {
        ArmoryService armoryService = new ArmoryService();
        ArmoryUI armoryUI = new ArmoryUI(armoryService);

        armoryUI.start();
    }
}