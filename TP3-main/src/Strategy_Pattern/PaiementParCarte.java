package Strategy_Pattern;

public class PaiementParCarte implements PaiementStrategy{
	
	private String nom;
    private String numeroCarte;
    private String dateExpiration;
    private String codeSecurite;

    public PaiementParCarte(String nom, String numeroCarte, String dateExpiration, String codeSecurite) {
        this.nom = nom;
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.codeSecurite = codeSecurite;
    }

    public void payer(int montant) {
        // logique de paiement par carte
    }

}
