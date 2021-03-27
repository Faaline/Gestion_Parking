package sn.diagne.repository.jdbc;

import sn.diagne.domain.Parking;
import sn.diagne.repository.ParkingRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcBasedParkingRepository implements ParkingRepository {
    private final DataSource dataSource;

    public JdbcBasedParkingRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public Parking[] getAll()  {
        //requête sql pour récupèrer les infos
        String query = "SELECT id, nom, lieu FROM parking";
        //mapper le résultat
        List<Parking> parkings = new ArrayList<Parking>();

        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String lieu = rs.getString("lieu");

                //mapping retour db (relationnel) avec objet Parking
                Parking parking = new Parking( id, nom, lieu);

                parkings.add(parking);
            }
            return parkings.toArray(new Parking[0]);

        }
        catch (SQLException e) {
            return new Parking[0];
        }
        catch (Exception ex){
            return new Parking[0];
        }
    }

    public Parking getById(int id) {
        String query = "SELECT id, nom, lieu from parking where id = ?";
        try {
            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            int retrievedId = rs.getInt("id");
            String retrievedName = rs.getString("nom");
            String retrievedLieu = rs.getString("lieu");

            Parking parking = new Parking(retrievedId, retrievedName, retrievedLieu);
            return parking;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
