package sn.diagne.service;

import sn.diagne.domain.Detenteur;
import sn.diagne.domain.Parking;
import sn.diagne.domain.Reservation;
import sn.diagne.domain.ServiceParking;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeParkings(Parking[] parkings);

    void afficherServicesParking(ServiceParking[] serviceParkings);

    void afficherDetenteur(Parking parking, Detenteur[] detenteurs);

    void afficherReservations(Parking parking, Reservation[] reservations);

    void afficherDemandeDateRes();

    void afficherConfirmationRes(String date_debut);

    void afficherOptionInconnue();
}
