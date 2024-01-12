package Main;
import Biens.Produit;
import Biens.ProduitService;

public class Application {

    public static void main(String[] args) {
        ProduitService service = new ProduitService();
        Produit produit1 = new Produit(1, "Hp", 200.4, 12);
        Produit produit2 = new Produit(2, "Lenovo", 290.6, 11);
        Produit produit3 = new Produit(3, "Lenovo", 320.1, 12);

        service.Ajouter(produit3);
        service.Ajouter(produit2);

      
        service.Afficher();

      
        service.Supprimer(3);

    
        service.Afficher();

       
        Produit produitMiseAJour = new Produit(200, "Hp", 1, 50);
        service.MiseAJour(produitMiseAJour);
        service.Afficher();
    }
}
