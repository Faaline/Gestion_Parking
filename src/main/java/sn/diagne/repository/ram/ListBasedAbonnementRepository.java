package sn.diagne.repository.ram;

import sn.diagne.domain.Abonnement;
import sn.diagne.domain.Parking;
import sn.diagne.domain.Reservation;
import sn.diagne.repository.AbonnementRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedAbonnementRepository implements AbonnementRepository {

    private final List<Abonnement> abonnements;

    public ListBasedAbonnementRepository() { this.abonnements = new ArrayList<Abonnement>(); }

    @Override
    public Abonnement[] getAllByParking(Parking parking) {
        abonnements.add(new Abonnement(1, "02/03/2020", "07/03/2020", parking));
        abonnements.add(new Abonnement(2, "03/03/2020", "03/08/2020", parking));
        abonnements.add(new Abonnement(3, "04/05/2020", "03/08/2020", parking));
        abonnements.add(new Abonnement(4, "02/06/2020", "10/06/2020", parking));

        //return reservations.toArray();
        return abonnements.toArray(new Abonnement[0]);
    }

    public Abonnement findById(int idAbonnement) {
        return null;
    }
}
