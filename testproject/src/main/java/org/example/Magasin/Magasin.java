package org.example.Magasin;


import org.example.Entite.Produit;
import org.example.GestionEmployee.Caissier;
import org.example.GestionEmployee.Employee;
import org.example.GestionEmployee.Responsable;
import org.example.GestionEmployee.Vendeur;
import org.example.exceptions.MonException;
import org.example.exceptions.PrixNegatifException;

public class Magasin {
    int identifiant;
    String nomMagasin;
    String adresse;
    final int capMagasin = 2;
    public static int comp = 0;
    static final  int maxEmp=20;
    public static int compEmp = 0;
    int c = 0;
    int v=0;
    int r=0;
    private Employee[] tabempl=new Employee[maxEmp];

    Produit[] prodMagasin = new Produit[capMagasin];


    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
    }
    public Magasin(int identifiant, String nomMagasin,String adresse){
        this.identifiant=identifiant;
        this.nomMagasin=nomMagasin;
        this.adresse=adresse;
    }

    public void ajouter(Produit p) throws MonException, PrixNegatifException {

        if (comp < capMagasin) {
            if (p.getPrix() > 0) {
                prodMagasin[comp] = p;
                comp++;
                System.out.println("Produit ajouté");
            } else {
                throw new PrixNegatifException("Les prix négatifs ne sont pas acceptés");
            }
        } else {

            throw new MonException("La taille du tableau est dépassée");
        }
    }



    public boolean rechercheProduit(Produit p) {
        boolean ProdExist = false;
        for (int i = 0; i < this.prodMagasin.length; i++) {
            if (this.prodMagasin[i] != null && this.prodMagasin[i].getIdentifiant() == p.getIdentifiant()&&this.prodMagasin[i].getMarque() == p.getMarque()&&this.prodMagasin[i].getLibelle() == p.getLibelle()&&this.prodMagasin[i].getPrix() == p.getPrix()&&this.prodMagasin[i].getDateexp() == p.getDateexp()) {
                ProdExist = true;
                break;
            }
        }
        return ProdExist;
    }


    public void supprimerProduit(Produit p) {
        for (Produit prod : prodMagasin) {
            if (this.rechercheProduit(prod) == true) {
                prod.setIdentifiant(0);
                prod.setMarque("");
                prod.setLibelle("");
                prod.setPrix(0);
                System.out.println("prod supprimer");
            }
            else  System.out.println("prod non supprimer");


        }
    }
    public static Magasin maxProduit(Magasin m,Magasin n) {
     if ((m.comp)<(n.comp)){
            System.out.println("le magasin "+n.identifiant+" a "+n.adresse+" ayant un nbr superieur de produits");
            return n;
        }
            else
                System.out.println("le magasin "+m.identifiant+" a "+m.adresse+" ayant un nbr superieur de produits");

        return n;
    }
    public String ajouter(Employee e) {
            tabempl[compEmp] = e;
            compEmp++;
            return "Employee ajouté";
        }
        public String tostring(){
        return "identifiant: " + this.identifiant + "  adresse: " + this.adresse;
        }

    public void afficherSalaire(){
        for (Employee employe : tabempl) {
            if (employe != null) {
                System.out.println(employe.getNom() + " " + employe.calculerSalaire());
            }
        }
    }
    public void afficherMagasin() {
        tostring();
        for (Produit p : prodMagasin)
            if (p != null)
                p.afficherProduits();
        for (Employee e : tabempl)
            if (e != null){
                System.out.println("les employees de cette magasin: ");
                e.afficherEmployees();
            }
    }
    public void afficherPrimeResponsable(){
        System.out.println("les primes des reponsables: ");
        for (Employee e : tabempl)
            if (e != null){
                if(e instanceof Responsable) {
                    int prime =((Responsable) e).getPrime();
                    System.out.println(e.getNom()+prime);
                }
                else System.out.println("ce n'est pas un responsable ");


            }

        }
    public void NombreEmplParType(){

     for (Employee emp:tabempl) {
         if (emp != null) {
             if (emp instanceof Caissier) {
                 c = c + 1;
             } else if (emp instanceof Vendeur) {
                 v = v + 1;
             } else if (emp instanceof Responsable) {
                 r = r + 1;
             }
         }
     }
             System.out.println("il ya "+c+" Caissier");
             System.out.println("il ya "+v+" vendeurs");
             System.out.println("il ya "+r+" Responsables");





    }

}



