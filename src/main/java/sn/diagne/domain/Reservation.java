package sn.diagne.domain;

public class Reservation {
    private int id;
    private String date_debut;
    private String date_fin;
    private Parking parking;

    public Reservation(int id, String date_debut, String date_fin, Parking parking) {
        this.id = id;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.parking = parking;
    }
    public int getId(){ return id;}
    public String getDate_debut(){ return date_debut;}
    public String getDate_fin(){ return date_fin;}
}
