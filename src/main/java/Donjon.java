import java.util.ArrayList;

// La classe Donjon contient une liste de salles
public class Donjon {
    private ArrayList<Salle> salles;  // Liste des salles dans le donjon

    // Constructeur de la classe Donjon
    public Donjon(ArrayList<Salle> salles) {
        this.salles = salles;  // Initialisation de la liste des salles
    }

    // Méthode pour obtenir la liste des salles dans le donjon
    public ArrayList<Salle> getSalles() {
        return salles;
    }


}
