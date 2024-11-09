class Compte {
    private double solde;
    private double tauxInteret;

    public Compte(double solde, double tauxInteret) {
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    public void bouclerCompte() {
        solde += solde * tauxInteret;
    }

    public double getSolde() {
        return solde;
    }
}

// Classe Client
class Client {
    private String nom;
    private String ville;
    private Compte comptePrive;
    private Compte compteEpargne;

    public Client(String nom, String ville, Compte comptePrive, Compte compteEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.comptePrive = comptePrive;
        this.compteEpargne = compteEpargne;
    }

    public void afficherInformations() {
        System.out.println("Client : " + nom + " de " + ville);
        System.out.println("Solde du compte privé : " + comptePrive.getSolde() + " Francs");
        System.out.println("Solde du compte d'épargne : " + compteEpargne.getSolde() + " Francs");
    }

    public void bouclerComptes() {
        comptePrive.bouclerCompte();
        compteEpargne.bouclerCompte();
    }
}

// Classe Banque
public class Banque2 {
    public static void main(String[] args) {
        // Taux d'intérêt
        double tauxPrive = 0.01;
        double tauxEpargne = 0.02;

        // Création des comptes pour le premier client
        Compte comptePrivePedro = new Compte(1000, tauxPrive);
        Compte compteEpargnePedro = new Compte(2000, tauxEpargne);
        Client pedro = new Client("Pedro", "Genève", comptePrivePedro, compteEpargnePedro);

        // Création des comptes pour le deuxième client
        Compte comptePriveAlexandra = new Compte(3000, tauxPrive);
        Compte compteEpargneAlexandra = new Compte(4000, tauxEpargne);
        Client alexandra = new Client("Alexandra", "Lausanne", comptePriveAlexandra, compteEpargneAlexandra);

        // Afficher les informations initiales
        System.out.println("Informations initiales :");
        pedro.afficherInformations();
        alexandra.afficherInformations();

        // Boucler les comptes
        pedro.bouclerComptes();
        alexandra.bouclerComptes();

        // Afficher les informations après le bouclement
        System.out.println("\nInformations après bouclement :");
        pedro.afficherInformations();
        alexandra.afficherInformations();
    }
}