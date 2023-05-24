import java.util.Scanner;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le RPG textuel en Java !");
        System.out.println("Veuillez créer votre personnage.");

        System.out.print("Entrez le nom de votre personnage : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom de votre personnage : ");
        String prenom = scanner.nextLine();

        System.out.print("Choisissez une classe (Guerrier, Mage, Voleur) : ");
        String classe = scanner.nextLine();

        Hero hero;
        switch (classe.toLowerCase()) {
            case "guerrier":
                hero = new Guerrier(nom, prenom);
                break;
            case "mage":
                hero = new Mage(nom, prenom);
                hero.ajouterObjet(new Equipement("test",2,6));
                break;
            case "voleur":
                hero = new Voleur(nom, prenom);
                break;
            default:
                System.out.println("Classe non reconnue. Veuillez recommencer.");
                scanner.close();
                return;
        }
        System.out.println("\nPersonnage créé : " + hero.toString());
        System.out.println("\nVous entrez dans le donjon pour y affronter les ennemis et récupérer des récompenses.");

        // Création du donjon
        ArrayList<Salle> salles = new ArrayList<>();
        // Ajout d'ennemis aux salles
        salles.add(new Salle(new ArrayList<Ennemi>() {
            {
                add(new Ennemi("Gobelin", 30, 5,2) );
            }
        }));
        salles.add(new Salle(new ArrayList<Ennemi>() {
            {
                add(new Ennemi("Squelette guerrier", 60, 12, 8));
            }
        }));
        salles.add(new Salle(new ArrayList<Ennemi>() {
            {
                add(new Boss("Dragon noir", 150, 20, 15));
            }
        }));
        Donjon donjon = new Donjon(salles);

        // Parcours des salles du donjon
        for (Salle salle : donjon.getSalles()) {
            for (Ennemi ennemi : salle.getEnnemis()) {
                Combat combat = new Combat(hero, ennemi);
                combat.combattre();
                if (hero.getPv() <= 0) {
                    System.out.println("\nDésolé, " + hero.getNom() + ", vous avez été vaincu par " + ennemi.getNom() + ".");
                    return;
                } else if (ennemi.getPv()  <=  0) {
                    System.out.println("Félicitations, " + hero.getNom() + " " + hero.getPrenom() + " ! Vous avez vaincu " +ennemi.getNom() + ".\n");
                    Objet bouclier = new Equipement("Bouclier Magique", 0,5);
                    Objet potion = new Consommable("Potion de soin", 5);
                    System.out.println(
                            "Recompence :\n" +
                              "- " + ""+bouclier.getNom()+" : " + "+ 5" + " ATK\n" +
                              "- " + ""+potion.getNom()+" : " + "+ 10" + " PV\n"
                            );

                }

            }
        }

        System.out.println("Félicitations, " + hero.getNom() + " ! Vous avez vaincu tous les ennemis et terminé le donjon.");
    }
}
