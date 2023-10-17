package org.example.GestionEmployee;

public class Vendeur extends Employee{
    int tauxDeVente;
    public Vendeur(){
        super();
    }

    public Vendeur(int ident, String nom, String adresse, int nbr_heures ,int tauxDeVente) {
        super(ident, nom, adresse, nbr_heures);
        this.tauxDeVente=tauxDeVente;
    }
    public String tostring(){
        return "Vendeur{" + super.tostring()+"taux de vente="+ tauxDeVente+'}';
    }
@Override
    public float calculerSalaire(){
        salaire=450+this.tauxDeVente;
        return salaire;
    }
}
