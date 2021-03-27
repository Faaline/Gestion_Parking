package sn.diagne.repository;

import sn.diagne.domain.Detenteur;
import sn.diagne.domain.Parking;
import sn.diagne.domain.ServiceParking;

public interface DetenteurRepository {
    Detenteur[] getAllByParking(Parking parking, ServiceParking serviceParking);
    Detenteur findById(int idDetenteur);

}
