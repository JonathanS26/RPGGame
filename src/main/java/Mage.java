// La classe Mage hérite de la classe Hero
public class Mage extends Hero {
    // Constructeur de la classe Mage
    public Mage(String nom, String prenom) {
        super(nom, prenom, 100, 15, 10);  // Appel au constructeur de la classe parente Hero avec les statistiques de base d'un Mage

    }

    // Surcharge de la méthode toString() pour afficher les informations du Mage
    @Override
    public String toString() {
        return "Mage : " + super.toString();
    }
}
