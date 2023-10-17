package org.example.GestionEmployee;

public abstract class Employee {
    protected int ident;
    protected String nom;
    protected String adresse;
    protected int nbr_heures;
    protected float salaire;
    boolean equal=false;


    public Employee() {

    }

    public Employee(int ident, String nom, String adresse, int nbr_heures) {
        this.ident = ident;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }
    public abstract float calculerSalaire();

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    public void afficherEmployees() {
        System.out.println(tostring());
    }

    public String tostring() {
        return "id=" + this.ident +
                ", nom='" + this.nom + '\'' +
                ", adresse='" + this.adresse + '\'' +
                ", nbr d'heures=" + this.nbr_heures;
    }
   /* public boolean equals(Object ob){
        if (ob instanceof Responsable){

        }*/






}



