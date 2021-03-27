package sn.diagne.service.console;

import sn.diagne.domain.Detenteur;
import sn.diagne.domain.Parking;
import sn.diagne.repository.DetenteurRepository;
import sn.diagne.repository.ParkingRepository;
import sn.diagne.service.DisplayService;
import sn.diagne.service.MenuService;

import java.util.Scanner;

public class ScannerMenuService implements MenuService {

    private final DisplayService displayService;
    private final Scanner scanner;
    private final DetenteurRepository detenteurRepository;
    private final ParkingRepository parkingRepository;

    public ScannerMenuService(DisplayService displayService, DetenteurRepository detenteurRepository, ParkingRepository parkingRepository) {
        this.displayService = displayService;
        this.detenteurRepository = detenteurRepository;
        this.scanner = new Scanner(System.in);
        this.parkingRepository = parkingRepository;
    }


    private String lireChoix() {
        return scanner.next();
    }

    private void afficherMenu(String choix) {
        Parking[] parkings = parkingRepository.getAll();
        if ("l".equalsIgnoreCase(choix)) {
            displayService.afficherListeParkings(parkings);
            int idParking = scanner.nextInt();


        }
        //afficher le menu inconnu
        else {

            displayService.afficherOptionInconnue();
        }
    }

    @Override
    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
}