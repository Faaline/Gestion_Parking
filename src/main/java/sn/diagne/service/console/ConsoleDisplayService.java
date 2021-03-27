package sn.diagne.service.console;

import sn.diagne.domain.Detenteur;
import sn.diagne.domain.Parking;
import sn.diagne.domain.Reservation;
import sn.diagne.domain.ServiceParking;
import sn.diagne.repository.DetenteurRepository;
import sn.diagne.service.DisplayService;

import javax.xml.ws.Service;

public class ConsoleDisplayService implements DisplayService {


    public void afficherBienvenu() {
        System.out.println("Bienvenu sur la plateforme de réservation de parking!");
    }

    public void afficherMenuPrincipal() {
        System.out.println("> l pour lister les parking disponibles ");
    }


    public void afficherServicesParking(ServiceParking[] serviceParkings) {
        System.out.println("Les services disponibles dans un parking sont:");
        for (int i = 0; i < serviceParkings.length; i++) {
            ServiceParking serviceParking = serviceParkings[i];
            System.out.println(String.format("> %s %s", serviceParking.getId(), serviceParking.getNom()));
        }
    }

    @Override
    public void afficherDetenteur(Parking parking, Detenteur[] detenteurs) {

    }

    @Override
    public void afficherReservations(Parking parking, Reservation[] reservations) {

    }

    @Override
    public void afficherListeParkings(Parking[] parkings) {
        System.out.println("Les parkings disponibles sont:");
        for (int i = 0; i < parkings.length; i++) {
            Parking parking = parkings[i];
            System.out.println(String.format("> %s %s %s", parking.getId(), parking.getNom(), parking.getLieu()));
        }
    }

    @Override
    public void afficherDemandeDateRes() {System.out.println("Quelle date voulez vous reserver?");

    }

    @Override
    public void afficherConfirmationRes(String date_debut) {

    }

    @Override
    public void afficherOptionInconnue() {

    }

}
