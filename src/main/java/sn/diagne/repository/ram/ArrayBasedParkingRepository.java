package sn.diagne.repository.ram;

import sn.diagne.domain.Parking;
import sn.diagne.repository.ParkingRepository;

public class ArrayBasedParkingRepository implements ParkingRepository {

    public static final Parking[] PARKINGS = {
            new Parking(1, "Sunu Parking", "Medina"),
            new Parking(2, "Kaay Garer", "Centre ville"),
            new Parking(3, "DakParking", "Guediawaye"),
    };

    public Parking[] getAll(){
        return PARKINGS;
    }

    public Parking getById(int id){
        Parking parking;
        for (int i = 0; i < PARKINGS.length; i++) {
            if(id == PARKINGS[i].getId()){
                return PARKINGS[i];
            }
        }
        return null;
    }
}
