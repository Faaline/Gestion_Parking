package sn.diagne.domain;

public class Abonnement {
    private int id;
    private String date_debutA;
    private String date_finA;
    private Parking parking;

    public Abonnement(int id, String date_debutA, String date_finA, Parking parking) {
        this.id = id;
        this.date_debutA = date_debutA;
        this.date_finA = date_finA;
        this.parking = parking;
    }
    public int getId(){ return id;}
    public String getDate_debut(){ return date_debutA;}
    public String getDate_fin(){ return date_finA;}
}
