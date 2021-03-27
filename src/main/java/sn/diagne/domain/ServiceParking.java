package sn.diagne.domain;

public class ServiceParking {
    private int id;
    private String nom;

    public ServiceParking(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public int getId(){ return id;}
    public String getNom(){ return nom;}
}
