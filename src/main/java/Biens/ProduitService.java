package Biens;
import java.util.ArrayList;
import Biens.Produit;


public class ProduitService {
	
	ArrayList<Produit>produits=new ArrayList<Produit>();
	
	private void validerProduit(Produit produit) {
		if (produit.getQuantite() < 0 || produit.getPrix() < 0) {
			throw new IllegalArgumentException ("La quantité et le prix du produit doivent être positifs");
		}	
	}
	
	public void Ajouter(Produit produit)
	{
		validerProduit(produit);
		for(int i=0;i<produits.size();i++)
		{
			if(produits.get(i).getId()==produit.getId() || produits.get(i).getNom()==produit.getNom())
			{
				throw new IllegalArgumentException("produit deja exist");
				
			}
		
		}
		produits.add(produit);
	}
	public ArrayList<Produit> RecupererTouts(){
		return produits;
	}
	
	public Produit RecupererParId(long id) {
		for(int i=0;i<produits.size();i++) {
			if(produits.get(i).getId() == id) {
				return produits.get(i);
			}
		}
		return null;
	}
	
	public void Afficher() {
		for(int i=0;i<produits.size();i++)
		{
			System.out.println(produits.get(i));
		}
	}
	
	public void Supprimer(long id) {
		for(int i = 0; i < produits.size(); i++) {
			if(produits.get(i).getId() == id) {
				produits.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("Le produit que vous recherchez n'existe plus");
	}
	
	public void MiseAJour(Produit produit) {
		validerProduit(produit);
		for(int i = 0; i < produits.size(); i++) {
			if(produits.get(i).getId() == produit.getId()) {
				produits.set(i, produit);
				return;
			}
		}
		throw new IllegalArgumentException("Le produit recherché n'est pas existant");
	}
	
	

}
