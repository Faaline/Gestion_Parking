package sn.diagne.domain;

public class Detenteur {
    private int id;
    private String prenom;
    private String nom;
    private Parking parking;
    private ServiceParking serviceParking;

    public Detenteur(int id, String prenom, String nom, Parking parking,ServiceParking serviceParking) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.parking = parking;
        this.serviceParking = serviceParking;
    }
    public int getId(){ return id;}
    public String getPrenom(){ return prenom;}
    public String getNom(){ return nom;}


}
