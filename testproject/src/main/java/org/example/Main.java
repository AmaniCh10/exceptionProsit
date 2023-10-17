package org.example;

import org.example.Entite.Produit;
import org.example.GestionEmployee.Caissier;
import org.example.GestionEmployee.Responsable;
import org.example.GestionEmployee.Vendeur;
import org.example.Magasin.Magasin;
import org.example.exceptions.MonException;
import org.example.exceptions.PrixNegatifException;

import java.util.Date;



public class Main {

    public static void main(String[] args) {
        Produit p1 = new Produit();

        System.out.println("identifiant :" + p1.getIdentifiant());
        System.out.println("marque :" + p1.getMarque());
        System.out.println("libelle :" + p1.getLibelle());
        System.out.println("prix :" + p1.getPrix());

        Produit p2 = new Produit(1024, "Delice", "Lait");
        System.out.println("Produit 2");
        System.out.println("identifiant :" + p2.getIdentifiant());
        System.out.println("marque :" + p2.getMarque());
        System.out.println("libelle :" + p2.getLibelle());
        System.out.println("prix :" + p2.getPrix());

        Produit p3 = new Produit(2510, "Vitalait", "Yaourt");
        System.out.println("Produit 3");
        System.out.println("identifiant :" + p3.getIdentifiant());
        System.out.println("marque :" + p3.getMarque());
        System.out.println("libelle :" + p3.getLibelle());
        System.out.println("prix :" + p3.getPrix());
        Produit p4 = new Produit(3250, "Sicam", "Tomate", -1.2f);
        System.out.println("Produit 4");
        System.out.println("identifiant :" + p4.getIdentifiant());
        System.out.println("marque :" + p4.getMarque());
        System.out.println("libelle :" + p4.getLibelle());
        System.out.println("prix :" + p4.getPrix());

        System.out.println("afficher Produit");
        p1.afficherProduits();
        p2.afficherProduits();
        p3.afficherProduits();
        p4.afficherProduits();
        p1.setMarque("Delice");
        System.out.println("to String");

        System.out.println(p1.toString());
        System.out.println(p1);

        System.out.println(p2.toString());

        System.out.println(p2);
        Date d1 = new Date();
        p2.setDateexp(d1);
        System.out.println("to String");
        System.out.println(p2.toString());
        System.out.println(p2);
        p2.afficherProduits();
        Produit p5 = new Produit(12, "delic", d1);
        System.out.println(p5);

        Magasin m1=new Magasin(1,"Tunis");
        Magasin m2=new Magasin(2,"Mahdia");


       // System.out.println(m1.ajouter(p5));
        Produit p6 = new Produit(13, "chocolat","said");
        //System.out.println(m2.ajouter(p6));
        p2.comparerr(p2);
        Produit.comparer(p1,p2);
        System.out.println(m2.rechercheProduit(p5));
        Produit p7 = new Produit(3250, "Sicam", "Tomate", 1.2f);
        //m1.ajouter(p7);
        Produit p8 = new Produit(1234, "biscuit", "said", 1.2f);
        //m1.ajouter(p8);
        System.out.println("le magasin m1:");
        m1.afficherMagasin();
        System.out.println("le magasin m2:");
        m2.afficherMagasin();
        System.out.println(Magasin.maxProduit(m1,m2));

        Magasin m3=new Magasin(1,"carrefour","centre ville");
        Magasin m4=new Magasin(2,"monoprix","Menzah6");
        Caissier c1=new Caissier(123,"amani","mahdia",3,10);
        Caissier c2=new Caissier(1234,"mohamed","tunis",50,30);

        Vendeur v1=new Vendeur(1596,"jihed","tozeur",15,50);
        Vendeur v2=new Vendeur(12354,"ahlem","mahdia",20,70);
        Vendeur v3=new Vendeur(2354,"aziz","monastir",30,60);
        Responsable r1=new Responsable(14785,"farah","mednine",25,2500);
        Responsable r2=new Responsable(14785,"farah","mednine",25,2500);


        System.out.println(m1.ajouter(c1));
        System.out.println(m1.ajouter(c2));
        System.out.println(m1.ajouter(v1));
        System.out.println(m1.ajouter(r1));
        m1.afficherMagasin();
        System.out.println(m1.ajouter(v1));
        System.out.println(m1.ajouter(v2));
        System.out.println(m1.ajouter(v3));
        System.out.println(m1.ajouter(r1));
        m2.afficherMagasin();
        m1.afficherSalaire();
        m1.afficherPrimeResponsable();
        m2.NombreEmplParType();
        try {
            m1.ajouter(p2);
            m1.ajouter(p3);
            m1.ajouter(p4);
            m2.ajouter(p2);
            m2.ajouter(p3);
            m2.ajouter(p4);
        }catch(MonException m) {
            System.out.println("Mon Exception est declenchée");
        }catch(PrixNegatifException p){
            System.out.println("prix negatif n'est pas accepté");
        }

        /**
         * EMPLoyee e1=new Responsable();
         * //je peut caster le e1 sur un objet caissier
         * // si Responsable e1=new Responsable();
         * je ne eut pas caster e1 sur un objet caissier
         */

    }
}