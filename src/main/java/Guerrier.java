// La classe Guerrier hérite de la classe Hero
public class Guerrier extends Hero {
    // Constructeur de la classe Guerrier
    public Guerrier(String nom, String prenom) {
        super(nom, prenom, 150, 20, 15);  // Appel au constructeur de la classe parente Hero avec les statistiques de base d'un Guerrier
    }

    // Surcharge de la méthode toString() pour afficher les informations du Guerrier
    @Override
    public String toString() {
        return "Guerrier : " + super.toString();
    }
}
