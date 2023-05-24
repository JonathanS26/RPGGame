import java.util.Scanner;

// La classe Combat gère un combat entre un héro et un ennemi
public class Combat {
    private Hero hero;  // Le héro qui participe au combat
    private Ennemi ennemi;  // L'ennemi qui participe au combat

    // Constructeur de la classe Combat
    public Combat(Hero hero, Ennemi ennemi) {
        this.hero = hero;  // Initialisation du héro
        this.ennemi = ennemi;  // Initialisation de l'ennemi
    }

    // Méthode pour gérer le combat
    public void combattre() {
        Scanner scanner = new Scanner(System.in);
        while(hero.getPv() > 0 && ennemi.getPv() > 0) {
            System.out.println("\n"+hero.getNom() + " " + hero.getPrenom() +" (PV : " + hero.getPv() + ") vs " + ennemi.getNom() + " (PV : " + ennemi.getPv() + ")");
            System.out.println("Choisissez une action :");
            System.out.println("1. Attaquer");
            System.out.println("2. Utiliser un objet");
            System.out.println("3. Fuir");
            System.out.println("Votre choix (1, 2 ou 3): ");
            int choix = scanner.nextInt();

            switch(choix) {
                case 1:
                    // Attaque du héros
                    ennemi.setPv(ennemi.getPv() - hero.getAttaque());
                    System.out.println(hero.getNom() + " attaque " + ennemi.getNom() + ".");
                    System.out.println(ennemi.getNom() + " subit " + hero.getAttaque() + " points de dégâts.");
                    break;
                case 2:
                    // Utilisation d'un objet
                    System.out.println("Choisissez un objet à utiliser :");
                    for (Objet objet : hero.getInventaire()) {
                        System.out.println(objet.toString());
                    }

                    break;
                case 3:
                    // Fuite
                    System.out.println(hero.getNom() + " a choisi de fuir le combat.");
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez choisir 1, 2 ou 3.");
                    continue;
            }

            if(ennemi.getPv() <= 0) {
                System.out.println(ennemi.getNom() + " est vaincu !");
                // Gestion des récompenses ici
                hero.ajouterObjet(new Equipement("Armur Magique",15,20));
                break;
            }

            // Attaque de l'ennemi
            hero.setPv(hero.getPv() - ennemi.getAttaque());
            System.out.println(ennemi.getNom() + " attaque " + hero.getNom() + ".");
            System.out.println(hero.getNom() + " subit " + ennemi.getAttaque() + " points de dégâts.");

            if(hero.getPv() <= 0) {
                System.out.println(hero.getNom() + " a été vaincu par " + ennemi.getNom() + ".");
            }
        }
    }
}

