import java.util.ArrayList;

// La classe Salle contient une liste d'ennemis
public class Salle {
    private ArrayList<Ennemi> ennemis;  // Liste des ennemis dans la salle

    // Constructeur de la classe Salle
    public Salle(ArrayList<Ennemi> ennemis) {
        this.ennemis = ennemis;  // Initialisation de la liste des ennemis
    }

    // Méthode pour obtenir la liste des ennemis dans la salle
    public ArrayList<Ennemi> getEnnemis() {
        return ennemis;
    }
}
