// La classe Consommable hérite de la classe Objet
public class Consommable extends Objet {
    private int valeur;  // La valeur du consommable, par exemple combien de points de vie il restaure

    // Constructeur de la classe Consommable
    public Consommable(String nom, int valeur) {
        super(nom);  // Appel au constructeur de la classe parente Objet
        this.valeur = valeur;
    }

    // Méthode pour utiliser le consommable
    // Cette méthode est une implémentation de la méthode abstraite utiliser de la classe parente Objet
    public void utiliser(Personnage personnage) {
        personnage.pv += this.valeur;  // Le personnage récupère des points de vie égaux à la valeur du consommable
        if (personnage.pv > 100) {  // Si les points de vie du personnage dépassent 100
            personnage.pv = 100;  // Les points de vie du personnage sont plafonnés à 100
        }
    }

    // Getter pour la valeur du consommable
    public int getValeur() {
        return valeur;
    }

    // Setter pour la valeur du consommable
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    // Surcharge de la méthode toString() pour afficher les informations du consommable
    @Override
    public String toString() {
        return super.toString() + " (Restaure " + valeur + " PV)";
    }
}
