package sn.diagne.service.web;

import sn.diagne.domain.Detenteur;
import sn.diagne.domain.Parking;
import sn.diagne.domain.Reservation;
import sn.diagne.domain.ServiceParking;
import sn.diagne.service.DisplayService;

public class WebDisplayService implements DisplayService {
    @Override
    public void afficherBienvenu() {

    }

    public void afficherMenuPrincipal(){

    }

   public void afficherListeParkings(Parking[] parkings){

   }

    @Override
    public void afficherServicesParking(ServiceParking[] serviceParkings) {

    }

    @Override
    public void afficherDetenteur(Parking parking, Detenteur[] detenteurs) {

    }

    public void afficherDetenteurs(Parking parking, Detenteur[] detenteurs){

   }

  public void afficherReservations(Parking parking, Reservation[] reservations){

  }

    public void afficherDemandeDateRes(){

    }

   public void afficherConfirmationRes(String date_debut){

   }

    public void afficherOptionInconnue(){

    }
}
