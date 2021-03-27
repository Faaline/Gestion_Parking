package sn.diagne.repository;

import sn.diagne.domain.Abonnement;
import sn.diagne.domain.Parking;

public interface AbonnementRepository {
    Abonnement[] getAllByParking(Parking prestation);
    Abonnement findById(int idAbonnement);
}
