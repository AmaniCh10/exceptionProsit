package org.example.GestionEmployee;

public class Responsable extends Employee{
    int prime;
    int salaire;

    public  int getPrime() {
        return this.prime;
    }


    public Responsable(){
        super();
    }

    public Responsable(int ident, String nom, String adresse, int nbr_heures,int prime) {
        super(ident, nom, adresse, nbr_heures);
        this.prime=prime;
    }
    public String tostring(){
        return "Responsable{" + super.tostring()+"prime="+ prime+'}';
    }

    public float calculerSalaire(){
        if (this.nbr_heures < 160) {
            salaire = this.nbr_heures * 10 + this.prime;
        }
        else if(this.nbr_heures >160) {
            salaire = this.nbr_heures * 10 + ((this.nbr_heures-160) *10 *20 / 100 )+ this.prime;
        }
       return salaire;
    }
}
