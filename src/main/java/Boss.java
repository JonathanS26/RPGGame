// La classe Boss hérite de la classe Ennemi
public class Boss extends Ennemi {
    // Constructeur de la classe Boss
    public Boss(String nom, int pv, int attaque, int defense) {
        super(nom, pv, attaque, defense);  // Appel au constructeur de la classe parente Ennemi
    }



    // Surcharge de la méthode toString() pour afficher les informations du boss
    @Override
    public String toString() {
        return "Boss : " + super.toString();
    }
}
