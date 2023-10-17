package org.example.GestionEmployee;

public class Caissier extends Employee{
    private int numeroDeCaisse;

    public  Caissier(){
        super();
    }

    public Caissier(int ident, String nom, String adresse, int nbr_heures,int numeroDeCaisse) {
        super(ident, nom, adresse, nbr_heures);
        this.numeroDeCaisse=numeroDeCaisse;
    }
    public String tostring(){
        return "Caissier{" + super.tostring()+"numeroDeCaisse="+ numeroDeCaisse+'}';
    }
    @Override
    public float calculerSalaire(){
        if(this.nbr_heures < 160){
        salaire=this.nbr_heures*5;
    } else if(this.nbr_heures > 160){
           // salaire=this.nbr_heures*5+((this.nbr_heures-180)*5*15/100);
            salaire = 160*5  + (this.nbr_heures-160)*(5f+(5*0.15f)) ;
        }
        return salaire;
    }

}
