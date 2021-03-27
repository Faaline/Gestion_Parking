package sn.diagne.repository;

import sn.diagne.domain.Parking;

public interface ParkingRepository {
    Parking[] getAll();
    Parking getById(int id);


}
