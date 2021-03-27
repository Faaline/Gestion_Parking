package sn.diagne.repository.ram;

import sn.diagne.domain.Detenteur;
import sn.diagne.domain.Parking;
import sn.diagne.domain.Reservation;
import sn.diagne.repository.ReservationRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedReservationRepository implements ReservationRepository {
    private final List<Reservation> reservations;

    public ListBasedReservationRepository() { this.reservations = new ArrayList<Reservation>(); }

    @Override
    public Reservation[] getAllByParking(Parking parking) {
        reservations.add(new Reservation(1, "02/03/2020", "03/03/2020", parking));
        reservations.add(new Reservation(1, "03/03/2020", "03/05/2020", parking));
        reservations.add(new Reservation(1, "02/05/2020", "03/05/2020", parking));
        reservations.add(new Reservation(1, "02/06/2020", "03/06/2020", parking));

        //return reservations.toArray();
        return reservations.toArray(new Reservation[0]);
    }

    public Reservation findById(int idReservation) {
        return null;
    }
}
