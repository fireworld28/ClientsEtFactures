package metier;

import java.time.LocalDate;

public class Facture
{
	private final Client client;
	private int numFactureOfClient;
	private int montant;
	private LocalDate datefacture;
	private boolean reglementfacture = false;
	
	
	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	public Client getClient()
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return this.montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return this.reglementfacture;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return this.datefacture;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		factures.remove(this.numFactureOfClient);
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		Facture f = new Facture();
		f.numclient = this.numclient;
		f.numFactureOfClient = this.numFactureOfClient;
		f.datefacture = this.datefacture;
		f.montant = this.montant;
		f.reglementfacture = this.reglementfacture;
		return f;
	}
}