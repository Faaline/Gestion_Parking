package sn.diagne.repository;

import sn.diagne.domain.Parking;
import sn.diagne.domain.ServiceParking;

public interface ServiceParkingRepository {
    ServiceParking[] getAll();
    ServiceParking getById(int idService);
}
