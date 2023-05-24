// La classe Voleur hérite de la classe Hero
public class Voleur extends Hero {
    // Constructeur de la classe Voleur
    public Voleur(String nom, String prenom) {
        super(nom, prenom, 80, 10, 10);  // Appel au constructeur de la classe parente Hero avec les statistiques de base d'un Voleur
    }

    // Surcharge de la méthode toString() pour afficher les informations du Voleur
    @Override
    public String toString() {
        return "Voleur : " + super.toString();
    }
}
