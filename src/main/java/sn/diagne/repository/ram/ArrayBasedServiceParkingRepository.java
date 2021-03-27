package sn.diagne.repository.ram;

import sn.diagne.domain.ServiceParking;
import sn.diagne.repository.ServiceParkingRepository;

public class ArrayBasedServiceParkingRepository implements ServiceParkingRepository {
    public static final ServiceParking[] SERVICE_PARKINGS = {
            new ServiceParking(1, "Reservation"),
            new ServiceParking(2, "Abonnement"),
    };

    public ServiceParking[] getAll(){
        return SERVICE_PARKINGS;
    }

    public ServiceParking getById(int idService){
        ServiceParking serviceParking;
        for (int i = 0; i < SERVICE_PARKINGS.length; i++) {
            if(idService == SERVICE_PARKINGS[i].getId()){
                return SERVICE_PARKINGS[i];
            }
        }
        return null;
    }
}
