package sn.diagne;

import sn.diagne.controller.ClientController;

public class GesParkApp {
    public static void main(String[] args) {
        System.out.println("Initialisation application");
        ClientController clientController = new ClientController();
        clientController.process();
    }
}
