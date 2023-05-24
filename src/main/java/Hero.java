// Importation de la classe ArrayList
import java.util.ArrayList;

// La classe Hero hérite de la classe Personnage
public class Hero extends Personnage {
    private ArrayList<Objet> inventaire;  // L'inventaire du héros, contenant les objets qu'il a récupérés

    // Constructeur de la classe Hero
    public Hero(String nom, String prenom, int pv, int attaque, int defense) {
        super(nom, prenom, pv, attaque, defense);  // Appel au constructeur de la classe parente Personnage
        this.inventaire = new ArrayList<>();  // Initialisation de l'inventaire
    }

    // Méthode pour ajouter un objet à l'inventaire du héros
    public void ajouterObjet(Objet objet) {
         Objet machin = new Equipement("machain",3,4);
        this.inventaire.add(objet);
        this.inventaire.add(machin);
    }

    // Méthode pour utiliser un objet de l'inventaire
    public void utiliserObjet(int index) {
        if (index < 0 || index >= inventaire.size()) {  // Si l'index est invalide
            System.out.println("Objet non trouvé dans l'inventaire.");
        } else {  // Si l'index est valide
            Objet objet = this.inventaire.get(index);
            objet.utiliser(this);  // Utilisation de l'objet
            this.inventaire.remove(index);  // Suppression de l'objet de l'inventaire après utilisation
        }
    }

    // Getter pour l'inventaire du héros
    public ArrayList<Objet> getInventaire() {
        return inventaire;
    }

    // Surcharge de la méthode toString() pour afficher les informations du héros
    @Override
    public String toString() {
        return super.toString() + "\nInventaire : " ;
        for (int index = 0; index < inventaire.size() ; index++) {
           System.out.println("- " + index + this.inventaire.get(index));
        }

    }
}
