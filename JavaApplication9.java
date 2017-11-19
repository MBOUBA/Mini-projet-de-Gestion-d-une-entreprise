/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author MBOUBA Soubeye Denis
 */ 

    /**
     * @param args the command line arguments
     */
    
    /**
     * La classe Employé
     */
    abstract class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private String date;
 
 
    public Employe(String prenom, String nom, int age, String date,String matricule) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
        
    }
 
    public abstract double calculerSalaire();
 
    public String getTitre()
        {
            return "L'employé " ;
        }
 
    public String getNom() {
        return getTitre() + prenom + " " + nom +" de matricule "+matricule;
   }
}
   /**
    * La classe Commercial (regroupe vendeur et représentant)
    */
    abstract class Commercial extends Employe {
    private double chiffreAffaire;
 
    public Commercial(String prenom, String nom, int age, String date,
               double chiffreAffaire,String matricule) {
        super(prenom, nom, age, date,matricule);
        this.chiffreAffaire = chiffreAffaire;
    }
 
    public double getChiffreAffaire()
        {
            return chiffreAffaire;
        }
 
}
    /**
     * La classe Vendeur
     */
     class Vendeur extends Commercial {
    private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 400;
 
    public Vendeur(String prenom, String nom, int age, String date,
            double chiffreAffaire, String matricule) {
        super(prenom, nom, age, date, chiffreAffaire,matricule);
    }
 
    public double calculerSalaire() {
        return (POURCENT_VENDEUR * getChiffreAffaire()) + BONUS_VENDEUR;
    }
 
    public String getTitre()
        {
            return "Le vendeur ";
        }
 
}
    /**
     * La classe Représentant
     */
     class Representant extends Commercial {
    private final static double POURCENT_REPRESENTANT = 0.2;
    private final static int BONUS_REPRESENTANT = 800;
 
    public Representant(String prenom, String nom, int age, String date, double chiffreAffaire,String matricule) {
        super(prenom, nom, age, date, chiffreAffaire,matricule);
    }
 
    public double calculerSalaire() {
        return (POURCENT_REPRESENTANT * getChiffreAffaire()) + BONUS_REPRESENTANT;
    }
 
    public String getTitre()
        {
            return "Le représentant ";
        }
}
    /**
     * La classe Technicien(Production)
     */
    class Technicien extends Employe {
    private final static double FACTEUR_UNITE = 5.0;
    private int unites;
 
    public Technicien(String prenom, String nom, int age, String date, int unites,String matricule) {
        super(prenom, nom, age, date,matricule);
        this.unites = unites;
    }
 
    public double calculerSalaire() {
        return FACTEUR_UNITE * unites;
    }
 
    public String getTitre()
        {
            return "Le technicien ";
        }
}
    /**
     * La classe Manutentionnaire
     */
    class Manutentionnaire extends Employe {
    private final static double SALAIRE_HORAIRE = 65.0;
    private int heures;
 
    public Manutentionnaire(String prenom, String nom, int age, String date,
                     int heures,String matricule) {
        super(prenom, nom, age, date,matricule);
        this.heures = heures;
    }
 
    public double calculerSalaire() {
        return SALAIRE_HORAIRE * heures;
    }
 
    public String getTitre()
        {
            return "Le manut. " ;
        }
}
    /**
     * L'interface d'employé à risque
     */
    interface ARisque {
    int PRIME = 200;
}
    /**
     * Une première sous classe d'employé à risque
     */
    class TechnARisque extends Technicien implements ARisque {
 
    public TechnARisque(String prenom, String nom, int age, String date, int unites,String matricule) {
        super(prenom, nom, age, date, unites,matricule);
    }
 
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}
    /**
     * Une autre sous-classe d'employé à risque
     */
    class ManutARisque extends Manutentionnaire implements ARisque {
 
    public ManutARisque(String prenom, String nom, int age, String date, int heures,String matricule) {
        super(prenom, nom, age, date, heures,matricule);
    }
 
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}
    /**
     *  La classe Personnel
     */
    
    



