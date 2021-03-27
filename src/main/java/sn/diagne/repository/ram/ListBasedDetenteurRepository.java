package sn.diagne.repository.ram;

import sn.diagne.domain.Detenteur;
import sn.diagne.domain.Parking;
import sn.diagne.domain.ServiceParking;
import sn.diagne.repository.DetenteurRepository;

import java.util.List;

public class ListBasedDetenteurRepository implements DetenteurRepository {
    private final List<Detenteur> detenteurs;

    public ListBasedDetenteurRepository(List<Detenteur> detenteurs) {
        this.detenteurs = detenteurs;
    }


    @Override
    public Detenteur[] getAllByParking(Parking parking, ServiceParking serviceParking) {
        detenteurs.add(new Detenteur(1, "Badara", "Diop", parking, serviceParking ));
        detenteurs.add(new Detenteur(2, "Fatou", "Sow", parking, serviceParking));
        detenteurs.add(new Detenteur(3, "Ablaye", "Niasse", parking, serviceParking));
        detenteurs.add(new Detenteur(4, "Coumba", "Sylla", parking, serviceParking));

        //return detenteurs.toArray();
        return detenteurs.toArray(new Detenteur[0]);
    }

    public Detenteur findById(int idDetenteur) {
        return null;
    }
}
