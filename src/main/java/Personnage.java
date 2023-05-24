/*
 * Nom de classe : Personnage
 *
 * Description   :  Classe abstraite car on ne l'instanciera jamais directement.
 *
 * Version       : 1.0
 *
 * Date          : 23/05/2023
 *
 */

import java.util.ArrayList;


public abstract class Personnage {
    // Attributs communs à tous les personnages
    protected String nom;
    protected String prenom;
    protected int pv; // Points de Vie
    protected int attaque;
    protected int defense;
    protected ArrayList<Objet> objets; // Liste des objets que le personnage possède

    // Constructeur de la classe Personnage
    public Personnage(String nom, String prenom, int pv, int attaque, int defense) {
        this.nom = nom;
        this.prenom = prenom;
        this.pv = pv;
        this.attaque = attaque;
        this.defense = defense;
        this.objets = new ArrayList<>(); // Initialise une liste vide d'objets
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }


    public ArrayList<Objet> getObjets() {
        return objets;
    }

    public void setObjets(ArrayList<Objet> objets) {
        this.objets = objets;
    }

    // Méthode pour attaquer un autre personnage
    public void attaquer(Personnage cible) {
        int degats = this.attaque - cible.defense; // Les dégâts sont égaux à l'attaque de ce personnage moins la défense de la cible
        if (degats > 0) { // Si les dégâts sont positifs
            cible.recevoirDegats(degats); // La cible reçoit les dégâts
        }
    }

    // Méthode pour recevoir des dégâts
    public void recevoirDegats(int degats) {
        this.pv -= degats; // Les points de vie sont réduits du montant des dégâts
        if (this.pv < 0) { // Si les points de vie deviennent négatifs
            this.pv = 0; // Les points de vie sont fixés à 0
        }
    }

    // Méthode pour vérifier si le personnage est en vie
    public boolean isAlive() {
        return this.pv > 0; // Renvoie vrai si les points de vie sont supérieurs à 0, faux sinon
    }

    // Méthode pour utiliser un objet
    public void utiliserObjet(int index) {
        if (index >= 0 && index < objets.size()) { // Si l'index est valide
            objets.get(index).utiliser(this); // Utilise l'objet à cet index
        }
    }

    // Méthode pour ajouter un objet à la liste des objets du personnage
    public void ajouterObjet(Objet objet) {
        objets.add(objet); // Ajoute l'objet à la liste
    }

    // Méthode pour afficher les informations du personnage
    @Override
    public String toString() {
        return nom + " " + prenom + " (PV: " + pv + ", Attaque: " + attaque + ", Defense: " + defense + ")";
    }
}
