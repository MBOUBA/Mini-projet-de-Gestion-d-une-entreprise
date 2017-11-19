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
public class Salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Mbouba", "Business", 27, "1991", 30000," 16B011FS"));
        p.ajouterEmploye(new Representant("Soubeye", "Vendtout", 20, "1998", 20000,"16B715FS "));
        p.ajouterEmploye(new Technicien("Denis", "Bosseur", 23, "1995", 1000,"16B345FS "));
        p.ajouterEmploye(new Manutentionnaire("Yadia", "Stocketout", 30, "1987", 45,"15A009FSJP "));
        p.ajouterEmploye(new TechnARisque("obrayane", "Flippe", 25, "1998", 1000,"12B085FS "));
        p.ajouterEmploye(new ManutARisque("popito", "Abordage", 28, "1989", 45,"18E567FS "));
 
        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " francs.");
   
    }
    
}
