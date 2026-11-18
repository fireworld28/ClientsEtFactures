package metier;

import java.time.LocalDate;

public class Facture
{
	private final Client client;
	private int numFactureOfClient;
	private int montant;
	private LocalDate datefacture;
	private boolean reglementFacture = false;
	
	/**
	 * constructeur de l'objet Facture
	 * @param client
	 * @param numFactureOfClient
	 * @param montant
	 * @param datefacture
     * @param reglementFacture
	 */

	public Facture(Client client, int numFactureOfClient, int montant, LocalDate datefacture, boolean reglementFacture)
	{
		this.client = client;
		this.numFactureOfClient = ++numFactureOfClient;
		this.montant = montant;
		this.datefacture = datefacture;
        this.reglementFacture = reglementFacture;
	}

    /**
	 * -surchargeur du constructeur qui met directement que la facture est non payée
	 * -@param client
	 * -@param numFactureOfClient
	 * -@param montant
	 * -@param datefacture	 
	 */
	public Facture(Client client, int numFactureOfClient, int montant, LocalDate datefacture)
	{
		this(client, numFactureOfClient, montant, datefacture, false);
	}

	/**
	 * surchargeur du constructeur qui mets directement la date actuelle de la création de la facture
	 * @param client
	 * @param numFactureOfClient
	 * @param montant	 
	 */

	public Facture(Client client, int numFactureOfClient, int montant)
	{
		this(client, numFactureOfClient, montant, LocalDate.now());
	}

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
		return this.reglementFacture;
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
		this.client;
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
        Facture copie = new Facture(this.client, this.numFactureOfClient, this.montant, this.datefacture, this.reglementFacture);
		return copie ;
	}
}