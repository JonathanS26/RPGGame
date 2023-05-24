// La classe Equipement hérite de la classe Objet
public class Equipement extends Objet {
    private int bonusAttaque;  // Le bonus d'attaque que l'équipement donne au personnage
    private int bonusDefense;  // Le bonus de défense que l'équipement donne au personnage

    // Constructeur de la classe Equipement
    public Equipement(String nom, int bonusAttaque, int bonusDefense) {
        super(nom);  // Appel au constructeur de la classe parente Objet
        this.bonusAttaque = bonusAttaque;
        this.bonusDefense = bonusDefense;
    }

    // Méthode pour utiliser l'équipement
    // Cette méthode est une implémentation de la méthode abstraite utiliser de la classe parente Objet
    public void utiliser(Personnage personnage) {
        personnage.attaque += this.bonusAttaque;  // Le personnage gagne un bonus d'attaque égal à bonusAttaque
        personnage.defense += this.bonusDefense;  // Le personnage gagne un bonus de défense égal à bonusDefense
    }

    // Getter pour le bonus d'attaque de l'équipement
    public int getBonusAttaque() {
        return bonusAttaque;
    }

    // Setter pour le bonus d'attaque de l'équipement
    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    // Getter pour le bonus de défense de l'équipement
    public int getBonusDefense() {
        return bonusDefense;
    }

    // Setter pour le bonus de défense de l'équipement
    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    // Surcharge de la méthode toString() pour afficher les informations de l'équipement
    @Override
    public String toString() {
        return super.toString() + " (Bonus Attaque: " + bonusAttaque + ", Bonus Défense: " + bonusDefense + ")";
    }
}
