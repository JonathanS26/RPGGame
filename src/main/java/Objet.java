public abstract class Objet {
    protected String nom;

    // Constructeur de la classe Objet
    public Objet(String nom) {
        this.nom = nom;
    }

    // Cette méthode est abstraite car elle sera implémentée différemment
    // en fonction du type d'objet (par exemple, une potion de soin
    // restaurera les points de vie du personnage, une potion de force
    // augmentera son attaque, etc.)
    public abstract void utiliser(Personnage personnage);

    // Getter pour le nom de l'objet
    public String getNom() {
        return nom;
    }

    // Setter pour le nom de l'objet
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Surcharge de la méthode toString() pour afficher les informations de l'objet
    @Override
    public String toString() {
        return nom;
    }
}
