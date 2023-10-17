package org.example.Entite;

import java.util.Date;

public class Produit {

    int identifiant;
    String libelle, marque;
    float prix;

    Date dateexp;


    public Produit(int id, String marque, String lb) {
        identifiant = id;
        this.marque = marque;
        libelle = lb;
    }

    public Produit(int id, String marque, String lib, float prix) {
        identifiant = id;
        this.marque = marque;
        libelle = lib;
        this.prix = prix;
    }

    public Produit() {
    }

    public Produit(int id, String mar) {
        identifiant = id;
        marque = mar;
    }

    public Produit(int id, String mar, Date da) {
        identifiant = id;
        marque = mar;
        dateexp = da;
    }

    public Produit(String lib, int id) {

        identifiant = id;
        libelle = lib;
    }

    public void setPrix(float prix) {
        if (prix < 0) {
            throw new IllegalArgumentException("Le prix ne doit pas être négatif");
        }
        this.prix = prix;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public Date getDateexp() {
        return dateexp;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }

    public void afficherProduits() {
        System.out.println(identifiant + " " + libelle + " " + marque + " " + prix);
    }

    public String tostring() {
        return "prod{" + "id=" + this.identifiant +
                ", lib='" + this.libelle + '\'' +
                ", marque='" + this.marque + '\'' +
                ", prix=" + this.prix +
                ",date_exp=" + this.dateexp +
                '}';
    }

    public static void comparer(Produit p1, Produit p2) {
        if ((p1.identifiant == p2.identifiant) && (p1.libelle == p2.libelle) && (p1.prix == p2.prix)) {
            System.out.println("Les deux produits sont identiques");
        } else System.out.println("Les deux produits sont différents");

    }

    public void comparerr(Produit p) {
        if ((this.identifiant == p.identifiant) && (this.libelle == p.getLibelle()) && (this.prix == p.prix)) {
            System.out.println("Les deux produits sont identiques");
        } else System.out.println("Les deux produits sont différents");


    }
}

