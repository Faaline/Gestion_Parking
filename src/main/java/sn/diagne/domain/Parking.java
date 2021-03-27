package sn.diagne.domain;

public class Parking {
    private int id;
    private String nom;
    private String lieu;


    public Parking(int id, String nom, String lieu) {
        this.id = id;
        this.nom = nom;
        this.lieu = lieu;
    }

    public int getId(){ return id;}
    public String getNom(){ return nom;}
    public String getLieu() { return lieu;}
}
