package Strategy_Pattern;

public class TestStrategyPattern {
	
	public static void main(String[] args) {

        // Création des articles à acheter
        Article article1 = new Article("Article 1", 50);
        Article article2 = new Article("Article 2", 100);

        // Paiement par carte
        PaiementStrategy paiementCarte = new PaiementParCarte("John Doe", "1234 5678 9012 3456", "12/24", "123");
        article1.payer(paiementCarte);
        article2.payer(paiementCarte);

        // Paiement par Paypal
        PaiementStrategy paiementPaypal = new PaiementParPaypal("john.doe@example.com", "motDePasse");
        article1.payer(paiementPaypal);
        article2.payer(paiementPaypal);
    }

}
