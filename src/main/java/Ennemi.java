// La classe Ennemi hérite de la classe Personnage
public class Ennemi extends Personnage {
    // Constructeur de la classe Ennemi
    public Ennemi(String nom, int pv, int attaque, int defense) {
        super(nom, "", pv, attaque, defense);  // Appel au constructeur de la classe parente Personnage
    }

    // Surcharge de la méthode toString() pour afficher les informations de l'ennemi
    @Override
    public String toString() {
        return super.toString();
    }
}
