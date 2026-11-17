package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	private int numclient; 
	private String nom;
	private static int indexNumClient = 0;
	private int numFactureOfClient = 0;
	private List<Facture> factures = new ArrayList<>();
	private static List<Client> tousLesClients = new ArrayList<>();
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	
	public Client(String nom)
	{
		this.numclient = ++indexNumClient;
		this.nom = nom;
		tousLesClients.add(this);     		
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()
	{
		return nom;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		this.nom = nom;
		
		
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant)
	{
		Facture f = new Facture(this, ++dernierNumFacture, montant);
		factures.add(f);
		return f;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		List<Facture> copie = new ArrayList<>();
		return new ArrayList<>(factures);
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int total = 0;
		for (Facture f : factures) 
			{total += f.getMontant();}
		return total;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		Facture f = createFacture(montant);
		f.setReglee(reglee) ;
		return f ;
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		List<Facture> tempFactures = new ArrayList<>();
		for(Facture f : factures)
		{
			if (f.estReglee())
			{
				tempFactures.add(f);
			}
		}
		return tempFactures;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return new ArrayList<>(tousLesClients);
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
		tousLesClients.remove(this);
	}
}
