package Strategy_Pattern;

public class PaiementParPaypal implements PaiementStrategy{
	private String email;
    private String motDePasse;

    public PaiementParPaypal(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public void payer(int montant) {
        // logique de paiement par Paypal
    }


}
