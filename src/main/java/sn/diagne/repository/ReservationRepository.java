package sn.diagne.repository;

import sn.diagne.domain.Parking;
import sn.diagne.domain.Reservation;

public interface ReservationRepository {
    Reservation[] getAllByParking(Parking prestation);
    Reservation findById(int idReservation);

}
